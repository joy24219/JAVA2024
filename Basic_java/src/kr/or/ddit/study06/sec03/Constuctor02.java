package kr.or.ddit.study06.sec03;

public class Constuctor02 {
	String a;
	String b;
	
	public Constuctor02() {
		this("a");
	}
	public Constuctor02(String a) {
		this(a,"b");
	}
	public Constuctor02(String a, String b) {
		this.a = a;
		this.b = b;
	}
}
