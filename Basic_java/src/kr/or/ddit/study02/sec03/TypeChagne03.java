package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChagne03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TypeChagne03 obj = new TypeChagne03();
//		obj.method1();
		obj.method2();
	}
	
	public void method1() {
		/* 8개의 기본타입 작성하기 */
		
		byte  b1 = 10;
		short s2 = 10;
		int   i3 = 10;
		long  l4 = 10;
		
		char  c8 = 'a';
		char  c9 = 65;
		
		float f5 = 0.5f;
		double d6 = 0.5;
		
		boolean b7 = true;
		
		//String 기본타입X
		String str = "테스트";
	}	
	public void method2() {

		//1.int -> long 타입 변환 해보기 
		int i1 = 100;
		long l1 = i1;		
		
		//2.long -> int 타입 변환 해보기 
		long l2 = 100;
		int i2 = (int)l2;
		
		//3. char -> int 타입변환 해보기
		char c3 = 'a';
		int i3 = c3;
				
		//4. int -> char 타입 변환 해보기 
		int i4 = 10;
		char c4 = (char)i4;
		
		//5. int -> double 타입변환 해보기
		int i5 = 10;
		double d5 = i5;
		
		//6. double -> int 타입 변환 해보기 
		double d6 = 10.55;
		int i6 = (int)d6;

		 //7. int -> String 타입 변환 해보기
		int i7 = 10;
		String str7 = ""+i7;
		String s7 = String.valueOf(i7);
		
		//8. String -> int 타입 변환 해보기 
		String s8 = "10";
		int i8 = Integer.parseInt(s8);
		
		//9. char -> String 타입 변환 해보기. 
		char c9 = 'a';
		String s9 = ""+c9;
		
		//10. String -> char 타입 변환 해보기.
		String s10 = "abcd";
		char c10 = s10.charAt(1);
		System.out.println("s10->c10: "+s10+", + "+c10);
		
	}

}
