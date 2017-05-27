package com.sjyttkl.springmvc.projo;

public class User
{

	private String username;
	private String password;
	private String gender;
	private String hobby;
	private Address address;

	public String getUsername()
	{
		return username;
	}
	@Override
	public String toString()
	{
		return "User [username=" + username + ", password=" + password + ", gender=" + gender + ", hobby=" + hobby + ", address=" + address + "]";
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getHobby()
	{
		return hobby;
	}
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}

}
