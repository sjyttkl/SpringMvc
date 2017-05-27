package com.sjyttkl.springmvc.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//4,对象合并
//这个在编写代码的时候很有用处,比如在更新的时候，我们可以现在populateModel方法中根据ID获取对象，然后使用spring mvc的自动组装功能，组装User对象，这样在客户端提交了值的属性才会被组装到对象中。
//比如：User对象，首先从数据库中获取此对象，客户端表单只有account属性，提交时就只会改变account属性。
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
//	5,对象合并指定对象名称
	
	
	@ModelAttribute(value="myUser")
	public User populateModel2()
	{
		User user = new User();
		user.setAccount("中国银行");
		return user;
	}
	
	@RequestMapping(value="/merge2")
	public String helloWorld2(@ModelAttribute("myUser") User user)
	{
		user.setName("小冬");
		return "merge";
	}
	
	
	
	
	
	
	
}
