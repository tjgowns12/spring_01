package com.care.di_ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintClass {
	public void print(String name,ArrayList hobby,HashMap weather) {
		System.out.println("�̸�:"+name);
		System.out.println("hobby 0:"+hobby.get(0));
		System.out.println("hobby 1:"+hobby.get(1));
		System.out.println("���� ����"+weather.get("����"));
		System.out.println("���� ����"+weather.get("����"));
		
		
	}
}
