package util;

public enum View {
	
	 HOME      ("홈")
	 
    ,MEMBER_HOME         ("회원페이지")
    
	,CHARACTER_GAME      ("게임하기")
	,COMMUNITY_HOME      ("커뮤니티")
	,STORE_BUY           ("특별상점")
	,MEMBER_INFO         ("마이페이지")
	
	,MEMBER_INFO_VIEW    ("내정보보기")
	,MEMBER_INFO_UPDATE  ("내정보수정")
	,MEMBER_MONEY_CHARGE ("금액충전")
	
	,CHARACTER_HOME      ("모든캐릭터조회")
	,CHARACTER_NEW       ("케릭터생성")
	,CHARACTER_UPDATE    ("케릭터수정")
	,CHARACTER_END       ("엔딩캐릭터조회")
	
	,COMMUNITY_NOTICE    ("공지게시판")
	,COMMUNITY_FREE      ("자유게시판")
	,COMMUNITY_ATTACK    ("공략게시판")
	,COMMUNITY_TOP       ("다마고치 TOP10")
	
	,COMMUNITY_DETAILS   ("게시글상세보기")
	,COMMUNITY_INSERT    ("게시글등록")
	,COMMUNITY_UPDATE    ("게시글수정")
	,COMMUNITY_DELETE    ("게시글삭제")

	,ADMIN_HOME          ("관리자페이지")	
	,ADMIN_DEFAULT_SET   ("초기값수정")
	,ADMIN_STORE         ("특별상점")
	,ADMIN_INFO_UPDATE   ("관리자비밀번호수정")
	
	,ADMIN_DEFAULT_EAT       ("초기값수정_먹기")
	,ADMIN_DEFAULT_TOGERTHER ("초기값수정_함께하기")
	,ADMIN_DEFAULT_BATH      ("초기값수정_목욕하기")
	,ADMIN_DEFAULT_TOILET    ("초기값수정_화장실가기")
	,ADMIN_DEFAULT_CLEAN     ("초기값수정_청소하기")
	,ADMIN_DEFAULT_GAME      ("초기값수정_게임하기")
	,ADMIN_DEFAULT_STUDY     ("초기값수정_교육하기")
	,ADMIN_DEFAULT_HOSPITAL  ("초기값수정_병원가기")
	
	,ADMIN_STORE_INSERT      ("특별상점_등록")
	,ADMIN_STORE_UPDATE      ("특별상점_수정")
	,ADMIN_STORE_DELETE      ("특별상점_삭제")
	

	,LOGIN  ("로그인")
	,LOOUT  ("로그아웃")
	,SIGN   ("회원가입")	
	,BACK   ("뒤로가기")
	;
	
	
	String title;
	View(String title){
		this.title = title;
	}
	
}
