/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.21
 * Generated at: 2018-09-07 17:45:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import student.com.pjo.Department;

public final class addRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("student.com.pjo.Department");
    _jspx_imports_classes.add("java.util.List");
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

List<Department> dpt=(List<Department>)request.getAttribute("Add");

      out.write("\r\n");
      out.write("<form action=\"record\" method=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("<table border=\"1px\"cellpadding=\"0\" cellspacing=\"0\" height=\"300px\"; width=\"40%\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" height=\"70px\" bgcolor=\"#993300\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"40%\" style=\" padding-left:20px; font-size:18px\">Name</td>\r\n");
      out.write("<td><input type=\"text\" name=\"u_name\" style=\"height:40px; width:100%; background-color:#CCCCCC;\"placeholder=\"  Enter Your Name \"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"40%\" style=\" padding-left:20px; font-size:18px\">Email Id</td>\r\n");
      out.write("<td><input type=\"text\" name=\"u_age\" style=\"height:40px; width:100%; background-color:#CCCCCC;\"placeholder=\"  Enter Your Age\"></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write(" <td width=\"40%\" style=\" padding-left:20px; font-size:18px\">Gender</td>\r\n");
      out.write("<td height=\"40px\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("Male<input type=\"radio\" value=\"male\" name=\"gender\">\r\n");
      out.write("Female<input type=\"radio\" value=\"female\" name=\"gender\">\r\n");
      out.write("Other<input type=\"radio\" value=\"other\" name=\"gender\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"40%\" style=\" padding-left:20px; font-size:18px\">Branch</td>\r\n");
      out.write("<td>\r\n");
if(dpt!=null){ 
      out.write(" \r\n");
      out.write("<select name=\"dept\" style=\"height:40px; width:50%; margin-left:10px; font-size:26px;\">\r\n");
      out.write("<option>select</option>\r\n");
for(Department dd:dpt){
      out.write("\r\n");
      out.write("<option value='");
      out.print(dd.getDeparmentId());
      out.write('\'');
      out.write('>');
      out.write(' ');
      out.print(dd.getDepartmentName());
      out.write(" </option>\r\n");
}
      out.write("\r\n");
      out.write("</select>\r\n");
}
      out.write("\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td colspan=\"2\" height=\"50px\" bgcolor=\"#0000FF\">\r\n");
      out.write("<input type=\"submit\" value=\"Add\" style=\"height:35px; width:15%; margin-left:170px;font-size:24px\">\r\n");
      out.write("<input type=\"reset\" value=\"Clear\" style=\"height:35px; width:15%;font-size:24px\">\r\n");
      out.write("<a href=\"Index.jsp\" style=\"text-decoration:none; background-color:#E0E0E0;border:1px solid #000000; font-size:28px;\">Home</a>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</center>\r\n");
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
