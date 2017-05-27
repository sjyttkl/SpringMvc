package com.sjyttkl.springmvc.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2ModelController
{
	// 当用户请求
	// http://localhost:8080/SpringMvc-1/helloWorld2时，首先访问populateModel方法，返回User对象，model属性的名称没有指定，它由返回类型隐含表示，如这个方法返回User类型，那么这个model属性的名称是user。这个例子中model属性名称有返回对象类型隐含表示，model属性对象就是方法的返回值。它无须要特定的参数。
	//也可以指定属性名称@ModelAttribute(value="myUser"),不写就是默认的user
	
	
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
