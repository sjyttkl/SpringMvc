<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>国际化问题:这是正确的，不正确的请看 webContent下面的</title>
</head>
<body>
	　<br>原因是i18n_bad.jsp页面可以直接被访问到，而i18n.jsp页面在WEB-INF下面，不能够直接访问，需要通过servlet转发的方式才够访问。在SpringMVC中，DispatcherServlet前端控制器，拦截了所有请求，对http://localhost:8080/springmvc-1/updateUser访问。交个SpringMVC去处理。而在spring-mvc.xml配置了ResourceBundleMessageSource，所以在success页面中可以使用国际化信息。

 　　综上所述：要使用基于页面的国际化信息，需要使用转发的方式才能生效。<br/>

	<fmt:message key="message.username"/>
		<input type="text" name="username"><br/>
	<fmt:message key="message.password"/>
	 <input type="text" name="password"><br/>
</body>
</html>