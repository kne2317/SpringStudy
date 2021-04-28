package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;
import kr.hs.study.beans.Car;


public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		CarUser c1 = ctx.getBean("cu1", CarUser.class);
		
		System.out.println("차주명: " + c1.getOwner());
		System.out.println("색깔: " + c1.getColor());
		System.out.println("차종: " + c1.getCar_type().getName());
		System.out.println("차 가격: " + c1.getCar_type().getPrice() + "원");
		
		
		System.out.println("===========");

		CarUser c2 = ctx.getBean("cu2", CarUser.class);

		
		System.out.println("차주명: " + c2.getOwner());
		System.out.println("색깔: " + c2.getColor());
		System.out.println("차종: " + c2.getCar_type().getName());
		System.out.println("차 가격: " + c2.getCar_type().getPrice() + "원");
		

		
		System.out.println("===========");

		CarUser c3 = ctx.getBean("cu3", CarUser.class);

		
		System.out.println("차주명: " + c3.getOwner());
		System.out.println("색깔: " + c3.getColor());
		System.out.println("차종: " + c3.getCar_type().getName());
		System.out.println("차 가격: " + c3.getCar_type().getPrice() + "원");
		
		
		
		ctx.close();
		
		
	}

}
