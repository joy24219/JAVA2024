package kr.or.ddit.study03;

public class ArtimeticExample {
	public static void main(String[] args) {
		//산술연산자
		//종류 : +,-,/,*,%
		//사칙연산과 마찬가지로 /, * 먼저 적용된다.
		
		int a = 5;
		int b = 3;
		
		System.out.println("덧셈\t"+(a+b));
		System.out.println("뺄셈\t"+(a-b));
		System.out.println("곱셈\t"+(a*b));
		System.out.println("나눗셈\t"+(a/b));

		System.out.println("나머지\t"+(a%b));
		
		//나머지는 홀수인지 짝수인지 확인할때 나머지가 1인 경우 홀수
	}
}