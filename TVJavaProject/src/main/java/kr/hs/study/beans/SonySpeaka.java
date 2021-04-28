package kr.hs.study.beans;

public class SonySpeaka implements speaka {
	
	private int price;
	
	

	public SonySpeaka() {
		super();
	}

	public SonySpeaka(int price) {
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
		System.out.println("SonySpeaka 볼륨 업!");
	}

	public void volumeDown() {
		System.out.println("SonySpeaka 볼륨 다운...");
	}

}
