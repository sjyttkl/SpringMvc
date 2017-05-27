package com.sjyttkl.springmvc.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//4,����ϲ�
//����ڱ�д�����ʱ������ô�,�����ڸ��µ�ʱ�����ǿ�������populateModel�����и���ID��ȡ����Ȼ��ʹ��spring mvc���Զ���װ���ܣ���װUser���������ڿͻ����ύ��ֵ�����ԲŻᱻ��װ�������С�
//���磺User�������ȴ����ݿ��л�ȡ�˶��󣬿ͻ��˱�ֻ��account���ԣ��ύʱ��ֻ��ı�account���ԡ�
@Controller
public class Hello3ModelController
{
	@ModelAttribute
	public User populateModel()
	{
		User user = new User();
		user.setAccount("account");
		return user;
	}
	
	@RequestMapping(value="/merge")
	public String helloWorld(User user)
	{
		user.setName("xiaodong");
		return "merge";
	}
//	5,����ϲ�ָ����������
	
	
	@ModelAttribute(value="myUser")
	public User populateModel2()
	{
		User user = new User();
		user.setAccount("�й�����");
		return user;
	}
	
	@RequestMapping(value="/merge2")
	public String helloWorld2(@ModelAttribute("myUser") User user)
	{
		user.setName("С��");
		return "merge";
	}
	
	
	
	
	
	
	
}
