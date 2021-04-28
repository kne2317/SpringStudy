package kr.hs.study.beans;

public class LgTV implements TV {

	public LgTV() {
		System.out.println("LgTV 생성자");
	}
	
	public void volumeUp() {
		System.out.println("LgTV 볼륨업");
	}

	public void volumeDown() {
		System.out.println("LgTV 볼륨다운");
	}

	public void powerOn() {
		System.out.println("LgTV 파워온");
	}

	public void powerOff() {
		System.out.println("LgTV 파워오프");
	}

}
