package com.sjyttkl.springmvc.demo.web;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class TagsModel
{

	private String username;
	private String password;
	private boolean testBoolean;
	private String[] selectArray;
	private String[] testArray;
	private Integer radiobuttonId;
	private Integer selectId;
	private List<Integer> selectIds;
	private Map<Integer, String> testMap;
	private String remark;

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void setTestBoolean(boolean testBoolean)
	{
		this.testBoolean = testBoolean;
	}

	public void setSelectArray(String[] selectArray)
	{
		this.selectArray = selectArray;
	}

	public void setTestArray(String[] testArray)
	{
		this.testArray = testArray;
	}

	public void setRadiobuttonId(Integer radiobuttonId)
	{
		this.radiobuttonId = radiobuttonId;
	}

	public void setSelectId(Integer selectId)
	{
		this.selectId = selectId;
	}

	public void setSelectIds(List<Integer> selectIds)
	{
		this.selectIds = selectIds;
	}

	public void setTestMap(Map<Integer, String> testMap)
	{
		this.testMap = testMap;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getUsername()
	{
		return this.username;
	}

	public String getPassword()
	{
		return this.password;
	}

	public boolean getTestBoolean()
	{
		return this.testBoolean;
	}

	public String[] getSelectArray()
	{
		return this.selectArray;
	}

	public String[] getTestArray()
	{
		return this.testArray;
	}

	public Integer getRadiobuttonId()
	{
		return this.radiobuttonId;
	}

	public Integer getSelectId()
	{
		return this.selectId;
	}

	public List<Integer> getSelectIds()
	{
		return this.selectIds;
	}

	public Map<Integer, String> getTestMap()
	{
		return this.testMap;
	}

	public String getRemark()
	{
		return this.remark;
	}

	@Override
	public String toString()
	{
		return "TagsModel [username=" + username + ", password=" + password + ", testBoolean=" + testBoolean + ", selectArray="
				+ Arrays.toString(selectArray) + ", testArray=" + Arrays.toString(testArray) + ", radiobuttonId=" + radiobuttonId + ", selectId="
				+ selectId + ", selectIds=" + selectIds + ", testMap=" + testMap + ", remark=" + remark + "]";
	}

}