package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.mehtod2();
	}
	
	public void method1() {
		//삼항 연산자 : 3개의 피연산자를 필요로하는 연산
		//              삼항연산자는 ? 앞의 조건식의 결과에 따라 콜론 앞뒤의 
		//              피연산자가 선택 조건 연산식이라고도 함.
		
		// 참인경우는 : 기준 앞, 거짓인 경우에는 : 기준 뒤가 나옴.
//		String result = true ? "참" : "거짓";
//		System.out.println(result);
		
		// 나이를 입력받고 18보다 크거나 같은 경우 성년을 출력 작을경우 미성년출력
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String result = age>=18 ? "성년" : "미성년" ;
		System.out.println("당신의 나이는 "+age+"살이고 "+result+"입니다.");
	}
	public void mehtod2() {
		// a, b 값을 int로 입력받고 a값이 짝수일때는 a+b, a값이 홀수 일때는 a*b 연산을 하여 결과를 출력
		
		System.out.print("a의 값을 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("b의 값을 입력하세요 : ");
		int b = sc.nextInt();
		
		int rest = a%2; 
		
		int result = rest==0 ? a+b : a*b;
		System.out.print("결과 : "+result);
		
	}

}
