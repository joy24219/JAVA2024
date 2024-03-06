package util;

public enum View {
	
	 MAIN("홈")
	,MEMBER("회원")
	,MEMBERLIST("회원리스트")
	,ADMIN("관리자")
	,LOGIN("로그인")
	,SIGN("회원가입")
	;
	
	
	String title;
	View(String title){
		this.title = title;
	}
	
}
