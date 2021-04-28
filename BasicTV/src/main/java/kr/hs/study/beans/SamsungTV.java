package kr.hs.study.beans;

public class SamsungTV implements TV {

	public SamsungTV() {
		System.out.println("SamsungTV 생성자");
	}

	public void volumeUp() {
		System.out.println("SamsungTV 볼륨업");
	}

	public void volumeDown() {
		System.out.println("SamsungTV 볼륨다운");
	}

	public void powerOn() {
		System.out.println("SamsungTV 파워온");
	}

	public void powerOff() {
		System.out.println("SamsungTV 파워오프");
	}


}
