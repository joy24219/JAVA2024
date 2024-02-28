package kr.or.ddit.study02.sec02;

public class StringExample {
	public static void main(String[] args) {
		// 문자와 문자열
		// 문자   : 한 글자데이터로 ''로 묶어 선언 => char
		// 문자열 : 복수개의 글자로 구성된 자료 (데이터 타입은 아님), ""으로 묶어서 선언 (String)
		
		// \n     : 개행 줄바꿈 스크린 커서 위치를 다음줄의 처음으로 옮김.
		// \r     : 캐리지 리턴 스크린 커서 위치를 현재줄의 처음으로 옮김.
		// \t     : 수행 탭 스크린 커서를 다음 탭으로 옯김.
		// \\     : 역슬래시 문자를 출력할 때 사용.
		// \"     : 큰 따옴표를 출력할 때 사용.
		// \'     : 작은 따옴표를 출력할 때 사용.
		
		String name1 = "강감찬";
		String name2 = "이순신";
		
		System.out.println(name1+"\t"+name2);
		
		System.out.println(name1+"\n"+name2);
		System.out.println(name1+"\r"+name2);
		System.out.println(name1+"\r\n"+name2);
		
		System.out.println("\""+name1+"\"\t\""+name2+"\"");
	}
}
