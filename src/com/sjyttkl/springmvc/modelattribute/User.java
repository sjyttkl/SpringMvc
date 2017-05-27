package com.sjyttkl.springmvc.modelattribute;

public class User
{
	private String account;
	private String name;
	private int age;
	private int id;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getAccount()
	{
		return account;
	}

	public void setAccount(String account)
	{
		this.account = account;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "User [account=" + account + ", name=" + name + ", age=" + age + ", id=" + id + "]";
	}

	

}
