package com.sjyttkl.springmvc.projo;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PojoTest
{
	@RequestMapping("/testPOJO")
	public String testPOJO(User user)
	{
		System.out.println(user);
		System.out.println(user.getHobby());
		return "hello";

	}
	
	/*��������� 
	�����ԣ�Ҫʹ��Sevlet��һЩAPI��ֻҪֱ�ӽ�����Ϊ�������뼴�ɡ�����Ҫrequest���ʹ���request�� ��Ҫsession���ʹ���session��springmvc֧�ִ����Sevletԭ��apiһ����������Щ�� 
	1. HttpServletRequest 
	2. HttpServletResponse 
	3. HttpSession 
	4. java.security.Principal 
	5. Locale 
	6. InputStream 
	7. OutputStream 
	8. Reader 
	9. Writer*/
	
	@RequestMapping("/testServletAPI")
	public void testServeltAPI(HttpServletRequest request,HttpServletResponse response,HttpSession session,Writer out) throws IOException
	{
		System.out.println(request);
		System.out.println(response);
		System.out.println(session);
		System.out.println(out);
	    out.write("hello");
	}
	
	@RequestMapping("/test")
	public ModelAndView test()
	{
		ModelAndView mav = new ModelAndView("hello");//��ʾ���� jspҳ��
		mav.addObject("time",new Date());
		mav.getModel().put("name","xiaodong");
		return mav;
	}
	
	@RequestMapping("/test2")
	public String test(Map<String ,Object> map,Model model,ModelMap modelMap)
	{
		map.put("names", Arrays.asList("xiaodong","yanshu","zhongguo"));
		model.addAttribute("time",new Date());
		modelMap.addAttribute("city", "anhui");
		modelMap.put("gender", "male");
		return "hello";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
