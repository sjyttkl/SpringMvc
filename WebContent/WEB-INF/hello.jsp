<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	hello springmvc<br/>
	time:${requestScope.time }
	<br/>
	name:${names}
	<br/>
	city:${requestScope.city}
	<br/>
	gender:${gender}
	
</body>
</html>