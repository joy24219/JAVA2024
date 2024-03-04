package kr.or.ddit.study10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	//일반예외는 실행전에도 생김. 실행하지 않아도 예외를 처리해야하는것
	// RuntimeException //실행했을떄 발생하는 애러
	// RuntimeException 자식 
		// NullPointException 
		// ClassCastException	 타입에 맞지 않은 
		// NumberFormatException 타입에 맞지 않은 값을 입력시
	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ExceptionExample ee = new ExceptionExample();
		ee.process();
	}
	public void process() {
		System.out.print("숫자입력 : ");
		try {
			double num = sc.nextInt();
			System.out.println("입력된 결과 : "+num);			
		} catch (IndexOutOfBoundsException e) {
			// System.out.println(e); //에러값확인
			// e.printStackTrace();   //자세한 애러값확인
			System.out.println("숫자만 입력하세요!");
		} catch (InputMismatchException e) {
			// System.out.println(e); //에러값확인
			// e.printStackTrace();   //자세한 애러값확인
			System.out.println("숫자만 입력하세요!");
		} finally {
			//반드시 실행해야하는 구문을 작성. ex.서버관련
		}
		
		System.out.println("프로그램이 완료 되었습니다.");
	}
}
