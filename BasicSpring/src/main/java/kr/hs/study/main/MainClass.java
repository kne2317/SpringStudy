package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		// 컨테이너의 config.xml 파일을 읽어온다
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*
		// 컨테이너에 잇는 객체 가지고오기(getBean)
		// singleton : 객체는 한번 가져오면 계속 사용된다. 새로 생성되지 않는다. 
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.method();
		
		
		
		
		// TestBean t2 = (TestBean)ctx.getBean("t2");
		Test t2 = ctx.getBean("t2", TestBean.class);
		t2.method();
		
		System.out.println("t2 : " + t2);
		
		
		
		
		
		Test t3 = ctx.getBean("t2", TestBean.class);
		Test t4 = ctx.getBean("t2", TestBean.class);
		
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		*/
		
		
		
		
		
		Test t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1 : " + t1);
		
		
		Test t2 = ctx.getBean("t1", TestBean.class);
		System.out.println("t2 : " + t2);
		
		
		Test t3 = ctx.getBean("t1", TestBean.class);
		System.out.println("t3 : " + t3);
		
		
		
		
		
		
		
		
		ctx.close();
		
		
	}

}
