package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config="classpath:application_test02.xml";
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(config);
		SaveClass sc =ctx.getBean("sc",SaveClass.class);
	
		System.out.println("���� �Է�");
		sc.setNum1(new Scanner(System.in).nextInt());
		System.out.println("����");
		sc.setOp(new Scanner(System.in).next());
		System.out.println("���� �Է�");
		sc.setNum2(new Scanner(System.in).nextInt());
		sc.operationClass();
		sc.printClass();
		
	}
}
