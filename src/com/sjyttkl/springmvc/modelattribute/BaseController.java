package com.sjyttkl.springmvc.modelattribute;

import org.springframework.web.bind.annotation.ModelAttribute;

//6��ͨ�������Կ���Ȩ��
//
//���ǿ����ڻ��෽���п���д��ע�⣬��Ҫ����Ȩ�޵Ŀ��������̳п������Ϳ����ˡ�
public class BaseController
{
	@ModelAttribute
	public void populateModel() throws Exception 
	{
		SysUser user = ContextUtil.getCurrentUser();
		if(user.getAccount().equals("admin"))
		{
			 throw new Exception("û��Ȩ��");
		}
	}
}
