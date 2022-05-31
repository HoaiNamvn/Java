<%-- 
    Document   : EveryoneHello
    Created on : 2021/11/29, 10:39:18
    Author     : doanh
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<%!
int i;
int intNum;
String[] strVal={"渡辺","松岡","川端","本多","川村"};
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>みんなにHello！！</title>
</head>
<body>
<h1>みんなにHello！！</h1>
<%
intNum=strVal.length;
for(i=0;i<intNum;i++){
	out.println("<p>こんにちは、" + strVal[i] + "さん！</p>");
}
%>
</body>
</html>