package kr.or.ddit.study11;

import java.io.File;
import java.util.Scanner;

public class StringLang {
	public static void main(String[] args) {
		StringLang obj = new StringLang();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}
	public void method7() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("계속하시겠습니까?(Y/N)");
			
			String yn = sc.next();
//			if(yn.equals("n") || yn.equals("N")) break;
			if(yn.equalsIgnoreCase("n")) break; //equalsd와 toUpperCase, toLowerCase를 준 효과.			
			
		}
		System.out.println("종료되었습니다.");
	}

	public void method6() {
		String test = "test1, "
				+ "test2, "
				+ "test3, "
				+ "test4, "
				+ "test5";
		
		String[] tokens = test.split(",");
		
		for(String string:tokens) {
			System.out.println(string.trim());
		}
	}
	public void method5() {
		String test = "가나다라마바보";
		System.out.println(test);
		test=test.replace("바보", "착하지만 모자란 친구");
		System.out.println(test);
		//test.replaceAll("정규식","바뀔문자");
	}
	public void method4() {
		String test =" test   \n   ";
		System.out.println(test);
		System.out.println("===================");
		
		test= test.trim(); // 앞뒤공백제거 (\n, \t는 제거)
		
		System.out.println(test);
		System.out.println("===================");
	}
	public void method3() {
		String test = "소문자 abcd";
		System.out.println(test);
		
		test = test.toUpperCase();
		System.out.println(test);
		
		test = test.toLowerCase();
		System.out.println(test);
		
		if(test.contains("ABCD")) {
			System.out.println("포함됨");
		}
		
		
	}
	public void method2() {
		String test = "문자열 test 입니다.";
		String search = "test";
		
		if(test.startsWith(search)) { //startsWith는 문자열 시작하는 단어를 찾아줌. 
			System.out.println(search+"로 시작합니다.");
		} 
		String end = "입니다.";
		if(test.endsWith(end)) { //endsWith는 문자열 마지막 단어를 찾아줌. 
			System.out.println(end+"로 끝납니다.");
		} 
		
		// 2024년으로 시작하는 엑셀 파일 이름을 출력하시오.
		
		File dir = new  File("원하는 파일경로");
		for(String name : dir.list()) {
			if(!name.startsWith("2024")) continue;
			if(name.endsWith(".xls")||name.endsWith(".xlsx")) System.out.println(name);
		}
	}
	public void method1() {
		String test = "문자열 test 입니다.";
		String search = "test";
		
		if(test.contains(search)) { //contains는 문자열에 문자가 있는지 검색. 
			System.out.println(search+" 값이 포함되어 있습니다.");
		}
	}
}
