<%-- 
    Document   : ScriptElement
    Created on : 2021/11/29, 10:58:38
    Author     : doanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    int declarationCounter = 0; // 宣言のカウンタ
    // 宣言のカウンタ値を読むスレッドセーフなメソッド
    synchronized int getDeclarationCounter() {
        return ++declarationCounter;
    }
%>
<%
    // スクリプトレットのカウンタもここで用意しておく
    int scriptletCounter = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宣言とスクリプトレットの比較</title>
</head>
<body>
宣言のカウンタ=<%= getDeclarationCounter()%> <br>
スクリプトレットのカウンタ=<%= ++scriptletCounter%>
</body>
</html>