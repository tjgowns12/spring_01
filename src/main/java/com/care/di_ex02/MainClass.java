package com.care.di_ex02;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st =new STBean();
		String config ="classpath:applicationST.xml";
		//classpath�� ���ҽ���� ��Ű�� �ȿ� �ִ� application�� ���ڴٶ�� ��
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(config);
		//�����̳ʿ��� ��ü�� ��� ���ڴ�
		STBean st=	ctx.getBean("stb",STBean.class);
		//������ �����̳ʸ��߿� stb��� ��ü�� ��������  �� Ŭ������ �̸��� STBean�̶�� ���̴�

		//
		
		//st.setName("ȫ�浿");
		//st.setAge(2000);
		//st.setSt(new Student());
		
		st.namePrint();st.agePrint();
	}
}
