<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	request中 names:${requestScope.names }</br>
	request中age:${requestScope.age }</br>
	<hr/>
	session 中 names:${sessionScope.names}</br>
	session 中 age:${sessionScope.age}</br>
	
	
</body>
</html>