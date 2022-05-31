<%-- 
    Document   : Quest1
    Created on : 2021/11/29, 11:43:27
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
	case 3 : out.println("僕も大好きです");break;
	case 2 : out.println("まぁまぁですね");break;
	case 1 : out.println("この世の食べ物とも思えない");break;
}
%>
</body>
</html>