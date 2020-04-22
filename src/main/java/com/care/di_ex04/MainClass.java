package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di_ex03.SaveClass;

public class MainClass {
	public static void main(String[] args) {
		//Car car = new Controller01();
		
		String config="classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx =
			new GenericXmlApplicationContext(config);
		Car car=ctx.getBean("car",Car.class);
		
		System.out.println("���� Ŭ������ �ӷ��� ���ϴ�!!!");
		car.speed();

		SubClass sc=new SubClass();
		sc.subFunc();
		

		
		
		
	}
}
