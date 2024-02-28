package kr.or.ddit.homework;

public class HomeWork09 {
	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
//		obj.method1();
		obj.method2();

	}
	public void method2() {
		int n = 5427;
		String txtN = ""+n;
		
		for(int i=0; i<txtN.length(); i++){
            
        }
	}
	public void method1() {
		//학생 5명을 만들고 각각 데이터를 입력할것.
		
		//타입선언
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		
		//학생이름
		String[] stuName = {"미연", "민니", "소연", "우기", "슈화"};
		
		//과목수
		int subject = 3;
		
		// 국어 영어 수학 총점 평균 등수
		int[][] scoreNums = {{80,70,80,0,0,1},
							 {90,85,90,0,0,1},
							 {90,70,75,0,0,1},
							 {65,75,70,0,0,1},
							 {80,80,70,0,0,1}};	
		
		// 점수배열에 학생정보입력.
		Student[] scores = {s1,s2,s3,s4,s5};
		
		// 값입력
		for(int i=0; i<scores.length; i++) {
			scores[i].name = stuName[i];
			scores[i].kor = scoreNums[i][0];
			scores[i].eng = scoreNums[i][1];
			scores[i].met = scoreNums[i][2];
			scores[i].sum = scoreNums[i][3];
			scores[i].avg = scoreNums[i][4];
			scores[i].rank = scoreNums[i][5];
		}
		
		for(int i=0; i<scores.length; i++) {
			//총점구하기
			scores[i].sum = scores[i].kor + scores[i].eng + scores[i].met;
			//평균구하기
			scores[i].avg = (double)((int)(((double)scores[i].sum / subject)*10+0.5)/10.0);
		}
		
		//정렬하기 
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores.length; j++) {
				if(scores[i].sum >scores[j].sum) {
					Student temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		for(int i=0; i<scores.length; i++) {
			//등수구하기
			if((i!= 0 && scores[i].sum != scores[i-1].sum)||i == 0) scores[i].rank = i+1;
			else scores[i].rank = i;
			//출력하기
			System.out.println(scores[i]);
		}
 	}
	class Student{
		//홈워크 8번에 각 데이터를 타입으로 입력할것.
		String name;
		int kor, eng, met, sum, rank;
		double avg;
		
		@Override
		public String toString() {
			return name+" [ 국어: "+kor+" | 영어: "+eng+" | 수학: "+met+" | 총점: "+sum+" | 평균: "+avg+" | 등수: "+rank+" ]";
		}
	}

}
