package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LGTV;
import kr.hs.study.beans.SamsungTV;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SamsungTV st = ctx.getBean("st", SamsungTV.class);
		LGTV lt = ctx.getBean("lt", LGTV.class);
		
		st.powerOn();
		System.out.println("st.price: " + st.getPrice() + "원");
		System.out.println("st.speaka.price: " + st.getSpeaka().getPrice() + "원");
		st.getSpeaka().volumeUp();
		st.getSpeaka().volumeDown();
		st.powerDown();
		
		System.out.println("\n==========\n");
		
		lt.powerOn();
		System.out.println("lt.price: " + lt.getPrice() + "원");
		System.out.println("lt.speaka.price: " + lt.getSpeaka().getPrice() + "원");
		lt.getSpeaka().volumeUp();
		lt.getSpeaka().volumeDown();
		lt.powerDown();
		
		ctx.close();
		
		

	}

}
