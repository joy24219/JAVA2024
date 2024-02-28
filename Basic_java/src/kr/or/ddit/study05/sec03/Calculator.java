package kr.or.ddit.study05.sec03;

public class Calculator {
	//더하기 빼기 나누기 곱하기 메소드
	public static void main(String[] args) {
		
	}
	
	public double cal(int a, CalType type, int b) {
		if(type == CalType.ADD) return add(a,b);
		else if(type == CalType.SUB) return sub(a,b);
		else if(type == CalType.MUL) return mul(a,b);
		else if(type == CalType.DIV) return div(a,b);
		else if(type == CalType.PER) return per(a,b);
		else {
			System.out.println("지원하지 않는 연산자 입니다.");
			return 0;
		}
	}
	private int add(int a, int b){
		return a+b;
	}
	private int sub(int a, int b){
		return a-b;
	}
	private int mul(int a, int b){
		return a*b;
	}
	private double div(int a, int b){
		return (double)a/b;
	}
	private int per(int a, int b){
		return a%b;
	}
}
