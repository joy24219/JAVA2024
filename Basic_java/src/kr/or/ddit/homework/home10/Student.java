package kr.or.ddit.homework.home10;

public class Student {
	String name;
	String major;
	String num;
	
	public Student(String name ,String major, String num) {
		this.name =name;
		this.major =major;
		this.num =num;
	}

	@Override
	public String toString() {
		return "Student [이름=" + name + ", 학과=" + major + ", 학번=" + num + "]";
	}
	
}
