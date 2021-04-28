package kr.hs.study.main;

import kr.hs.study.beans.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("Lee", 25);
		System.out.println(p.getName() + "  " + p.getAge());
		
		
		p.setName("Kim");
		p.setAge(30);
		System.out.println(p.getName() + "  " + p.getAge());
		
	}

}
