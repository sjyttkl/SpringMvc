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
//������Կ���������������Ϊemployee������ҪΪ������һ��employee�������ò���������Ҫת�����ַ���
//����֮�⣬���ǻ���Ҫ��spring�����ļ������ã��������ݡ���ת������Ч
