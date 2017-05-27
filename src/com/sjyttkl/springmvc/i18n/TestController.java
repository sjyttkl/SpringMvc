package com.sjyttkl.springmvc.i18n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
	@RequestMapping("/i18n")
	public String update()
	{
		return  "i18n";
	}
}
/*
 * 原因是i18n_bad.jsp页面可以直接被访问到，而i18n.jsp页面在WEB-INF下面，不能够直接访问，需要通过servlet转发的方式才够访问。
 * 在SpringMVC中
 * ，DispatcherServlet前端控制器，拦截了所有请求，对http://localhost:8080/springmvc-1/i18n_bad.jsp.
 * updateUser访问。交个SpringMVC去处理。而在spring-mvc.xml配置了ResourceBundleMessageSource，
 * 所以在success页面中可以使用国际化信息。
 * 综上所述：要使用基于页面的国际化信息，需要使用转发的方式才能生效。
 */