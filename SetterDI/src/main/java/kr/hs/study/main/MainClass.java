package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1:\t" + t1.getA() + "\t" + t1.getB() + "\t" + t1.getC() + "\t" + t1.getD1() + "\t\t" + t1);
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2:\t" + t2.getA() + "\t" + t2.getB() + "\t" + t2.getC() + "\t" + t2.getD1() + "\t\t" + t2);
		
		
		
		System.out.println("====================================================================");
		
		

		TestBean1 t3 = ctx.getBean("obj2", TestBean1.class);
		System.out.println("t3:\t" + t3.getA() + "\t" + t3.getB() + "\t" + t3.getC() + "\t" + t3.getD1() + "\t\t" + t3);
		
		
		
		System.out.println("====================================================================");
		
		

		TestBean1 t4 = ctx.getBean("obj4", TestBean1.class);
		System.out.println("t4: " + t4.getD1());

		TestBean1 t5 = ctx.getBean("obj5", TestBean1.class);
		System.out.println("t5: " + t5.getD1());

		TestBean1 t6 = ctx.getBean("obj6", TestBean1.class);
		System.out.println("t6: " + t6.getD1());
		
		
		

		
		TestBean1 t7 = ctx.getBean("obj7", TestBean1.class);
		System.out.println("t7:\t" + t7.getA() + "\t" + t7.getB() + "\t" + t7.getC() + "\t" + t7.getD1() + "\t\t" + t7);
		
		
		
		
		
		
		
		
		ctx.close();
		
	}

}
