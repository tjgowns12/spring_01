package com.care.di_test;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String config ="classpath:application_test.xml";
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(config);
		PrintBean pt=ctx.getBean("pb",PrintBean.class);
		System.out.println("숫자를 입력해주세요");
		
		pt.setPrint(new Scanner(System.in).next());
		pt.PrintString();
		
	}
}

