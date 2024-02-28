package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType03 obj = new ReferenceType03();
		obj.method1();
	}
	public void method1() {
		String str1="";   //주소값은 있으나 데이터가 없다. 
		String str2=null; //주소값이 없다.
	}
}
