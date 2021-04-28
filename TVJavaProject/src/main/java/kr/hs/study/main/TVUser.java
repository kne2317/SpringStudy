package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.config.JavaConfig;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);

		SamsungTV st = ctx.getBean("st", SamsungTV.class);
		LgTV lt = ctx.getBean("lt", LgTV.class);
		
		st.powerOn();
		System.out.println("st.price: " + st.getPrice() + "원");
		System.out.println("st.speaka.price: " + st.getSpeaka().getPrice() + "원");
		st.getSpeaka().volumeUp();
		st.getSpeaka().volumeDown();
		st.powerDown();
		
		System.out.println("\n==============\n");
		
		lt.powerOn();
		System.out.println("lt.price: " + lt.getPrice() + "원");
		System.out.println("lt.speaka.price: " + lt.getSpeaka().getPrice() + "원");
		lt.getSpeaka().volumeUp();
		lt.getSpeaka().volumeDown();
		lt.powerDown();
		
		
		
		
		ctx.close();

	}

}
