<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="user/1">GET请求</a>
	
	<form action="user/1" method="post">
		<input type="submit" value="POST请求"/>
	</form>
	
	<form action="user/1" method="post">
		<input type="hidden" name="_method" value="PUT" />
		 <input type="submit" value="PUT请求"/>
	</form>
	
	<form action="user/1" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
		<input type="submit" value="DELTE请求"/>
	
	</form>
	
	
</body>
</html>