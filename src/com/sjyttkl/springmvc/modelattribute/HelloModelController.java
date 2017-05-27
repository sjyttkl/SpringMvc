package com.sjyttkl.springmvc.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloModelController
{
//	被@ModelAttribute注释的方法会在此controller每个方法执行前被执行，因此对于一个controller映射多个URL的用法来说，要谨慎使用。
//
//	　　我们编写控制器代码时，会将保存方法独立成一个控制器也是如此。

	 
	@ModelAttribute
	public void populateModel(@RequestParam String abc,Model model)
	{
		model.addAttribute("attributeName",abc);
	}
	
	@RequestMapping(value="/helloWorld")
	public String helloWorld()
	{
		return "helloWorld";
	}
	
	

}
