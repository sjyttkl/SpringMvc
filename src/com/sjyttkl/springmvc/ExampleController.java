package com.sjyttkl.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/example")
public class ExampleController
{

	@RequestMapping
	public String execute()
	{
		return "example_page";
	}

	@RequestMapping("/todo")
	public String doSomething()
	{
		return "example_todo_page";
	}

	// method 的值一旦指定，那么，处理方法就只对指定的 http method 类型的请求进行处理。
	// 这里方法/register只能使用get请求，使用post请求无法访问
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register1()
	{
		return "example_register_get_page";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register2()
	{
		return "example_register_get_page";
	}

	// @RequestMapping(params)
	// 与 method 相类似，作用是为了细化映射。只有当 URL 中包含与 params 值相匹配的参数的请求，处理方法才会被调用。
	
	//	find1()：请求的 URL 中必须要有 target 参数，才能够到达此方法。如 /example/find.action?target 或 /example/find.action?target=x 
	//	find2()：请求的 URL 中必须不能有 target 参数，才能够到达此方法。如 /example/find.action 或 /example/find.action?q=x 
	//	search1()：请求的 URL 中必须要有 target=product 参数，才能够到达此方法。如 /example/search.action?target=product 
	//	search2()：请求的 URL 中必须不能有 target=product 参数，才能够到达此方法。如 /example/search.action?target=article
	@RequestMapping(value = "/find", params = "target")
	public String find1()
	{
		return "example_find1_page_target";
	}

	@RequestMapping(value = "/find", params = "!target")
	public String find2()
	{
		return "example_find2_page_!target";
	}

	@RequestMapping(value = "/search", params = "target=product")
	public String search1()
	{
		return "example_search1_page";
	}

	@RequestMapping(value = "/search", params = "target!=product")
	public String search2()
	{
		return "example_search2_page";
	}
	
	//headers 的作用也是用于细化映射。只有当请求的 Request Headers 中包含与 heanders 值相匹配的参数，处理方法才会被调用。 
	@RequestMapping(value="/specify",headers="accept=text/*")
	public String specify()
	{
		return "example_specify_page";
	}

	@RequestMapping("/user/{id}")
	public String test(@PathVariable("id") Integer id)
	{
		System.out.println(id);
		return "hello";
	}

}
