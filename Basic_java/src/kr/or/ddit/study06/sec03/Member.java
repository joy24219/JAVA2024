package kr.or.ddit.study06.sec03;

public class Member {
	String nation; // 기본값을 설정 할 수 있음.
	String group;
	String name;
	int age;

	public Member(String name, int age){
		this("304호", name, age );
	}
	public Member(String group, String name, int age){
		this("한국", group, name, age );
	}
	public Member(String nation, String group, String name, int age){
		this.nation =nation;
		this.group =group;
		this.name = name;
		this.age= age;
	}
	@Override
	public String toString() {
		return "Member [nation=" + nation + ", group=" + group + ", name=" + name + ", age=" + age + "]";
	}

}
