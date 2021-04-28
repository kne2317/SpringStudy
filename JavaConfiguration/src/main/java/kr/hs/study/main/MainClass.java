package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {		
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		/* 설정이 있는 자바 파일 등록 */
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		

		System.out.println("\n---\n");
		
		TestBean2 t1 = ctx.getBean("obj1", TestBean2.class);
		t1.pr();
		System.out.println("t1: " + t1);
		
		TestBean2 t2 = ctx.getBean("obj1", TestBean2.class);
		t2.pr();
		System.out.println("t2: " + t2);

		
		System.out.println("\n---\n");
		
		
		TestBean2 t3 = ctx.getBean("obj2", TestBean2.class);
		t3.pr();
		System.out.println("t3: " + t3);
		
		TestBean2 t4 = ctx.getBean("obj2", TestBean2.class);
		t4.pr();
		System.out.println("t4: " + t4);

		
		System.out.println("\n---\n");
		
		
		TestBean2 t5 = ctx.getBean("obj3", TestBean2.class);
		t3.pr();
		System.out.println("t3: " + t3);
		
		TestBean2 t6 = ctx.getBean("obj3", TestBean2.class);
		t4.pr();
		System.out.println("t4: " + t4);

		
		
		System.out.println("\n====================================\n");
		
		
		
		
		TestBean2 t7 = ctx2.getBean("obj4", TestBean2.class);
		t7.pr();
		System.out.println("t7: " + t7);
		
		TestBean2 t8 = ctx2.getBean("obj4", TestBean2.class);
		t8.pr();
		System.out.println("t8: " + t8);

		
		System.out.println("\n---\n");
		
		
		TestBean2 t9 = ctx2.getBean("obj5", TestBean2.class);
		t9.pr();
		System.out.println("t9: " + t9);
		
		TestBean2 t10 = ctx2.getBean("obj5", TestBean2.class);
		t10.pr();
		System.out.println("t10: " + t10);

		
		System.out.println("\n---\n");
		

		TestBean2 t11 = ctx2.getBean("obj6", TestBean2.class);
		t11.pr();
		System.out.println("t11: " + t11);

		TestBean2 t12 = ctx2.getBean("obj6", TestBean2.class);
		t12.pr();
		System.out.println("t12: " + t12);
		
		
		
		
		System.out.println("\n\n\n\n====================================");
		System.out.println("====================================\n\n\n\n");
		
		
		
		TestBean3 t21 = ctx.getBean("obj11", TestBean3.class);
		
		System.out.println("t21:      " + t21.getA() + "      " + t21.getB() + "      " + t21.getC());
		

		TestBean3 t22 = ctx.getBean("obj12", TestBean3.class);
		
		System.out.println("t22:      " + t22.getA() + "      " + t22.getB() + "      " + t22.getC());

		
		System.out.println("\n---\n");
		
		
		TestBean3 t23 = ctx2.getBean("obj13", TestBean3.class);
		
		System.out.println("t23:      " + t23.getA() + "      " + t23.getB() + "      " + t23.getC());
		

		TestBean3 t24 = ctx2.getBean("obj14", TestBean3.class);
		
		System.out.println("t24:      " + t24.getA() + "      " + t24.getB() + "      " + t24.getC());
		
		
		
		
		System.out.println("\n\n\n\n====================================");
		System.out.println("====================================\n\n\n\n");
		
		
		
		
		
		
		
		
		System.out.println("\n\n\n\n\n");
		
		
		
		
		
		
		
		
		
		
		
		

		ctx.close();
		ctx2.close();
		

	}

}
