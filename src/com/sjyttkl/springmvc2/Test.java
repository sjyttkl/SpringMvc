package com.sjyttkl.springmvc2;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


//1��names������һ���ַ������顣����Ӧд��Ҫ�洢��session�����ݵ����ơ�
//
//2��types������ָ�����������ͣ���ģ���ж�Ӧ���͵Ĳ����洢��session��
//
//  3��value����ʵ��names��һ���ġ�
//@SessionAttributesע��ֻ��������ʹ�ã������ڷ�����ʹ��
@SessionAttributes(names={"names"},types={Integer.class})
@Controller
public class Test
{

	@RequestMapping("/testSession")
	public String test(Map<String,Object> map)
	{
		map.put("names",Arrays.asList("xiaodong","yanshu","songdongdog"));
		map.put("age",20);
		return "sessions";
	}

}
