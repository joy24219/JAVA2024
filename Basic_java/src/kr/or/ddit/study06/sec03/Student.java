package kr.or.ddit.study06.sec03;

public class Student {
	String name;
	String phone;
	String gender;
	
	public Student() {
		
	}
	public Student(String name, String phone, String gender) {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(gender);
		System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.gender);
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		System.out.println(this.name);
		System.out.println(this.phone);
		System.out.println(this.gender);
	}
}
