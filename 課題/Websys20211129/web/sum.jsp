<%-- 
    Document   : sum
    Created on : 2021/11/29, 11:11:32
    Author     : doanh
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1～100の間の奇数を合計する</title>
</head>
<body>
<h1>1～100の間の奇数を合計する</h1>
<%
int result=0;
for(int i=1;i<=100;i++){
	if(i % 2 == 0){continue;}
	result += i;
}
out.println("合計値：" + result);
%>
</body>
</html>
