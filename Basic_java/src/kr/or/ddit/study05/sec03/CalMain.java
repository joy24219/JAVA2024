package kr.or.ddit.study05.sec03;

public class CalMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result = cal.cal(3,CalType.ADD,1);
		
		System.out.println(result);
		
	}
}
