package com.care.di_test03;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PrintClass {
	public void printFunc(String name, ArrayList<String> food) {
		System.out.println("�̸�:"+name);
		System.out.println("�����ϴ� ����"+food.get(0));
		System.out.println("�����ϴ� ����"+food.get(1));
		System.out.println("�����ϴ� ����"+food.get(2));
		
		
	}


}
