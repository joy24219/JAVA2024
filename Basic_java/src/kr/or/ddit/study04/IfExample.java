package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	/*public void method6(){
		//점수를 입력받고 학점을 출력하세요. 90이상a, 
		
		System.out.println("!!!!!!!!학점계산기!!!!!!!!\n");
		System.out.print("학점입력 : ");
		int score = sc.nextInt();
		
		String chk = ""+score;
		char passChk = chk.charAt(1);  
		chk =""+passChk;		
		int passChkNum = Integer.parseInt(chk);
		
		String pass = "";
		
		if(score>100) {
			pass="오류";
		}else if(100>=score && score>=90) {
			pass="A";
			if(100==score) { pass+="+";}
			else if(passChkNum>=0 && passChkNum<=2) {
				pass +="-";
			}else if(passChkNum>=3 && passChkNum<=6) {
				pass +="0";
			}else if(passChkNum>=7 && passChkNum<=9) {
				pass +="+";
			}
			
		}else if(score>=80) {
			pass="B";
			if(passChkNum>=0 && passChkNum<=2) {
				pass +="-";
			}else if(passChkNum>=3 && passChkNum<=6) {
				pass +="0";
			}else if(passChkNum>=7 && passChkNum<=9) {
				pass +="+";
			}
		}else if(score>=70) {
			pass="C";
			if(passChkNum>=0 && passChkNum<=2) {
				pass +="-";
			}else if(passChkNum>=3 && passChkNum<=6) {
				pass +="0";
			}else if(passChkNum>=7 && passChkNum<=9) {
				pass +="+";
			}
		}else if(score>=60) {
			pass="D";
			if(passChkNum>=0 && passChkNum<=2) {
				pass +="-";
			}else if(passChkNum>=3 && passChkNum<=6) {
				pass +="0";
			}else if(passChkNum>=7 && passChkNum<=9) {
				pass +="+";
			}
		}else if(score<60 && score>=0){
			pass="F";
		}else {
			pass="오류";
		}
		
		System.out.println("당신의 학점은 \""+pass+"\" 입니다.");
		
	}*/
	public void method6(){
		//점수를 입력받고 학점을 출력하세요. 90이상a, 
		
		System.out.println("!!!!!!!!학점계산기!!!!!!!!\n");
		System.out.print("학점입력 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score==100) { grade="A+"; }
		else if(score>=90) { grade="A"; }
		else if(score>=80) { grade="B"; }
		else if(score>=70) { grade="C"; }
		else if(score>=60) { grade="D"; } 
		else{ grade="F"; }
		
		if(100!=score && score>60) {
			if(score%10>=0 && score%10<=2) {
				grade +="-";
			}else if(score%10>=3 && score%10<=6) {
				grade +="0";
			}else if(score%10>=7 && score%10<=9) {
				grade +="+";
			}
		}
		
		System.out.println("당신의 학점은 \""+grade+"\" 입니다.");
		
	}	
	
	
	public void method5(){
		//점수를 입력받고 학점을 출력하세요. 90이상a, 
		
		System.out.println("!!!!!!!!학점계산기!!!!!!!!\n");
		System.out.print("학점입력 : ");
		int score = sc.nextInt();
		String pass = "";
		
		if(score>100) {
			pass="오류";
		}else if(100>=score && score>=90) {
			pass="A";
		}else if(score>=80) {
			pass="B";
		}else if(score>=70) {
			pass="C";
		}else if(score>=60) {
			pass="D";
		}else if(score<60 && score>=0){
			pass="F";
		}else {
			pass="오류";
		}
		
		System.out.println("당신의 학점은 \""+pass+"\" 입니다.");
		
	}
	public void method4(){
		//달을 입력받아서 봄,여름, 가을, 겨울을 출력
		
		System.out.println("달을 입력해주세요.");
		int month = sc.nextInt();
		String season = "";
		
		if(month == 12 || month == 1 || month == 2) {
			season="겨울";
		}else if(month >= 3 && month <= 5) {
			season="봄";
		}else if(month == 6 || month == 7 || month == 8) {
			season="여름";
		}else if(month == 9 || month == 10 || month == 11) {
			season="가을";
		}else {
			season="잘못된 값";
		}
		System.out.println(month+"는 "+season+" 입니다.");
	}
	public void method3() {
		// 점수를 입력받아서 60점 이상이면 합격 아니면 불합격 출력
		
		System.out.println("점수를 입력하세요.");
		int sco = sc.nextInt();
		String pass;
		
		if(sco>=60) {
			pass = "합격";
		}else {
			pass = "불합격";
		}		
		System.out.println("당신의 점수는 "+sco+"점이며 "+pass+"입니다.");
	}
	public void method2() {
		//if(조건식){
		// 조건이 참일때 실행
		//}else{
		// 조건이 거짓일때 실행
		//}
		
		System.out.println("1");
		if(true) {
			System.out.println("참");
		}else{
			System.out.println("거짓");
		}			
		System.out.println("2");
	}
	public void method1() {
		//if(조건식){
		
		// 조건식이 참일때 실행됨.
		
		//}
		
		System.out.println("1");
		if(true) {
			System.out.println("실행됨");
		}
		System.out.println("2");
	}	
}
