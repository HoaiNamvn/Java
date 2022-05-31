package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class JdbcFruitTable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


// サーブレットのinitメソッドに相当
public void jspInit() {
    try {
        // JDBCドライバをロード
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Fruitテーブルの内容(JSP版)</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<P>JSPによるデータベースのアクセス</P>\n");
      out.write("<table border='1'><tr><th>NO</th><th>NAME</th><th>PRICE</th></tr>\n");
      out.write("\n");

        // データベースへのアクセス開始
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // データベースに接続するConnectionオブジェクトの取得
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem", "root", "lanchi0209");
            // データベース操作を行うためのStatementオブジェクトの取得
            stmt = con.createStatement();
            // SQL()を実行して、結果を得る
            rs = stmt.executeQuery("select no, name, price from fruit");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {

      out.write("\n");
      out.write("                <tr>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <td>");
      out.print( rs.getInt("no"));
      out.write("</td>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <td>");
      out.print( rs.getString("name"));
      out.write("</td>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <td>");
      out.print( rs.getInt("price"));
      out.write("</td>\n");
      out.write("                </tr>\n");

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // データベースとの接続をクローズ
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}
        }

      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
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
