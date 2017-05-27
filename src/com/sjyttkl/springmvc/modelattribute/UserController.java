package com.sjyttkl.springmvc.modelattribute;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value={"user"})
@Controller
public class UserController
{
	@ModelAttribute()
	public void getUser(@RequestParam(required = false) Integer id,Map map)
	{
		if(id!=null)
		{
			User user = new User();
			user.setId(2);
			user.setAccount("中国银行");
			user.setAge(22);
			user.setName("小冬");
			map.put("user", user);
		}
	}
	
	@RequestMapping("/updateUser")
	//@ModelAttribute("user")表示是从 model里取出 key为user的值
	public String update(@ModelAttribute("user") User user)
	{
		System.out.println("更新User对象："+user);
		return "success";
	}
	
	
	@RequestMapping("/updateUser2")
	public String update2(@ModelAttribute("user")User user)
	{
		System.out.println("更新User对象："+user);
		return "success";
	}
	
	
	
	
}















