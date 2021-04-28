package kr.hs.study.beans;

public class DataBean {

	private int a;
	private int b;
	

	public DataBean() {
		
	}
	
	public DataBean(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public void prData() {
		System.out.print("a : " + a);
		System.out.print(", ");
		System.out.print("b : " + b);
		System.out.println();
	}
	
}
