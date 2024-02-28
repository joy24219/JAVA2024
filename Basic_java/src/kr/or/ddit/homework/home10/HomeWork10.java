package kr.or.ddit.homework.home10;

public class HomeWork10 {
	public static void main(String[] args) {
		// home 10 패키지에 클래스를 만들어서 제출 할것. 
		HomeWork10 hw = new HomeWork10();
		hw.method1();
		hw.method2();
		hw.method3();
		hw.method4();
		
	}
	public void method4() {
		// 원통을 나타내는 Cylinder 클래스는 Circle 형의 원과 
		// 실수형의 높이를 필드로 선언 
		// 원의 부피넓이 구하기 부피를 자동계산 할것.
		// 부피 구하는 공식 원의 넓이 * 높이
		// 높이 10, 반지름 5로 설정해줌
		
		Cylinder c1 = new Cylinder();
		System.out.println(c1);
		
	}
	public void method3() {
		// 세 과목의 성적을 입력 받고 총점과 평균을 출력할수 있는 
		// Grade 클래스를 설계 하시오.
		Grade g1 = new Grade(90,77,86);
		System.out.println(g1);
	}
	public void method2() {
		// 제조사 생산년도 크기를 출력하는 Tv 클래스를 설계 하시오.
		Tv tv1 = new Tv("삼성", 2024, 88);
		System.out.println(tv1);
	}
	public void method1() {
		// 1. 다음을 만족하는 Student 클래스를 작성하시오. 
		//    String 학과 정수형의 학번을 필드로 선언 
		//    해당 메소드에서 클래스를 생성 및 적당한 값을 입력후 출력
		
		Student std1 = new Student("정윤지","컴퓨터공학과","2024S001");
		System.out.println(std1);
	}
}
