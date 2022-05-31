<%-- 
    Document   : Quest2
    Created on : 2021/11/29, 11:47:59
    Author     : doanh
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アンケート結果</title>
</head>
<body>
<h1>アンケート結果</h1>
<%
switch (Integer.parseInt(request.getParameter("food"))) {
	case 3 : out.println("好き");break;
	case 2 : out.println("嫌い");break;
	case 1 : out.println("大好き");break;
}
%>
</body>
</html>