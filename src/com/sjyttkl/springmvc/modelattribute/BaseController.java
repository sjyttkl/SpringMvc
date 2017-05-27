package com.sjyttkl.springmvc.modelattribute;

import org.springframework.web.bind.annotation.ModelAttribute;

//6、通过此特性控制权限
//
//我们可以在基类方法中控制写此注解，需要控制权限的控制器，继承控制器就可以了。
public class BaseController
{
	@ModelAttribute
	public void populateModel() throws Exception 
	{
		SysUser user = ContextUtil.getCurrentUser();
		if(user.getAccount().equals("admin"))
		{
			 throw new Exception("没有权限");
		}
	}
}
