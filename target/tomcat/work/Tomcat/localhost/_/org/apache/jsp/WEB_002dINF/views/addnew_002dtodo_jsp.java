/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-06-29 13:13:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addnew_002dtodo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/../common/navigation.jspf", Long.valueOf(1624972261562L));
    _jspx_dependants.put("/WEB-INF/views/../common/header.jspf", Long.valueOf(1624972288277L));
    _jspx_dependants.put("/WEB-INF/views/../common/footer.jspf", Long.valueOf(1624972130210L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Todos list</title>\r\n");
      out.write("<link href=\"webjars/bootstrap/5.0.1/css/bootstrap.min.css\" rel = \"stylesheet\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".footer {\r\n");
      out.write("\r\n");
      out.write("position: absolute;\r\n");
      out.write("bottom:0;\r\n");
      out.write("width: 100%;\r\n");
      out.write("height: 60px;\r\n");
      out.write("background-color:#f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("<nav class=\"navbar navbar-default\">\r\n");
      out.write("<a href =\"/\" class=\"navbar-brand\">Brand</a>\r\n");
      out.write("<ul class=\"nav navbar-nav\">\r\n");
      out.write("<li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("<li> <a href=\"/list-todo.do\">ToDos</a></li>\r\n");
      out.write("<li><a href=\"http://www.in28minutes.com\">In28Minutes</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("<ul class=\"nav navbar-nav right\">\r\n");
      out.write("<li><a href = \"/logout.do\">Logout</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("<div class = \"container\">\r\n");
      out.write("<h3>Put Your new action item here </h3>\r\n");
      out.write("\r\n");
      out.write("<form action=\"/add-todo.do\" method =\"post\">\r\n");
      out.write("Insert new Task : <br>\r\n");
      out.write("<fieldset class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("<label>Desciption: </label><input type = \"text\" name = \"newtask\" class=\"form-control\"/><br>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset class=\"form-group\">\r\n");
      out.write("<label>Category:</label>  <input type = \"text\" name = \"category\" class=\"form-control\"/><br>\r\n");
      out.write(" </fieldset>\r\n");
      out.write("<input type=\"submit\" value = \"Add Todo\" class=\"btn btn-success\">\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("<p>Footer Content</p></footer>\r\n");
      out.write("<script src = \"webjars/bootstrap/5.0.1/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src = \"webjars/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
