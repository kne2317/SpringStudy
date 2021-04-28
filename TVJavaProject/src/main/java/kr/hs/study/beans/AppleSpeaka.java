package kr.hs.study.beans;

public class AppleSpeaka implements speaka {
	
	private int price;
	
	

	public AppleSpeaka() {
		super();
	}

	public AppleSpeaka(int price) {
		super();
		this.price = price;
	}
	
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public void volumeUp() {
		System.out.println("AppleSpeaka 볼륨 업!");
	}

	public void volumeDown() {
		System.out.println("AppleSpeaka 볼륨 다운...");
	}

}
