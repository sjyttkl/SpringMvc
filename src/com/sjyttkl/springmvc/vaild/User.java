package com.sjyttkl.springmvc.vaild;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class User
{
	@NotNull(message="���ֲ���Ϊ��")
	private String username;
	@Max(value=120, message="��������ܳ���120")
	private int age;
	@Email(message="�����ʽ�д�")
	private String email;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
