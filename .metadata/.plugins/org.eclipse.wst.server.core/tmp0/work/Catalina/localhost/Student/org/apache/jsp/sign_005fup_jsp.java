/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.21
 * Generated at: 2018-09-11 10:56:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import student.com.pjo.SignUp;
import java.util.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("student.com.pjo.SignUp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Bootstrap/css/bootstrap.min.css\" />\r\n");
      out.write("<script  src=\"Bootstrap/js/jquery.js\"></script>\r\n");
      out.write("<script  src=\"Bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Welcome</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

String otp="";
String status="disabled";
String name="";
String mobile="";
String uId="";
String uPassword="";
Object obj=request.getAttribute("OTP");
SignUp us=null;
if(obj!=null){
us=(SignUp)obj;
name=us.getName();
mobile=us.getMobile();
uId=us.getLoginId();
uPassword=us.getLoginPassword();
otp=us.getOTP();
out.print(otp);
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"sign\" method=\"post\">\r\n");
      out.write("<table class=\"table table-bordered\" style=\"width:35%;height:400px; margin-top:20px\" align=\"center\" background=\"img/../img/img8.jpg\">\r\n");
      out.write("<tr style=\"height:100px;\">\r\n");
      out.write("<td colspan=\"2\" style=\"text-align:center;font-size:40px;background-color:#993300\">\r\n");
      out.write("Registration\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"35%\" style=\"color:white;font-size:18px\">User Name</td>\r\n");
      out.write("<td><input type=\"text\" name=\"u_name\" value=\"");
      out.print(name);
      out.write("\"style=\"height:40px; width:100%;border-radius:5px; font-size:20px\" autofocus=\"autofocus\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"color:white;font-size:18px\">Mobile No</td>\r\n");
      out.write("<td><input type=\"text\" value=\"");
      out.print(mobile);
      out.write("\"name=\"u_mobile\" maxlength=\"10\" type=\"text\" style=\"height:40px; width:100%;border-radius:5px;font-size:20px\" ></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"color:white;font-size:18px\">User ID</td>\r\n");
      out.write("<td><input type=\"text\" value=\"");
      out.print(uId);
      out.write("\" name=\"u_id\" type=\"text\" style=\"height:40px; width:100%;border-radius:5px;font-size:20px\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td style=\"color:white;font-size:18px\">User Password</td>\r\n");
      out.write("<td><input type=\"password\" value=\"");
      out.print(uPassword );
      out.write("\"name=\"u_password\"type=\"text\" style=\"height:40px; width:100%; border-radius:5px;font-size:20px\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr style=\"height:60px\">\r\n");
      out.write("<td colspan=\"2\">\r\n");
      out.write("<span style=\"color:white;font-size:18px\">OTP</span> &nbsp;<input type=\"text\" name=\"OTPP\" style=\"height:40px; width:30%;border-radius:5px;margin-left:70px\" maxlength=\"6\">\r\n");
      out.write("&nbsp;\r\n");
      out.write("<a><button class=\"btn btn-info active\">Send OTP</button></a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr style=\"height:60px\">\r\n");
      out.write("<td colspan=\"2\">\r\n");
      out.write("<input type=\"submit\" value=\"Sign-Up\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
