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

	// method ��ֵһ��ָ������ô����������ֻ��ָ���� http method ���͵�������д���
	// ���﷽��/registerֻ��ʹ��get����ʹ��post�����޷�����
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
	// �� method �����ƣ�������Ϊ��ϸ��ӳ�䡣ֻ�е� URL �а����� params ֵ��ƥ��Ĳ��������󣬴������Żᱻ���á�
	
	//	find1()������� URL �б���Ҫ�� target ���������ܹ�����˷������� /example/find.action?target �� /example/find.action?target=x 
	//	find2()������� URL �б��벻���� target ���������ܹ�����˷������� /example/find.action �� /example/find.action?q=x 
	//	search1()������� URL �б���Ҫ�� target=product ���������ܹ�����˷������� /example/search.action?target=product 
	//	search2()������� URL �б��벻���� target=product ���������ܹ�����˷������� /example/search.action?target=article
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
	
	//headers ������Ҳ������ϸ��ӳ�䡣ֻ�е������ Request Headers �а����� heanders ֵ��ƥ��Ĳ������������Żᱻ���á� 
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
