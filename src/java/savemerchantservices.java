
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import vmm.*;

public class savemerchantservices extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String checkvalues = request.getParameter("checkvalues");
            String chk[] = checkvalues.split("~~");
            HttpSession session = request.getSession();
            String merchantemail = session.getAttribute("merchantemail").toString();
            ResultSet rs1 = DBLoader.executeQuery("select * from merchant_info where email='" + merchantemail + "'");
            String mid = "";
            if (rs1.next()) {
                mid = rs1.getString("mid");
            }
            ResultSet rs3 = DBLoader.executeQuery("select * from merchantservices where mid='" + mid + "' ");
            while (rs3.next()) {
                rs3.deleteRow();
            }
            for (int i = 0; i < chk.length; i++) {
                ResultSet rs2 = DBLoader.executeQuery("select * from merchantservices  ");

                rs2.moveToInsertRow();
                rs2.updateString("mid", mid);
                rs2.updateString("serviceid", chk[i]);
                rs2.insertRow();

            }
            out.println("success");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
