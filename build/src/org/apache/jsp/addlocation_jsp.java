package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class addlocation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Add Product</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Law a Society & People Category Flat Bootstrap responsive Website Template | Home :: w3layouts</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Law Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,400,300,600,700|Six+Caps' rel='stylesheet' type='text/css' />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-top-starts-->\n");
      out.write("\t<div class=\"header-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head-main\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.html\">LAW</a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"hea-rgt\">\n");
      out.write("\t\t\t\t<a href=\"#\">Get Appointment</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"navigation\">\n");
      out.write("\t\t\t\t <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.navbar-header-->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t <li class=\"active\"><a href=\"index.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"practice.html\">Practice</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"clients.html\">Clients</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"resources.html\">Resources</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"typo.html\">Typo</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--/.navbar-collapse-->\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!--header-top-end-->\n");
      out.write("\t<!--start-header-->\n");
      out.write("\t<div class=\"header\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head\">\n");
      out.write("\t\t\t\t<div class=\"soc\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"fb\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"twit\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"pin\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"rss\"> </span></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><span class=\"drbl\"> </span></a></li>\n");
      out.write("                                                <!--<div class=\"clearfix\"></div>-->\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"header-right\">\n");
      out.write("\t\t\t\t\t<div class=\"search-bar\">\n");
      out.write("\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"Search\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(\"span.menu\").click(function(){\n");
      out.write("\t\t\t\t$(\" ul.navig\").slideToggle(\"slow\" , function(){\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t<!-- script-for-menu -->\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t");
      out.write("\r\n");
      out.write("         <div class=\"container\">\r\n");
      out.write("    <h1>Add Police Station</h1>\r\n");
      out.write("    <form action=\"ajax1.jsp\" method=\"post\" enctype=\"multipart/form-data\" name=\"form1\" id=\"form1\">\r\n");
      out.write("      <table width=\"739\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"42\">State Name</td>\r\n");
      out.write("          <td><label for=\"state\"></label>\r\n");
      out.write("             &nbsp<select name=\"state\" id=\"state\"  required>\r\n");
      out.write("              <option value=\"\">Choose State</option>\r\n");
      out.write("              ");

                    String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
                  try
                  {
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="select * from statetable";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          ResultSet myresult=mystatement.executeQuery();
                          if(myresult.next())
                          {
                              do
                              {
                                out.println("<option value=" + myresult.getString("stateid") + ">" + myresult.getString("statename") +"</option>");
                              }
                              while(myresult.next());
                                 
                          }
                          else
                          {
                              out.println("no state available");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("error in query" + e.getMessage());
                      }
                      finally
                      {
                          myconnection.close();
                      }
                  }
                  catch(Exception e)
                  {
                      out.println("Error in Connection " + e.getMessage());
                  }  
              
              
              
              
              
              
      out.write("\r\n");
      out.write("          </select></td>\r\n");
      out.write("          <td><div id=\"message\"></div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td height=\"42\">City Name</td>\r\n");
      out.write("          <td>\r\n");
      out.write("              <div id=\"selectbox\">&nbsp;\r\n");
      out.write("                <select name=\"city\" id=\"city\" required>\r\n");
      out.write("                <option value=\"\">Choose State First</option>\r\n");
      out.write("            \r\n");
      out.write("              </select>\r\n");
      out.write("              </div>\r\n");
      out.write("             \r\n");
      out.write("          </td>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td width=\"217\" height=\"42\">Police Station Name</td>\r\n");
      out.write("          <td width=\"270\"><label for=\"name\"></label>\r\n");
      out.write("          &nbsp;<input type=\"text\" name=\"name\" id=\"name\" required></td>\r\n");
      out.write("          <td width=\"222\">&nbsp;</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Address</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"address\"></label>\r\n");
      out.write("          &nbsp;<input type=\"text\" name=\"address\" id=\"address\" required></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Name of SHO</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"shoname\"></label>\r\n");
      out.write("            <label for=\"shoname\"></label>\r\n");
      out.write("            <input type=\"text\" name=\"shoname\" id=\"shoname\" required></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Phone</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"phone\"></label>\r\n");
      out.write("           &nbsp;<input type=\"text\" name=\"phone\" id=\"phone\" required onKeyPress=\"return abc(event)\" maxlength=\"10\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>Image</td>\r\n");
      out.write("          <td colspan=\"2\"><label for=\"image2\"></label>\r\n");
      out.write("            &nbsp;\r\n");
      out.write("            <input type=\"file\" name=\"image2\" id=\"image2\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("          <td colspan=\"2\"><input type=\"submit\" name=\"Submit\" id=\"Submit\" value=\"Add Police Station\">\r\n");
      out.write("          <input type=\"reset\" name=\"Reset\" id=\"Reset\" value=\"Reset\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>&nbsp;</td>\r\n");
      out.write("          <td colspan=\"2\">\r\n");
      out.write("<div id=\"message2\"></div></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </table>\r\n");
      out.write("    </form>\r\n");
      out.write("        <script src=\"js/jquery-1.11.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script src=\"js/jquery.validate.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function abc(evt)\r\n");
      out.write("       {\r\n");
      out.write("\t   \t\r\n");
      out.write("          var charCode = (evt.which) ? evt.which : event.keyCode;\r\n");
      out.write("\t\t   if (charCode >= 48 && charCode<=57 || charCode==8)\r\n");
      out.write("             return true;\r\n");
      out.write("\r\n");
      out.write("          return false; \r\n");
      out.write("          \r\n");
      out.write("       }\r\n");
      out.write("     \r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("             $(\"#form1\").validate();\r\n");
      out.write("            $(\"#state\").change(function() {\r\n");
      out.write("                var b=$(this).val();\r\n");
      out.write("                \r\n");
      out.write("               \r\n");
      out.write("                $.ajax({\r\n");
      out.write("                        url:'ajax.jsp',\r\n");
      out.write("                        type:'post',\r\n");
      out.write("                        data:{stateid:b},\r\n");
      out.write("                        beforeSend: function () {\r\n");
      out.write("                        $(\"#message\").html(\"<img src=images/preloader.gif>\")\r\n");
      out.write("                        },\r\n");
      out.write("                        success:function(x) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message\").html(\"\")\r\n");
      out.write("                      \t                        \r\n");
      out.write("                        $(\"#selectbox\").html(x)\t\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function(e) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message\").html(\"error\" + e);\r\n");
      out.write("                        }\r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("               $.validator.setDefaults({\r\n");
      out.write("\t\tsubmitHandler: function() {\r\n");
      out.write("                \r\n");
      out.write("                var formData = new FormData($(\"#form1\")[0]);\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                        url:'ajax1.jsp',\r\n");
      out.write("                        type:'post',\r\n");
      out.write("                        data:formData,\r\n");
      out.write("                        contentType: false,\r\n");
      out.write("                        cache: false,\r\n");
      out.write("                        processData: false,\r\n");
      out.write("                        beforeSend: function () {\r\n");
      out.write("                        $(\"#message\").html(\"<img src=images/preloader.gif>\")\r\n");
      out.write("                        },\r\n");
      out.write("                        success:function(x) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message\").html(\"\")\t\r\n");
      out.write("                        $(\"#message2\").html(x)\t\r\n");
      out.write("                        },\r\n");
      out.write("                        error: function(e) \r\n");
      out.write("                        {\r\n");
      out.write("                        $(\"#message\").html(\"error\" + e);\r\n");
      out.write("                        }\r\n");
      out.write("                });\r\n");
      out.write("   \r\n");
      out.write("                        \r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("        </script>\r\n");
      out.write("        </div>\r\n");
      out.write("          ");
      out.write("<!-- footer-starts -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t<h4>Address</h4>\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-map-marker\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t</span></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<address>\n");
      out.write("\t\t\t\t\t\t  795 Folsom Ave, Suite 600<br>\n");
      out.write("\t\t\t\t\t\t  San Francisco, CA 94107<br>\n");
      out.write("\t\t\t\t\t\t  <abbr title=\"Phone\">P :</abbr> (123) 456-7890\n");
      out.write("\t\t\t\t\t\t</address>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t<h4>Phone/Fax</h4>\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-phone\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t</span></div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Phone : +1234567890 </p>\n");
      out.write("\t\t\t\t\t<p>Phone : +1234567890 </p>\n");
      out.write("\t\t\t\t\t<p>Fax : +1234567890 </p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 contact-left\">\n");
      out.write("\t\t\t\t<h4>Newsletter</h4>\n");
      out.write("\t\t\t\t\t<div class=\"cont-tp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\">\n");
      out.write("\t\t\t\t\t</span></div>\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"Enter Your email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Enter Your email';}\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Subscribe\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"footer-text\">\n");
      out.write("\t\t\t\t<p>© 2016 Law. All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- footer-end -->\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
