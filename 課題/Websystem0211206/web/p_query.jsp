<%-- 
    Document   : p_query
    Created on : 2021/12/13, 0:09:37
    Author     : doanh
--%>

<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>クエリ情報を取得する</title>
</head>
<body>
<h1>クエリ情報一覧</h1>
<table border="1">
<%
Enumeration enmNam=request.getParameterNames();
while(enmNam.hasMoreElements()){
	String   strNam=(String)(enmNam.nextElement());
	String[] strVal=request.getParameterValues(strNam);
	out.println("<tr><th>" + strNam + "</th>");
	out.println("<td>");
	for(int i=0;i<strVal.length;i++){out.println(strVal[i] + " ");}
	out.println("</td></tr>");
}
%>
</table>
</body>
</html>