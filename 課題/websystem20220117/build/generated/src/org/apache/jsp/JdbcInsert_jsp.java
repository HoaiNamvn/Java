package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class JdbcInsert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


// ???????init???????
public void jspInit() {
    try {
        // JDBC????????
        Class.forName("com.mysql.jdbc.Driver");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

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
      response.setContentType("text/html  pageEncoding=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>CUSTOMER_TBL?????Insert(JSP?)</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<P>JSP??????????Insert</P>\n");
      out.write("\n");

        Connection con = null;
        Statement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem", "root", "lanchi0209");

            stmt = con.createStatement();

            String no = request.getParameter("no");
            String name = request.getParameter("name");
            String price = request.getParameter("price");

            StringBuffer buf = new StringBuffer();
            buf.append("insert into fruit (");
            buf.append("no, name, price) ");
            buf.append("values (");
            buf.append(no);
            buf.append(",'");
            buf.append(name);
            buf.append("','");
            buf.append(price);
            buf.append("')");
            stmt.executeUpdate(buf.toString());

            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}

        } catch (Exception e) {
            e.printStackTrace();
        }

      out.write('\n');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("JdbcFruitTable.jsp");
        return;
      }
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
