package com.sjyttkl.springmvc.modelattribute;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//��Ҫ����Ȩ�޵���̳�BaseController
//�����Ϳ��Կ���Ȩ���ˣ���Ȼ����Ȩ�޵ķ����кܶ࣬����ͨ���������ȡ�����ֻ���ṩһ��˼·��
public class Hello4ModelController extends BaseController
{
	@RequestMapping(value="baseController")
	public String helloworld(@ModelAttribute("myUser") User user)
	{
		user.setName("С��");
		return "helloWorld";
	}
}
