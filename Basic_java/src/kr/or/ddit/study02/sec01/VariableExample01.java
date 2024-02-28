package kr.or.ddit.study02.sec01;

public class VariableExample01 {
	static short sh;
	
	public static void main(String[] args) {
		int value = 100;
		String stName = "홍길동";
		boolean flag = true;
		sh++;
		Shape s= new Shape();
		{
			int a = 10;
		}
		int a = 7;
//		int value = 20;
	}
	public void test() {
		sh++;
	}
}
class Shape{
	String type;
}