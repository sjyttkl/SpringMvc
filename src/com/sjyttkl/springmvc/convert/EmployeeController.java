package com.sjyttkl.springmvc.convert;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController
{
	@RequestMapping("/convert")
	public String convert(@RequestParam("employee") Employee employee)
	{
		System.out.println(employee);
		return "employee";
	}
}
//这里可以看到，参数的名字为employee，所有要为请求定义一个employee参数，该参数传入需要转换的字符串
//除此之外，我们还需要在spring配置文件中配置，如下类容。让转换器生效
