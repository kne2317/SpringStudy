package kr.hs.study.beans;

public class HelloWorldKo implements Hello {

	public HelloWorldKo() {
		System.out.println("한국어 생성자");
	}
	
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("안녕 스프링~");
	}

}
