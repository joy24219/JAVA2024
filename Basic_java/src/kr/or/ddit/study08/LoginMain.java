package kr.or.ddit.study08;

public class LoginMain {
	public static void main(String[] args) {
		int state =0;
		
		ILogin login = null;
		String id ="";
		String pw ="";
		if(state ==0 ) {
			login = new LoginImple();
			System.out.println("스캐너로 입력");
			id ="id";
			pw = "pw";
		}
		if(state ==1 ) { 
			login = new MobileLoginImple();
			System.out.println("모바일 키패드 입력");
			id ="id";
			pw = "pw";
		}
		
		login.login(id, pw);
	}
}
