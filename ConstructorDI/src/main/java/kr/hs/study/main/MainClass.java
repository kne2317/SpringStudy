package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.DataBean;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		t1.prData();
		
		System.out.println("====================");
		
		TestBean1 t2 = ctx.getBean("t2", TestBean1.class);
		t2.prData();
		
		System.out.println("====================");
		
		TestBean1 t3 = ctx.getBean("t3", TestBean1.class);
		t3.prData();
		
		System.out.println("====================");
		
		TestBean1 t4 = ctx.getBean("t4", TestBean1.class);
		t4.prData();
		
		System.out.println("====================");
		
		TestBean1 t5 = ctx.getBean("t5", TestBean1.class);
		t5.prData();
		
		System.out.println("====================");
		
		TestBean1 t6 = ctx.getBean("t6", TestBean1.class);
		t6.prData();
		
		System.out.println("====================");
		
		TestBean2 t7 = ctx.getBean("t7", TestBean2.class);
		t7.prData();
		
		System.out.println("====================");
		
		DataBean d1 = ctx.getBean("d1", DataBean.class);
		d1.prData();
		
		System.out.println("====================");
		
		TestBean2 t8 = ctx.getBean("t8", TestBean2.class);
		t8.prData();
		
		DataBean data1 = ctx.getBean("d2", DataBean.class);
		DataBean data2 = ctx.getBean("d3", DataBean.class);
		
		t8.setData1(data1);
		t8.setData2(data2);
		
		t8.prMemData();
		
		
		
		
		ctx.close();
	}

}
