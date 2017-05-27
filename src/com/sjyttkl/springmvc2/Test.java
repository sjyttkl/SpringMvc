package com.sjyttkl.springmvc2;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


//1、names：这是一个字符串数组。里面应写需要存储到session中数据的名称。
//
//2、types：根据指定参数的类型，将模型中对应类型的参数存储到session中
//
//  3、value：其实和names是一样的。
//@SessionAttributes注解只能在类上使用，不能在方法上使用
@SessionAttributes(names={"names"},types={Integer.class})
@Controller
public class Test
{

	@RequestMapping("/testSession")
	public String test(Map<String,Object> map)
	{
		map.put("names",Arrays.asList("xiaodong","yanshu","songdongdog"));
		map.put("age",20);
		return "sessions";
	}

}
