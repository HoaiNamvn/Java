<%-- 
    Document   : JdbcUpdate
    Created on : 2022/01/27, 12:57:32
    Author     : doanh
--%>

<%@page contentType="text/html"  pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%!
// サーブレットのinitメソッドに相当
public void jspInit() {
    try {
        // JDBCドライバをロード
        Class.forName("com.mysql.jdbc.Driver");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FruitテーブルのUpdate(JSP版)</title>
</head>

<body>
<P>JSPによるデータベースのUpdate</P>


<%
        Connection con = null;
        Statement stmt = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem",  "root", "lanchi0209");

            stmt = con.createStatement();

            String no = request.getParameter("no");
            String name = request.getParameter("name");
            String price = request.getParameter("price");

            StringBuffer buf = new StringBuffer();
            buf.append("update fruit set ");
            buf.append("name = '");
            buf.append(name);
            buf.append("', price = '");
            buf.append(price);
            buf.append("' where no = ");
            buf.append(no);
            stmt.executeUpdate(buf.toString());
            
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}

        } catch (Exception e) {
            e.printStackTrace();
        }

%>
<jsp:forward page="JdbcFruitTable.jsp" />
</body>
</html>
