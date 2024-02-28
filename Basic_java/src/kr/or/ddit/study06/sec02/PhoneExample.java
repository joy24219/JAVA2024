package kr.or.ddit.study06.sec02;

public class PhoneExample {
	public static void main(String[] args) {		
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		
		p1.name = "갤럭시 s24";
		p2.name = "갤럭시 s23";
		
		p1.year = 2024;
		p2.year = 2023;

		p1.camera = "삼성";
		p2.camera = "삼성";
		
//		System.out.printf("%s는 %d년도에 나왔으며 %s의 카메라를 사용하고 있습니다.",p1.name,p1.year,p1.camera);
		System.out.println(p1);
	}
}
