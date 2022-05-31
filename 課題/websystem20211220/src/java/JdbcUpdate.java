import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import java.sql.*;
import javax.servlet.ServletConfig;

public class JdbcUpdate extends HttpServlet {
    
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void destroy() {
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, java.io.IOException {
        Connection con = null;
        Statement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem", "root", "lanchi0209");

            stmt = con.createStatement();

            String no = request.getParameter("no");
            String name = request.getParameter("name");
            String price = request.getParameter("price");

            StringBuffer buf = new StringBuffer();
            buf.append("select * from fruit ");
            buf.append("' where no >= 4 ");
            buf.append(no);
            buf.append("'or name ="meron"");
            stmt.executeUpdate(buf.toString());
            
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}

            ServletContext cx = getServletContext();
            RequestDispatcher rd = cx.getRequestDispatcher("/JdbcFruitTable");

            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
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