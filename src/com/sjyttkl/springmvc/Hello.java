package com.sjyttkl.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello
{

	@RequestMapping("/hello") //@RequetMappingע��������urlӳ��
	public String hello()
	{
		System.out.println("hello springmvc");
		return "hello";
	}
	
	

}
