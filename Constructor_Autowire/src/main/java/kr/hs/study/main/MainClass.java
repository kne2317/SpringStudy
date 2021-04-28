package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		
		
		System.out.println("t1.data3: " + t1.getData3());
		System.out.println("t1.data4: " + t1.getData4());
		
		
		
		ctx.close();
		
		
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);

		

		TestBean1 j1 = ctx2.getBean("java1", TestBean1.class);
		
		
		System.out.println("j1.data3: " + j1.getData3());
		System.out.println("j1.data4: " + j1.getData4());
		
		
		
		
		
		
		
		
		
		ctx2.close();
	}

}
