<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- インスタンス生成 --%>
<jsp:useBean id="bean"
			class="servlet.Bean"
			scope="request"></jsp:useBean>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>認証成功画面</title>
</head>
<body>
<h1>認証成功画面</h1>


<jsp:getProperty property="id" name="bean"/>
<p>さん。こんにちは</p>

</body>
</html>