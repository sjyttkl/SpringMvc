package com.sjyttkl.springmvc.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

//������һ���ַ���ת��������ʵ�����ͣ�springû���ṩ����Ĭ�ϵĹ��ܣ�������Ҫ�Զ�������ת������
//
//�����и�ʵ����Employee��
@Component//����������Ϊת��������@Componentע�⣬��Ϊ����Spring�Զ�ɨ���ת�����������С������Ͳ���ͨ�������ļ�����<bean>��
public class EmployeeConverter implements Converter<String, Employee>
{

	@Override
	public Employee convert(String source)
	{
		Employee emp = null;
		 //�ַ�����ʽ name-age-gender
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
