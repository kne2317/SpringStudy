package kr.hs.study.beans;

public class SamsungTV implements TV {
	
	int price;
	SonySpeaka speaka;
	
	

	public SamsungTV() {
		
	}

	public SamsungTV(int price, SonySpeaka speaka) {
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

	public SonySpeaka getSpeaka() {
		return speaka;
	}

	public void setSpeaka(SonySpeaka speaka) {
		this.speaka = speaka;
	}

	
	
	
	
	public void powerOn() {
		
		System.out.println("SamsungTV 파워 업!");
		
	}
	
	public void powerDown() {

		System.out.println("SamsungTV 파워 다운...");
	}

}
