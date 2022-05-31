<%-- 
    Document   : EvenSumJSP
    Created on : 2021/11/29, 10:26:10
    Author     : doanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int sum = 0;
            for (int i = 100; i < 1000; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            out.println("even sum = " + sum);
        %>
        
    </body>
</html>
