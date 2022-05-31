<%-- 
    Document   : JdbcFruitTable
    Created on : 2022/01/27, 0:40:02
    Author     : doanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<title>Fruitテーブルの内容(JSP版)</title>
</head>

<body>
<P>JSPによるデータベースのアクセス</P>

<%

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
            // データベースに接続するConnectionオブジェクトの取得
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem", "root", "lanchi0209");
            // データベース操作を行うためのStatementオブジェクトの取得
            stmt = con.createStatement();
            // SQL()を実行して、結果を得る
            rs = stmt.executeQuery("select avg(price) from fruit ");
            System.out.println(rs);
            // 得られた結果をレコードごとに表示
            %>
            
</body>
</html>