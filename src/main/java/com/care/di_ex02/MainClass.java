package com.care.di_ex02;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//STBean st =new STBean();
		String config ="classpath:applicationST.xml";
		//classpath는 리소스라는 패키지 안에 있는 application을 보겠다라는 것
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext(config);
		//컨테이너에서 객체를 얻어 오겠다
		STBean st=	ctx.getBean("stb",STBean.class);
		//가져온 컨테이너를중에 stb라는 객체를 가져오고  그 클래스의 이름은 STBean이라는 것이다

		//
		
		//st.setName("홍길동");
		//st.setAge(2000);
		//st.setSt(new Student());
		
		st.namePrint();st.agePrint();
	}
}
