<%-- 
    Document   : JdbcFruitTable
    Created on : 2022/01/17, 9:43:05
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
<table border='1'><tr><th>NO</th><th>NAME</th><th>PRICE</th></tr>

<%
        // データベースへのアクセス開始
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // データベースに接続するConnectionオブジェクトの取得
            con = DriverManager.getConnection("jdbc:mysql://localhost/websystem", "root", "tuis2019websystem");
            // データベース操作を行うためのStatementオブジェクトの取得
            stmt = con.createStatement();
            // SQL()を実行して、結果を得る
            rs = stmt.executeQuery("select no, name, price from fruit");

            // 得られた結果をレコードごとに表示
            while (rs.next()) {
%>
                <tr>
                <%-- レコードのNOフィールドを表示 --%>
                <td><%= rs.getInt("no")%></td>
                <%-- レコードのNAMEフィールドを表示 --%>
                <td><%= rs.getString("name")%></td>
                <%-- レコードのPRICEフィールドを表示 --%>
                <td><%= rs.getInt("price")%></td>
                </tr>
<%
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // データベースとの接続をクローズ
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { con.close(); } catch (Exception e) {}
        }
%>

        </table>
</body>
</html>
