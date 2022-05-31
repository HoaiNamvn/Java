/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletConfig;


public class JdbcFruitTable extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>FRUIT_TBLテーブルの内容</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border=\"1\"><tr><th>番号</th><th>名前</th><th>金額</th></tr>");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem", "root", "lanchi0209");

            stmt = con.createStatement();

            rs = stmt.executeQuery("select no, name, price from fruit");
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("no") + "</td>" );
                out.println("<td>" + rs.getString("name") + "</td>" );
                out.println("<td>" + rs.getInt("price") +  "</td>" );
                out.println("</tr>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processRequest(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        processRequest(request, response);
    }
    
    public String getServletInfo() {
        return "Short description";
    }
    
}