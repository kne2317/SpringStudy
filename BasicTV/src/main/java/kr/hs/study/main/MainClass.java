package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.TV;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TV sTV = ctx.getBean("STV", SamsungTV.class);
		TV LTV = ctx.getBean("LTV", LgTV.class);
		
		sTV.volumeUp();
		sTV.volumeDown();
		sTV.powerOn();
		sTV.powerOff();
		
		LTV.volumeUp();
		LTV.volumeDown();
		LTV.powerOn();
		LTV.powerOff();
		

		ctx.close();
	}

}
