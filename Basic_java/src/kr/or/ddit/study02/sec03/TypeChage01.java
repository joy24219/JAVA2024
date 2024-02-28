package kr.or.ddit.study02.sec03;

public class TypeChage01 {
	public static void main(String[] args) {
		String s1 = "20";
		String s2 = "23";
		System.out.println(s1+s2);
		
		int i2 = 23;
		System.out.println(s1+i2);
		System.out.println(i2+s1);
		
		int i1 = 20;
		System.out.println(i1+i2);
		
		String str = ""+i1+i2;
		System.out.println(str);
	}
}
