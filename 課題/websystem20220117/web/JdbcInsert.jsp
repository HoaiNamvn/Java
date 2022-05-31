<%-- 
    Document   : JdbcInsert
    Created on : 2022/01/27, 13:08:11
    Author     : doanh
--%>

<%@page contentType="text/html  pageEncoding=UTF-8"%>
<%@page import="java.sql.*"%>
<%!
// ???????init???????
public void jspInit() {
    try {
        // JDBC????????
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
<title>CUSTOMER_TBL?????Insert(JSP?)</title>
</head>

<body>
<P>JSP??????????Insert</P>

<%
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
%>

<jsp:forward page="JdbcFruitTable.jsp" />

</body>
</html>