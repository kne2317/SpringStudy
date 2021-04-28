package kr.hs.study.beans;

public class LGTV implements TV {
	
	int price;
	AppleSpeaka speaka;
	
	
	
	
	public LGTV() {
		
	}

	public LGTV(int price, AppleSpeaka speaka) {
		super();
		this.price = price;
		this.speaka = speaka;
	}
	

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleSpeaka getSpeaka() {
		return speaka;
	}

	public void setSpeaka(AppleSpeaka speaka) {
		this.speaka = speaka;
	}

	
	
	
	public void powerOn() {
		
		System.out.println("LgTV 파워 업!");
		
	}
	
	public void powerDown() {

		System.out.println("LgTV 파워 다운...");
	}
	
	

}
