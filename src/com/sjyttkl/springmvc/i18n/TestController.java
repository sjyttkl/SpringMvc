package com.sjyttkl.springmvc.i18n;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
	@RequestMapping("/i18n")
	public String update()
	{
		return  "i18n";
	}
}
/*
 * ԭ����i18n_bad.jspҳ�����ֱ�ӱ����ʵ�����i18n.jspҳ����WEB-INF���棬���ܹ�ֱ�ӷ��ʣ���Ҫͨ��servletת���ķ�ʽ�Ź����ʡ�
 * ��SpringMVC��
 * ��DispatcherServletǰ�˿��������������������󣬶�http://localhost:8080/springmvc-1/i18n_bad.jsp.
 * updateUser���ʡ�����SpringMVCȥ��������spring-mvc.xml������ResourceBundleMessageSource��
 * ������successҳ���п���ʹ�ù��ʻ���Ϣ��
 * ����������Ҫʹ�û���ҳ��Ĺ��ʻ���Ϣ����Ҫʹ��ת���ķ�ʽ������Ч��
 */