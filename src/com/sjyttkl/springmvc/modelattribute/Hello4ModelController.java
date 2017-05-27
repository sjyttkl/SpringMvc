package com.sjyttkl.springmvc.modelattribute;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//需要控制权限的类继承BaseController
//这样就可以控制权限了，当然控制权限的方法有很多，比如通过过滤器等。这里只是提供一种思路。
public class Hello4ModelController extends BaseController
{
	@RequestMapping(value="baseController")
	public String helloworld(@ModelAttribute("myUser") User user)
	{
		user.setName("小冬");
		return "helloWorld";
	}
}
