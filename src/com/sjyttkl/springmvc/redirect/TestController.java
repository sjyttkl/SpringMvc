package com.sjyttkl.springmvc.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
	@RequestMapping("/testRedirect")
	public String testRedirect()
	{
		//return "forward:/index.jsp";
		return "redirect:/index.jsp";
	}
}	
