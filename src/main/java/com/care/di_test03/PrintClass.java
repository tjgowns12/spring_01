package com.care.di_test03;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class PrintClass {
	public void printFunc(String name, ArrayList<String> food) {
		System.out.println("이름:"+name);
		System.out.println("좋아하는 음식"+food.get(0));
		System.out.println("좋아하는 음식"+food.get(1));
		System.out.println("좋아하는 음식"+food.get(2));
		
		
	}


}
