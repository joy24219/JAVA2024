package kr.or.ddit.study02.sec03;

public class TypeChage02 {
	public static void main(String[] args) {
		// 문자열 -> 다른타입으로 변환
		// 타입 변수명 = 타입 앞글자를 대문자 + .parse타입 앞글자를 대문자
		
		
//		String s1 = "120";
//		
////		byte b1 = Byte.parseByte(s1);
//		byte b1 = Byte.valueOf(s1);
//		
//		System.out.println(b1+2);
//		
//		Long l1 = Long.parseLong(s1);

		String s1 = "12";
		String s2 = "10";
		
		// s1, s2를 int 값으로 바꾸고 두값을 더하여 출력
		
		int i1 = Integer.parseInt(s1);
		int i2= Integer.valueOf(s2);
		
		System.out.println(i1+i2);
	
	}
}
