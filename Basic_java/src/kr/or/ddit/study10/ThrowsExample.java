package kr.or.ddit.study10;

import java.util.Scanner;

/*
 * throw : 예외강제발생
 *       - 일반메소드 내부에서 사용
 *       - 사용형식
 *         throw 예외클래스
 *         ex_ throw new Exception();
 * throws : 예외미루기
 * 			Try ~ catch 블록을 예외 발생 가능성이 있는 명령문이 있는곳에서 
 * 			처리하지 않고 해당 메소드를 호출한 곳에서 예외처리를 강요할때 사용.
 * 
 *   		메소드명() throws 예외클래스명{
 *   		}
 * */
public class ThrowsExample {
	static String[] name= {"홍길동", "이순신", "강감찬"};
	private static void mian(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			String n;
			try {
				n=getArray(num);
				
			} catch (Exception e) {
				System.out.println("숫자가 범위를 벗어났습니다.");
				continue;
			}
			System.out.println("회원이름"+n);
			break;
		}
	}
	
	private static String getArray(int num) throws ArrayIndexOutOfBoundsException{
		return name[num];
	}
}
