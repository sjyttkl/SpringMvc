package com.sjyttkl.springmvc2;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
public class User
{
	@RequestMapping(value="user/{id}",method=RequestMethod.GET)
	public String get(@PathVariable("id") Integer id)
	{
		System.out.println("��ȡ�û� ��"+id);
		return "hello";
	}

	@RequestMapping(value="user/{id}",method=RequestMethod.POST)
	public String post(@PathVariable("id") Integer id)
	{
		System.out.println("����û���" +id);
		return "hello";
	}
	
	@RequestMapping(value="user/{id}",method=RequestMethod.PUT)
	public String put(@PathVariable("id") Integer id)
	{
		System.out.println("�����û���"+id);
		return "hello";
	}
	
	@RequestMapping(value="user/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id)
	{
		System.out.println("ɾ���û���"+id);
		return "hello";
	}
	
	//http://localhost:8080/SpringMvc-1/user/add?name=caoyc&age=18
	//���@RequestParam(value ="name" ,required = false)��ʾname���Ǳ���ģ����Բ��������ݣ�������봫������
	//��Ӧ@RequestParam�������͵Ĳ���������ö�ʹ�ð�װ���� ������ int age ������ ����  nullֵ
	@RequestMapping("user/add")
	public String add(@RequestParam("name") String name,  @RequestParam(value="age",required= false) Integer age)
	{
		System.out.println(name+"  "+age);
		return "hello";
	}
	
	@RequestMapping("/testCookie")
	public String testCookie(@CookieValue(value="name",required=false) String name,@CookieValue(value="age",required=false) Integer age)
	{
		System.out.println(name+"  "+age);
		return "hello";
	}
	
	
	
}
