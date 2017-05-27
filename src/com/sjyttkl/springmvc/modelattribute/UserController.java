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
			user.setAccount("�й�����");
			user.setAge(22);
			user.setName("С��");
			map.put("user", user);
		}
	}
	
	@RequestMapping("/updateUser")
	//@ModelAttribute("user")��ʾ�Ǵ� model��ȡ�� keyΪuser��ֵ
	public String update(@ModelAttribute("user") User user)
	{
		System.out.println("����User����"+user);
		return "success";
	}
	
	
	@RequestMapping("/updateUser2")
	public String update2(@ModelAttribute("user")User user)
	{
		System.out.println("����User����"+user);
		return "success";
	}
	
	
	
	
}















