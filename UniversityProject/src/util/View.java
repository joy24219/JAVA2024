package util;

public enum View {
	
	 HOME("홈")
	,CLASS_LIST("전체 강의 내역 조회")
	,CLASS_LIST_MEMBER("내 강의 내역 조회")
	,MEMBER_UPDATE("회원 정보 수정")
	
	,MEMBER_PRO("교수")
	,CLASS_INSERT("강의등록")
	,CLASS_UPDATE("강의변경")
	,CLASS_DELETE("강의삭제")
	
	,MEMBER_STD("회원")
	,CLASS_SING("강의신청")
	
	,LOGIN("로그인")
	;
	
	
	String title;
	View(String title){
		this.title = title;
	}
	
}
