package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.name = "정윤지";
		std2.name = "정민지";
		
		std1.kor = 80;
		std2.kor = 90;
		
		std1.eng = 80;
		std2.eng = 85;
		
		std1.math = 95;
		std2.math = 90;
		
		std1.avg = (std1.kor + std1.eng + std1.math)/3 ;
		std2.avg = (std2.kor + std2.eng + std2.math)/3 ;
		
		
		System.out.println(std1.name+" 학생의 점수 \n 국어 :"+std1.kor+"\n 영어 :"+std1.eng+"\n 수학: "+std1.math+"\n 평균 :"+std1.avg);
	}
}
