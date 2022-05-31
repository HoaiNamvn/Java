<%-- 
    Document   : sum2
    Created on : 2021/11/29, 11:13:29
    Author     : doanh
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>100～1000未満の偶数を合計する</title>
    </head>
    <body>
        <h1>100～1000未満の偶数を合計する</h1>
        <%
            int i = 100;
            int result = 0;
            while (i < 1000) {
                if (i % 2 == 0) {
                    result += i;
                }
                i++;
            }
            out.println("合計値：" + result);
        %>
    </body>
</html>
