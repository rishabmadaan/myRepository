package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showsubcategories_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" >\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("        <link href=\"css/style_1.css\" rel='stylesheet' type='text/css' media=\"all\">\n");
      out.write("        <link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /><!-- //pop-ups-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Montserrat:400,500,600\" rel=\"stylesheet\">\n");
      out.write("        <script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            ");

                String id = request.getParameter("id");
                String name = request.getParameter("name");
                if (session.getAttribute("mobile") != null) {
            
      out.write("\n");
      out.write("            sessionStorage.setItem(\"mobile\", \"");
      out.print(session.getAttribute("mobile"));
      out.write("\");\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("\n");
      out.write("            var alreadyexit, jsaservices, selectedserviceid, customermobile;\n");
      out.write("            function getSubCategories(cid)\n");
      out.write("            {\n");
      out.write("                var xml = new XMLHttpRequest();\n");
      out.write("                xml.onreadystatechange = function ()\n");
      out.write("                {\n");
      out.write("                    if (xml.readyState == 4 && xml.status == 200)\n");
      out.write("                    {\n");
      out.write("                        var res = xml.responseText.trim();\n");
      out.write("                        var mainjson = JSON.parse(res);\n");
      out.write("                        var jsa = mainjson[\"ans\"];\n");
      out.write("                        var ans = \"\";\n");
      out.write("                        for (var i = 0; i < jsa.length; i++)\n");
      out.write("                        {\n");
      out.write("                            var js = jsa[i];\n");
      out.write("                            var subcategory_id = js[\"subcategory_id\"];\n");
      out.write("                            var subcategory_name = js[\"subcategory_name\"];\n");
      out.write("                            var icon = js[\"icon\"];\n");
      out.write("                            ans += \"<div onclick=\\\"showservices(\" + js[\"subcategory_id\"] + \")\\\" class=\\\"col-sm-4 col-xs-4 agile_gallery_grid\\\">\";\n");
      out.write("                            if (i >= 3)\n");
      out.write("                            {\n");
      out.write("                                ans += \"<div class=\\\"w3ls_gallery_grid-low\\\">\";\n");
      out.write("                            } else\n");
      out.write("                            {\n");
      out.write("                                ans += \"<div class=\\\"w3ls_gallery_grid-top\\\">\";\n");
      out.write("                            }\n");
      out.write("                            ans += \"<a  class=\\\"lsb-preview wthree_p_grid\\\" data-lsb-group=\\\"header\\\">\";\n");
      out.write("                            ans += \"<img src=\\\"\" + js[\"icon\"] + \"\\\" alt=\\\" \\\" class=\\\"img-responsive\\\" />\";\n");
      out.write("                            ans += \"<div class=\\\"agileinfo_content_wrap\\\">\";\n");
      out.write("                            ans += \"<div class=\\\"agileits_content\\\">\";\n");
      out.write("                            ans += \"<h3>\" + js[\"subcategory_name\"] + \"</h3>\";\n");
      out.write("                            ans += \"<p>\" + js[\"description\"] + \"</p>\";\n");
      out.write("                            ans += \"</div>\";\n");
      out.write("                            ans += \"</div>\";\n");
      out.write("                            ans += \"</a>\";\n");
      out.write("                            ans += \"</div>\";\n");
      out.write("                            ans += \"<div class=\\\"clearfix\\\"> </div>\";\n");
      out.write("                            ans += \"</div>\";\n");
      out.write("                        }\n");
      out.write("                        document.getElementById(\"subcatdiv\").innerHTML = ans;\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xml.open(\"GET\", \"./getSubCategories?category_id=\" + cid, true);\n");
      out.write("                xml.send();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function showservices(sid)\n");
      out.write("            {\n");
      out.write("                var ans = \"\";\n");
      out.write("                var xml = new XMLHttpRequest();\n");
      out.write("                xml.onreadystatechange = function ()\n");
      out.write("                {\n");
      out.write("                    if (xml.readyState == 4 && xml.status == 200)\n");
      out.write("                    {\n");
      out.write("                        var res = xml.responseText.trim();\n");
      out.write("\n");
      out.write("                        var mainjson = JSON.parse(res);\n");
      out.write("                        var jsa = mainjson[\"ans\"];\n");
      out.write("                        jsaservices = jsa;\n");
      out.write("                        ans += \"<div class=\\\"row \\\">\";\n");
      out.write("                        ans += \"<div class=\\\"col-sm-12 \\\">\";\n");
      out.write("                        for (var i = 0; i < jsa.length; i++)\n");
      out.write("                        {\n");
      out.write("                            var js = jsa[i];\n");
      out.write("                            var serviceid = js[\"service_id\"];\n");
      out.write("                            var sername = js[\"service_name\"];\n");
      out.write("\n");
      out.write("                            ans += \"<a href=\\\"#\\\"   onclick=\\\"showservicesdetailmodal(\" + i + \")\\\" style='margin-top:20px'>\";\n");
      out.write("                            ans += \"<h3>\" + sername + \"</h3>\";\n");
      out.write("                            ans += \"</a>\";\n");
      out.write("\n");
      out.write("\n");
      out.write("                        }\n");
      out.write("                        ans += \"</div>\";\n");
      out.write("                        ans += \"</div>\";\n");
      out.write("                        document.getElementById(\"servicesdiv\").innerHTML = ans;\n");
      out.write("                        $(\"#mymodalservices\").modal('show');\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                xml.open(\"GET\", \"./getServices?subcategory_id=\" + sid, false);\n");
      out.write("                xml.send();\n");
      out.write("            }\n");
      out.write("            function showservicesdetailmodal(index) {\n");
      out.write("\n");
      out.write("                var ans = \"\";\n");
      out.write("                $(\"#mymodalservices\").modal('hide');\n");
      out.write("                var js = jsaservices[index];\n");
      out.write("                selectedserviceid = js[\"service_id\"];\n");
      out.write("                var sername = js[\"service_name\"];\n");
      out.write("                var sertype = js[\"servicetype\"];\n");
      out.write("                var priceperhour = js[\"priceperhour\"];\n");
      out.write("                var dynamicprice = js[\"dynamicprice\"];\n");
      out.write("                var fixedprice = js[\"fixedprice\"];\n");
      out.write("                var serdesc = js[\"servicedescription\"];\n");
      out.write("\n");
      out.write("\n");
      out.write("                ans += \"<center><label>\" + sername + \"</label></center><br>\";\n");
      out.write("\n");
      out.write("                ans += \"<center><img src='\" + js[\"icon\"] + \"' style='width:200px;height:200px'></center>\";\n");
      out.write("\n");
      out.write("                ans += \"  <center><p> \" + serdesc + \"</p></center>\";\n");
      out.write("\n");
      out.write("//                ans += \"<div class='col-sm-offset-1 col-sm-4'>\" + sertype + \"</div>\";\n");
      out.write("//\n");
      out.write("//                ans += \"<div class='col-sm-offset-2 col-sm-5'>\";\n");
      out.write("//\n");
      out.write("//                if (sertype === \"Price per Hour Service\")\n");
      out.write("//                {\n");
      out.write("//                    ans += \"Price Per Hour  :\" + priceperhour;\n");
      out.write("//                } else if (sertype === \"Dynamic Price Service\")\n");
      out.write("//                {\n");
      out.write("//                    ans += \"Dynamic Price : \" + dynamicprice;\n");
      out.write("//                } else\n");
      out.write("//                {\n");
      out.write("//                    ans += \"Fixed Price :\" + fixedprice;\n");
      out.write("//                }\n");
      out.write("//\n");
      out.write("//                ans += \"</div>\";\n");
      out.write("\n");
      out.write("                ans += \"<center><label>\" + sertype + \"</label></center>\";\n");
      out.write("\n");
      out.write("                ans += \"<center><label>\";\n");
      out.write("\n");
      out.write("                if (sertype === \"Price per Hour Service\")\n");
      out.write("                {\n");
      out.write("                    ans += \"Price Per Hour  :\" + priceperhour;\n");
      out.write("                } else if (sertype === \"Dynamic Price Service\")\n");
      out.write("                {\n");
      out.write("                    ans += \"Dynamic Price : \" + dynamicprice;\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    ans += \"Fixed Price :\" + fixedprice;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                ans += \"</label></center>\";\n");
      out.write("\n");
      out.write("                ans += \"<input type=\\\"button\\\"  value=\\\"Book Service\\\" class=\\\"btn btn-default\\\"  onclick=\\\"checkLogin()\\\" />\";\n");
      out.write("                document.getElementById(\"servicedetaildiv\").innerHTML = ans;\n");
      out.write("                $(\"#mymodalservicesdetail\").modal('show');\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function checkLogin()\n");
      out.write("            {\n");
      out.write("                var customermobile = sessionStorage.getItem(\"mobile\")\n");
      out.write("                if (customermobile !== null && customermobile !== \"\")\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                } else\n");
      out.write("                {\n");
      out.write("                    $(\"#mymodalservicesdetail\").modal('hide');\n");
      out.write("                    $(\"#myModal\").modal('show');\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function passwordlogin() {\n");
      out.write("                var mobile = document.getElementById(\"mobile\").value;\n");
      out.write("                var password = document.getElementById(\"lpassword\").value;\n");
      out.write("                if (mobile == \"\") {\n");
      out.write("                    alert(\"enter mobile no\");\n");
      out.write("                } else if (mobile.length != 10) {\n");
      out.write("                    alert(\"mobile no must be of 10 digits\");\n");
      out.write("                } else if (isNaN(mobile)) {\n");
      out.write("                    alert(\"mobile no use numerals only\");\n");
      out.write("                } else if (password === \"\") {\n");
      out.write("                    alert(\"fill password\");\n");
      out.write("                } else {\n");
      out.write("                    var xmlhttp = new XMLHttpRequest();\n");
      out.write("                    xmlhttp.onreadystatechange = function ()\n");
      out.write("                    {\n");
      out.write("                        if (xmlhttp.readyState === 4 && xmlhttp.status === 200)\n");
      out.write("                        {\n");
      out.write("                            var res = xmlhttp.responseText.trim();\n");
      out.write("                            if (res === \"success\") {\n");
      out.write("                                customermobile = mobile;\n");
      out.write("                                $(\"#myModal\").modal(\"hide\");\n");
      out.write("                                sessionStorage.setItem(\"mobile\", mobile);\n");
      out.write("                                $(\"#mymodaladdress\").modal(\"show\");\n");
      out.write("                            } else {\n");
      out.write("                                alert(\"invalid mobile/password\");\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                    xmlhttp.open(\"GET\", \"./sendcustomerotp?mobile=\" + mobile + \"&password=\" + password + \"&opr=loginusingpassword\", true);\n");
      out.write("                    xmlhttp.send();\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function sendotp()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"otp\").value = \"\";\n");
      out.write("                document.getElementById(\"email\").value = \"\";\n");
      out.write("                document.getElementById(\"name\").value = \"\";\n");
      out.write("                document.getElementById(\"password\").value = \"\";\n");
      out.write("                var mobile = document.getElementById(\"mobile\").value;\n");
      out.write("                if (mobile == \"\") {\n");
      out.write("                    alert(\"enter mobile no\");\n");
      out.write("                } else if (mobile.length != 10) {\n");
      out.write("                    alert(\"mobile no must be of 10 digits\");\n");
      out.write("                } else if (isNaN(mobile)) {\n");
      out.write("                    alert(\"mobile no use numerals only\");\n");
      out.write("                } else {\n");
      out.write("                    var xmlhttp = new XMLHttpRequest();\n");
      out.write("                    xmlhttp.onreadystatechange = function ()\n");
      out.write("                    {\n");
      out.write("                        if (xmlhttp.readyState === 4 && xmlhttp.status === 200)\n");
      out.write("                        {\n");
      out.write("                            var res = xmlhttp.responseText.trim();\n");
      out.write("\n");
      out.write("                            if (res == \"alreadyexist\") {\n");
      out.write("                                alreadyexit = \"true\";\n");
      out.write("                                alert(\"User Already Registered /otp sent to mobile just enter and login\");\n");
      out.write("                            } else if (res == \"notexist\") {\n");
      out.write("                                alreadyexit = \"false\";\n");
      out.write("                                alert(\"First Time User/ otp sent to mobile fill other details and login\");\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    };\n");
      out.write("                    xmlhttp.open(\"GET\", \"./sendcustomerotp?mobile=\" + mobile + \"&opr=sendotp\", true);\n");
      out.write("                    xmlhttp.send();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"getSubCategories(");
      out.print(id);
      out.write(")\">\n");
      out.write("        <div class=\"header-w3layouts\"> \n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top top-nav-collapse\">\n");
      out.write("                <div class=\"navbar-header page-scroll\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("                        <span class=\"sr-only\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <h1><a class=\"navbar-brand\" href=\"index.html\">hous<span>ing</span>\n");
      out.write("                        </a></h1>\n");
      out.write("                </div> \n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <!-- Hidden li included to remove active class from about link when scrolled up past about section -->\n");
      out.write("                        <li class=\"hidden\"><a class=\"page-scroll\" href=\"#page-top\"></a>\t</li>\n");
      out.write("                        <li><a class=\"page-scroll\" href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("                        <li><a class=\"page-scroll scroll\" href=\"HomePage.jsp#about\">About</a></li>\n");
      out.write("                        <li><a class=\"page-scroll scroll\" href=\"HomePage.jsp#evennts\">Features</a></li>\n");
      out.write("                        <li><a class=\"page-scroll scroll\" href=\"HomePage.jsp#gallery\">Categories</a></li>\n");
      out.write("                        <li><a class=\"page-scroll scroll\" href=\"HomePage.jsp#team\">Merchants</a></li>\n");
      out.write("                        <li><a class=\"page-scroll scroll\" href=\"HomePage.jsp#contact\">Contact</a></li>\n");
      out.write("                        <li><a class=\"page-scroll scroll\" >LogIn/SignUp</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </nav>  \n");
      out.write("        </div>\n");
      out.write("        <div id=\"gallery\" class=\"gallery\" style=\"margin-top: 20px\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3 class=\"title-w3-agile\" >Sub Categories for ");
      out.print(name);
      out.write("</h3>\t\t\n");
      out.write("                <div class=\"agile_gallery_grids\" id=\"subcatdiv\">\t\n");
      out.write("\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Modal show Services-->\n");
      out.write("        <div id=\"mymodalservices\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\" style=\"color: #cc3300\">Choose a Service</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div id=\"servicesdiv\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--services detail model-->\n");
      out.write("        <div id=\"mymodalservicesdetail\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\" style=\"color: #cc3300\">Service Detail</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div id=\"servicedetaildiv\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Login Modal-->\n");
      out.write("        <div id=\"myModal\" class=\"modal fade\" role=\"dialog\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                <!-- Modal content-->\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                        <h4 class=\"modal-title\">Customer Login/Signup</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" for=\"email\">Enter Mobile </label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input id=\"mobile\" name=\"mobile\" type=\"tel\"  placeholder=\"Enter Mobile\" class=\"form-control\" required  /><br>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" for=\"password\">Enter Password </label>\n");
      out.write("                                <div class=\"col-sm-8\">   \n");
      out.write("                                    <input id=\"lpassword\" name=\"lpassword\" type=\"password\"  placeholder=\"Enter Password\" class=\"form-control\" required  />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <center>\n");
      out.write("                                    <input id=\"btpasswordlogin\" type=\"button\" value=\"Login Using Password\" class=\"btn btn-success \" onclick=\"passwordlogin()\" />\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <center>\n");
      out.write("                                    <input id=\"btsendotp\" type=\"button\" value=\"Send OTP\" class=\"btn btn-success \" onclick=\"sendotp()\" />\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\" id=\"otpdiv\" style=\"display: none\">\n");
      out.write("                                <label class=\"control-label col-sm-4\" for=\"password\">Enter OTP</label>\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <input id=\"otp\"  type=\"password\" placeholder=\"Enter OTP Sent to Entered Mobile No\" class=\"form-control\" required /><br>\n");
      out.write("\n");
      out.write("                                    <input id=\"btverify\" type=\"button\" value=\"Verify OTP\" class=\"btn btn-success \" onclick=\"verify()\" />\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"logindiv\" style=\"display: none\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\" for=\"name\">Enter Name</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <input id=\"name\" type=\"text\"  placeholder=\"Enter Name\" class=\"form-control\" required  />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\" for=\"email\">Enter Email</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <input id=\"email\" type=\"email\"  placeholder=\"Enter Email\" class=\"form-control\" required  />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label col-sm-4\" for=\"password\">Enter Password</label>\n");
      out.write("                                    <div class=\"col-sm-8\">\n");
      out.write("                                        <input id=\"password\" type=\"password\"  placeholder=\"Enter Password\" class=\"form-control\" required  />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <input type=\"button\" value=\"login\" class=\"btn btn-success \" style=\"margin-left: 195px;\" onclick=\"login() ajax()\" />\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </form> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
