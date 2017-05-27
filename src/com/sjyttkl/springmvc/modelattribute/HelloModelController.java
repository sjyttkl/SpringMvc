package com.sjyttkl.springmvc.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloModelController
{
//	��@ModelAttributeע�͵ķ������ڴ�controllerÿ������ִ��ǰ��ִ�У���˶���һ��controllerӳ����URL���÷���˵��Ҫ����ʹ�á�
//
//	�������Ǳ�д����������ʱ���Ὣ���淽��������һ��������Ҳ����ˡ�

	 
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
