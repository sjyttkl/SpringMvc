package com.sjyttkl.springmvc.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//如果想把一个字符串转换成其它实体类型，spring没有提供这样默认的功能，我们需要自定义类型转换器。
//
//这里有个实体类Employee。
@Component//　这里我们为转换器加上@Component注解，是为了让Spring自动扫描该转换器到容器中。这样就不用通过配置文件配置<bean>了
public class EmployeeConverter implements Converter<String, Employee>
{

	@Override
	public Employee convert(String source)
	{
		Employee emp = null;
		 //字符串格式 name-age-gender
		if(source!=null && source.split("-").length==3)
		{
			emp = new Employee();
			String [] arr = source.split("-");
			emp.setName(arr[0]);
			emp.setAge(Integer.parseInt(arr[1]));
			emp.setGender(arr[2]);
		}
		return emp;
	}

}
