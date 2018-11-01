package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class merchantBookings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery-1.12.4.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"js/jquery.rateyo.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"css/jquery.rateyo.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            var bookingid, serviceinfo;\n");
      out.write("\n");
      out.write("            function show() {\n");
      out.write("//                document.getElementById(\"logindiv\").style.display = 'none';\n");
      out.write("//                document.getElementById(\"otp\").value = \"\";\n");
      out.write("//                document.getElementById(\"email\").value = \"\";\n");
      out.write("//                document.getElementById(\"name\").value = \"\";\n");
      out.write("//                document.getElementById(\"mobile\").value = \"\";\n");
      out.write("//                document.getElementById(\"lpassword\").value = \"\";\n");
      out.write("                $(\"#myModal\").modal('show');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function fetch()\n");
      out.write("            {\n");
      out.write("                var xml = new XMLHttpRequest();\n");
      out.write("                xml.onreadystatechange = function ()\n");
      out.write("                {\n");
      out.write("                    if (xml.readyState == 4 && xml.status == 200)\n");
      out.write("                    {\n");
      out.write("                        var res = xml.responseText.trim();\n");
      out.write("\n");
      out.write("                        alert(res);\n");
      out.write("                        var mainjson = JSON.parse(res);\n");
      out.write("                        var jsa = mainjson[\"ans\"];\n");
      out.write("\n");
      out.write("                        var ans = \"\";\n");
      out.write("                        ans += \"<table class='table table-hover'>\";\n");
      out.write("\n");
      out.write("                        ans += \"<thead class='bg-primary'>\";\n");
      out.write("                        ans += \"<tr> <td>Booking_id</td> <td>Service_name</td> <td>Customer_Mobile</td><td>Address</td><td>Date</td><td>Time</td><td>CustomerName</td><td>Generate Bill</td></tr>\";\n");
      out.write("                        ans += \"</thead>\";\n");
      out.write("\n");
      out.write("                        ans += \"<tbody>\";\n");
      out.write("\n");
      out.write("\n");
      out.write("                        for (var i = 0; i < jsa.length; i++)\n");
      out.write("                        {\n");
      out.write("                            var js = jsa[i];\n");
      out.write("                            ans += \"<tr>\";\n");
      out.write("                            ans += \"<td>\" + js[\"booking_id\"] + \"</td>\";\n");
      out.write("                            ans += \"<td>\" + js[\"customermobile\"] + \"</td>\";\n");
      out.write("                            ans += \"<td>\" + js[\"address\"] + \"</td>\";\n");
      out.write("                            ans += \"<td>\" + js[\"servicedate\"] + \"</td>\";\n");
      out.write("                            ans += \"<td>\" + js[\"time\"] + \"</td>\";\n");
      out.write("                            ans += \"<td>\" + js[\"service_name\"] + \"</td>\";\n");
      out.write("                            ans += \"<td>\" + js[\"name\"] + \"</td>\";\n");
      out.write("                            // ans += \"<td><input type='button' value='Service Complete' class='btn btn-success' onclick='generateotp()' /></td>\";\n");
      out.write("\n");
      out.write("\n");
      out.write("                            var str = JSON.stringify(js);\n");
      out.write("\n");
      out.write("                            if (js[\"status\"] === \"confirm\")\n");
      out.write("\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                ans += \"<td><input type='button' value='Service Complete' class='btn btn-success' onclick='generateotp(\" + js[\"booking_id\"] + \",\" + str + \") ' /></td>\";\n");
      out.write("\n");
      out.write("                            } else if (js[\"status\"] === \"billed\")\n");
      out.write("                            {\n");
      out.write("                                ans += \"<td> bill generated</td>\";\n");
      out.write("                            } else if (js[\"status\"] === \"paid\")\n");
      out.write("                            {\n");
      out.write("                                ans += \"<td> bill paid</td>\";\n");
      out.write("                                ans += \"<td> <input type='button' class='btn btn-default' value='View Rating' onclick='viewRating(\" + js[\"booking_id\"] + \")'>  </td> \"\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("\n");
      out.write("                            ans += \"</tr>\";\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        ans += \"</tbody>\";\n");
      out.write("                        ans += \"</table>\";\n");
      out.write("\n");
      out.write("                        document.getElementById(\"d1\").innerHTML = ans;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xml.open(\"GET\", \"./FetchMerchantBookingDetails\", true);\n");
      out.write("                xml.send();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function  generateotp(booking_id, js)\n");
      out.write("\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                serviceinfo = js;\n");
      out.write("\n");
      out.write("                bookingid = booking_id;\n");
      out.write("\n");
      out.write("                var xmlhttp = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                xmlhttp.onreadystatechange = function ()\n");
      out.write("\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    if (xmlhttp.readyState === 4 && xmlhttp.status === 200)\n");
      out.write("\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        var res = xmlhttp.responseText.trim();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        alert(res);\n");
      out.write("\n");
      out.write("                        if (res === \"success\")\n");
      out.write("\n");
      out.write("                        {\n");
      out.write("\n");
      out.write("                            $(\"#myModal\").modal('show');\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                xmlhttp.open(\"GET\", \"./generateBookOtp?bookingid=\" + booking_id + \"&opr=sendotp\", true);\n");
      out.write("\n");
      out.write("                xmlhttp.send();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function verify()\n");
      out.write("\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                var otp = document.getElementById(\"otp\").value;\n");
      out.write("\n");
      out.write("                var xmlhttp = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                xmlhttp.onreadystatechange = function ()\n");
      out.write("\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    if (xmlhttp.readyState === 4 && xmlhttp.status === 200)\n");
      out.write("\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        var res = xmlhttp.responseText.trim();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        if (res == \"verified\") {\n");
      out.write("\n");
      out.write("                            alert(\"otp verified\");\n");
      out.write("\n");
      out.write("                            $(\"#myModal\").modal(\"hide\");\n");
      out.write("\n");
      out.write("                            document.getElementById(\"servicename\").innerHTML = serviceinfo[\"service_name\"];\n");
      out.write("                            var servicetype = serviceinfo[\"servicetype\"];\n");
      out.write("                            document.getElementById(\"servicetype\").innerHTML = servicetype;\n");
      out.write("\n");
      out.write("                            if (servicetype == \"Price per Hour Service\")\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"priceperhour\").style.display = \"block\";\n");
      out.write("                                document.getElementById(\"pph\").innerHTML = serviceinfo[\"priceperhour\"];\n");
      out.write("                            } else if (servicetype == \"Fixed Price Service\")\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"fixedprice\").style.display = \"block\";\n");
      out.write("                                document.getElementById(\"fp\").innerHTML = serviceinfo[\"fixedprice\"];\n");
      out.write("                            } else if (servicetype == \"Dynamic Price Service\")\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"dynamicprice\").style.display = \"block\";\n");
      out.write("                                document.getElementById(\"dp\").innerHTML = serviceinfo[\"dynamicprice\"];\n");
      out.write("\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            $(\"#myModal1\").modal(\"show\");\n");
      out.write("\n");
      out.write("                        } else {\n");
      out.write("\n");
      out.write("                            alert(\"otp not match\");\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                xmlhttp.open(\"GET\", \"./generateBookOtp?otp=\" + otp + \"&opr=verify\" + \"&bookingid=\" + bookingid, true);\n");
      out.write("\n");
      out.write("                xmlhttp.send();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function billpph() {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                var price = parseInt(document.getElementById(\"pph\").innerHTML);\n");
      out.write("\n");
      out.write("                var hours = parseInt(document.getElementById(\"tpph\").value);\n");
      out.write("\n");
      out.write("                alert(price + \"---\" + hours);\n");
      out.write("\n");
      out.write("                var total = price * hours;\n");
      out.write("\n");
      out.write("                document.getElementById(\"tp\").innerHTML = total;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function billdp() {\n");
      out.write("\n");
      out.write("\n");
      out.write("                var price = parseInt(document.getElementById(\"dp\").innerHTML);\n");
      out.write("\n");
      out.write("                var variablePrice = parseInt(document.getElementById(\"tdp\").value);\n");
      out.write("                alert(price + variablePrice);\n");
      out.write("                var total = price + variablePrice;\n");
      out.write("\n");
      out.write("                document.getElementById(\"tp\").innerHTML = total;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function billfp() {\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                var price = parseInt(document.getElementById(\"fp\").innerHTML);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                var service = parseInt(document.getElementById(\"tfp\").value);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                var total = price * service;\n");
      out.write("\n");
      out.write("                document.getElementById(\"tp\").innerHTML = total;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function valuesubmit()\n");
      out.write("            {\n");
      out.write("                var value = document.getElementById(\"tp\").innerHTML;\n");
      out.write("                alert(value);\n");
      out.write("                var xmlhttp = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                xmlhttp.onreadystatechange = function ()\n");
      out.write("\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    if (xmlhttp.readyState === 4 && xmlhttp.status === 200)\n");
      out.write("\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        var res = xmlhttp.responseText.trim();\n");
      out.write("                        if (res == \"success\")\n");
      out.write("                        {\n");
      out.write("                            $(\"#myModal1\").modal(\"hide\");\n");
      out.write("\n");
      out.write("                            fetch();\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xmlhttp.open(\"GET\", \"./generateBill?opr=\" + value + \"&bookingid=\" + bookingid, true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function viewRating(bookingid)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                $(\"#myModal2\").modal(\"show\");\n");
      out.write("                var xmlhttp = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                xmlhttp.onreadystatechange = function ()\n");
      out.write("\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    if (xmlhttp.readyState === 4 && xmlhttp.status === 200)\n");
      out.write("\n");
      out.write("                    {\n");
      out.write("\n");
      out.write("                        var res = xmlhttp.responseText.trim();\n");
      out.write("                        var mainjson = JSON.parse(res);\n");
      out.write("                        var jsa = mainjson[\"ans\"];\n");
      out.write("                        var js = jsa[0];\n");
      out.write("                        var rating = js[\"rating\"];\n");
      out.write("                        var comment = js[\"comment\"];\n");
      out.write("                        document.getElementById(\"comments\").innerHTML = comment;\n");
      out.write("                        $('#ratings').rateYo({\n");
      out.write("                            rating: rating,\n");
      out.write("                            readOnly: true\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                xmlhttp.open(\"GET\", \"./ViewMerchantRating?bookingid=\" + bookingid, true);\n");
      out.write("\n");
      out.write("                xmlhttp.send();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"fetch()\">\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MerchantLogoutNavbar.jsp", out, false);
      out.write("\n");
      out.write("        <div id=\"d1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("                        <h4 class=\"modal-title\">Confirm OTP</h4>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\n");
      out.write("                                    <label class=\"control-label col-sm-4\" for=\"mobile\">Enter OTP</label>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                                        <input id=\"otp\"  type=\"password\" placeholder=\"Enter OTP Sent to Entered customer Mobile No\" class=\"form-control\" required /><br>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input type=\"button\" value=\"Submit\" class=\"btn btn-success \" style=\"margin-left: 195px;\" onclick=\"verify()\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"myModal1\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("                        <h4 class=\"modal-title\">Generate bill</h4>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <label  col-sm-4> Service Name</label><label col-sm-8 id=\"servicename\"></label>\n");
      out.write("\n");
      out.write("                        <label  col-sm-4> Service Type</label><label col-sm-8 id=\"servicetype\"></label>>\n");
      out.write("\n");
      out.write("                        <div id=\"priceperhour\" style=\"display:none\">\n");
      out.write("\n");
      out.write("                            <label> Price per hour</label>\n");
      out.write("\n");
      out.write("                            <label id=\"pph\" ></label>\n");
      out.write("\n");
      out.write("                            <label> No of hours</label>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"tpph\" onkeyup=\"billpph()\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"fixedprice \"  style=\"display:none\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <label>Fixed Price</label>\n");
      out.write("\n");
      out.write("                            <label id=\"fp\" ></label>\n");
      out.write("\n");
      out.write("                            <label> No of services </label>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"tfp\" onkeyup=\"billfp()\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"dynamicprice\" style=\"display:none\">\n");
      out.write("\n");
      out.write("                            <label> Minimum  Price</label>\n");
      out.write("\n");
      out.write("                            <label id=\"dp\" ></label>\n");
      out.write("\n");
      out.write("                            <label> Total Extra Charges</label>\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Extra Charges\" id=\"tdp\" onkeyup=\"billdp()\"/>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <label>Total Price</label>\n");
      out.write("\n");
      out.write("                        <label id=\"tp\"></label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <button type=\"button\" onclick=\"valuesubmit()\" class=\"btn btn-default\">submit</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"myModal2\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\n");
      out.write("                        <h4 class=\"modal-title\">View My Ratings</h4>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <form class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>RATINGS</label>\n");
      out.write("                                        <div id=\"ratings\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <label>Comments</label>\n");
      out.write("                                        <label id=\"comments\"></label>\n");
      out.write("\n");
      out.write("                                        <!--<input id=\"otp\"  type=\"password\" placeholder=\"Enter OTP Sent to Entered customer Mobile No\" class=\"form-control\" required /><br>-->\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!--<input type=\"button\" value=\"Submit\" class=\"btn btn-success \" style=\"margin-left: 195px;\" onclick=\"verify()\" />-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}