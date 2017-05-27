package com.sjyttkl.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello
{

	@RequestMapping("/hello") //@RequetMapping注解作用是url映射
	public String hello()
	{
		System.out.println("hello springmvc");
		return "hello";
	}
	
	

}
