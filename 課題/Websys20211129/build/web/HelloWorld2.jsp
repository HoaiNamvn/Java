<%-- 
    Document   : HelloWorld2
    Created on : 2021/11/29, 10:33:11
    Author     : doanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World </title>
</head>
<body>
<%
    for (int i = 0; i < 10; i++) {
%>
        Hello World!（<%= i+1 %>回目）<br>
<%
    }
%>
</body>
</html>