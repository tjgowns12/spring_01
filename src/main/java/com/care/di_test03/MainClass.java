package com.care.di_test03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config ="classpath:applicationStudent.xml";
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(config);
		StudentClass sc =ctx.getBean("sc01",StudentClass.class);
		
		
		sc.execute();
		
		
		
		
	}
}
