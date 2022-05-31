<%-- 
    Document   : Quest
    Created on : 2021/11/29, 11:25:36
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
String strAns=request.getParameter("interest");
if(Integer.parseInt(strAns)==1){
	out.println("よかったぁ！");
}else{
	out.println("えぇ、なんでぇ？？？");
}
%>
</body>
</html>
