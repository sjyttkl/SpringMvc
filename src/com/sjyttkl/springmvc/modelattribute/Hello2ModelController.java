package com.sjyttkl.springmvc.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2ModelController
{
	// ���û�����
	// http://localhost:8080/SpringMvc-1/helloWorld2ʱ�����ȷ���populateModel����������User����model���Ե�����û��ָ�������ɷ�������������ʾ���������������User���ͣ���ô���model���Ե�������user�����������model���������з��ض�������������ʾ��model���Զ�����Ƿ����ķ���ֵ��������Ҫ�ض��Ĳ�����
	//Ҳ����ָ����������@ModelAttribute(value="myUser"),��д����Ĭ�ϵ�user
	
	
	@ModelAttribute
	public User populateModel()
	{
		User user = new User();
		user.setAccount("ray");
		return user;
	}

	@RequestMapping(value = "/helloWorld2")
	public String helloWorld()
	{
		return "helloWorld";
	}

}
