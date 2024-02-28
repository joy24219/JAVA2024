package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "전학생";
		s2.name = "난학생";
		
		s1.phone = "010-1111-1111";
		s2.phone = "010-2222-2222";
		
		s1.gender = "여성";
		s2.gender = "남성";
		
		Student s3 =  new Student("이희진","010-0000-0000","여");
		
	}
}
