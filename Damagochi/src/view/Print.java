 package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.RenkTop10Dao;
import util.ScanUtil;
import util.View;
import vo.BoardCategoryVo;
import vo.BoardCommentVo;
import vo.BoardPostVo;
import vo.CharacterVo;
import vo.DefaultSetVo;
import vo.MemberItemListVo;
import vo.MemberVo;
import vo.PlayingCharacterVo;
import vo.RenkTop10Vo;
import vo.StoreVo;

public class Print {
	//기본세팅값
	public void printVar() {
		System.out.println("======================================================================================================================================================================");
	}
	public void printLn(int line) {
		for(int i=0; i<line; i++) System.out.println();
	}
	public void printUnder() {
		printLn(1);
		printVar();
	}
	public void printTop() {
		printLn(2);
		printVar();
	}
	public void printTitle(String str) {
		System.out.println("\t[==== "+str+" ====]\t");
	}
	public void printError() {
		System.out.println("입력 값을 확인해주세요.");
	}
	
	
	//컨트롤러 출력값
	public void printHome(){
		printTop();
		printTitle("다마고치");
		printLn(2);
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		printUnder();
	}

	public List<Object> printLogin(){
		printTop();
		printTitle("로그인");
		printLn(2);
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PASS : ");
		printUnder();
		
		List<Object> param = new ArrayList<Object>();//DB에 값 비교
		param.add(id);
		id= id.trim();
		param.add(pw);
		pw= pw.trim();
		
		return param;
	}

	public void printMamberHome(){
		printTop();
		printTitle("다마고치 메인화면");
		printLn(2);
		System.out.println("1. 게임시작");
		System.out.println("2. 커뮤니티");
		System.out.println("3. 특별상점");
		System.out.println("4. 마이페이지");
		System.out.println("5. 로그아웃");
		printUnder();
	}
	public void printMyPage(){
		printTop();
		printTitle("마이페이지");
		printLn(2);
		System.out.println("1. 내정보보기");
		System.out.println("2. 내정보수정");
		System.out.println("3. 캐쉬충전");
		System.out.println("4. 모든 캐릭터 조회");
		System.out.println("5. 메인화면");
		printUnder();
	}
	public void printInfo(String title, MemberVo myInfo){        //내정보수정
		printTop();
		printTitle(title);
		printLn(2);
	    System.out.println(
	    		  "이름     : "+myInfo.getMem_name()+"\n"
	    		 +"연락처   : "+myInfo.getMem_telno()+"\n"
	    		 +"생년월일 : "+myInfo.getMem_bir()+"\n"
	    		 +"보유금액 : "+myInfo.getMem_money()+"\n"
	    		  );
		printVar();
		if(title.equals("내정보수정")) {
			printLn(1);
			System.out.println("※ 값을 입력하지 않으면 기존값이 유지");
			printLn(1);
		}
	}
	public void printInfoView(String title, MemberVo myInfo){    //내정보보기
		printInfo(title, myInfo);
		System.out.println("1. 내정보수정");
		System.out.println("2. 마이페이지");
		System.out.println("3. 메인화면");
		printUnder();
	}
	public void printMemberMoney(MemberVo myInfo){               //금액충전
		printTop();
		printTitle("금액충전");
		printLn(2);
	    System.out.println("보유금액 : "+myInfo.getMem_money()+"\n");
	    System.out.println("1. 금액충전");
	    System.out.println("2. 마이페이지");
		printUnder();
	}

	public void printAdminHome(){                                //관리자페이지
		printTop();
		printTitle("관리자페이지");
		printLn(2);
		System.out.println("1. 초기값수정");
		System.out.println("2. 커뮤니티");
		System.out.println("3. 특별상점");
		System.out.println("4. 비밀번호변경");
		System.out.println("5. 로그아웃");
		printUnder();
	}
	public void printAdminDefault(String title){                 //관리자_상호작용목록
		printTop();
		printTitle(title);
		printLn(2);
		System.out.println("1. 먹기");
		System.out.println("2. 함께하기");
		System.out.println("3. 목욕하기");
		System.out.println("4. 화장실가기");
		System.out.println("5. 청소하기");
		System.out.println("6. 게임하기");
		System.out.println("7. 교육하기");
		System.out.println("8. 병원가기");
		System.out.println("9. 메인화면");
		printUnder();
	}
	
	public void printStoreList(String title, List<StoreVo> itemList, boolean count){         //관리자_특별상점목록
		printTop();
		printTitle(title);
		printLn(2);
		int cnt = 1;
		if(itemList.size() == 0 ) {
			System.out.println("특별상품없음.");
		}else {
			for(StoreVo item : itemList) {
				if(count) {System.out.println("\n"+cnt); cnt++;}
			    System.out.println(
			    		"----------------------------------------\n"
			    		 +"  상품명   : "+item.getStr_name()+"\t"
			    		 +"상품설명 : "+item.getStr_content()+"\n"
			    		 +"  재고     : "+item.getStr_count()+"\t"
			    		 +"금액     : "+item.getStr_money()+"\n"
			    		 +"  포만감   : "+item.getStr_full()+"\t"
			    		 +"친밀도   : "+item.getStr_intimacy()+"\t"
			    		 +"청결도   : "+item.getStr_clean()+"\t"
			    		 +"즐거움   : "+item.getStr_joy()+"\t"
			    		 +"지식     : "+item.getStr_knowledge()+"\n"
			    		 +"----------------------------------------"
			    		  );
			}
		}
	}
	public void printAdminStore(List<StoreVo> itemList){         //관리자_특별상점목록
		printStoreList("특별상점", itemList, false);
		printVar();
		System.out.println("1. 아이템등록");
		System.out.println("2. 아이템수정");
		System.out.println("3. 아이템삭제");
		System.out.println("4. 메인화면");
		printUnder();
	}
	public void printMemberStore() {
		printTop();
		printTitle("특별상점");
		printLn(2);
		System.out.println("1. 내 특별 아이템 보기");
		System.out.println("2. 특별상점 아이템 구매");
		System.out.println("3. 메인화면");
		printUnder();
	}
	public void printMemberItemList(List<MemberItemListVo> memberItemList) {
		printTop();
		printTitle("내 특별 아이템 보기");
		printLn(2);
		if(memberItemList.size() == 0 ) {
			System.out.println("보유한 특별상품없음.");
		}else {
			for(MemberItemListVo item : memberItemList) {
			    System.out.println(
			    		"----------------------------------------\n"
			    		 +"  상품명   : "+item.getName()+"\t"
			    		 +"상품설명 : "+item.getContent()+"\n"
			    		 +"  재고     : "+item.getCount()+"\t"
			    		 +"금액     : "+item.getMoney()+"\n"
			    		 +"  포만감   : "+item.getFull()+"\t"
			    		 +"친밀도   : "+item.getIntimacy()+"\t"
			    		 +"청결도   : "+item.getClean()+"\t"
			    		 +"즐거움   : "+item.getJoy()+"\t"
			    		 +"지식     : "+item.getKnowledge()+"\n"
			    		 +"----------------------------------------"
			    		  );
			}
		}
	}
	
	
	public void printGame(String title, List<PlayingCharacterVo> characterList, boolean count){      //캐릭터 플레이 리스티
		printTop();
		printTitle(title);
		printLn(2);
		int cnt = 1;
		if(characterList.size() == 0 ) {
			System.out.println("조회할 캐릭터가 없습니다. 캐릭터를 생성해주세요.");
		}else {
			for(PlayingCharacterVo character : characterList) {
	    		if(count) {System.out.print(cnt+". "); cnt++;}
			    System.out.println(
			    		  "[ 캐릭터명 : "+character.getChar_name()+" | "
			    		 +"개월수 : "+character.getChar_age()+" | "
			    		 +"포만감 : "+character.getChar_full()+" | "
			    		 +"친밀도 : "+character.getChar_intimacy()+" | "
			    		 +"청결도 : "+character.getChar_clean()+" | "
			    		 +"즐거움 : "+character.getChar_joy()+" | "
			    		 +"지식 : "+character.getChar_knowledge()+" | "
			    		 +"다마머니 : "+character.getChar_money()+" ]"
			    		  );
			}
		}
		printVar();
	}
	public void printGameNew(){      //캐릭터 생성
		printTop();
		printTitle("캐릭터 생성");
		printLn(2);
		printVar();
	}
	public void printGameHome(String title,List<PlayingCharacterVo> characterList, boolean count){   //캐릭터 홈
		printGame(title, characterList,count);
		System.out.println("1. 게임하기");
		System.out.println("2. 캐릭터 생성");
		System.out.println("3. 캐릭터 수정");
		System.out.println("4. 앤딩캐릭터 조회");
		System.out.println("5. 캐릭터 삭제");
		System.out.println("6. 마이페이지");
		printUnder();
	}
	public void printGamePlaying(String title,List<PlayingCharacterVo> characterList, boolean count){//캐릭터 생성
		printGame(title, characterList,count);
		System.out.println("4. 캐릭터 생성");
		System.out.println("5. 모든캐릭터보기");
		System.out.println("6. 메인화면");
		printUnder();
	}
	
	public void printDeaultSet(String title, List<DefaultSetVo> defaultList){        //관리자_초기값목록
		printTop();
		printTitle(title);
		printLn(2);
		if(defaultList.size() == 0 ) {
			System.out.println("상호작용아이템 없음.");
		}else {
			System.out.println("번호\t상품명\t나이제한\t금액\t포만감\t친밀도\t청결도\t즐거움\t지식");
			for(DefaultSetVo item : defaultList) {
			    System.out.println(
			    		 " "+item.getDef_no()+"\t"+item.getDef_name()+"\t"
			    		 +item.getDef_age()+"\t"+item.getDef_money()+"\t"
			    		 +item.getDef_full()+"\t"+item.getDef_intimacy()+"\t"
			    		 +item.getDef_clean()+"\t"+item.getDef_joy()+"\t"
			    		 +item.getDef_knowledge()+"\n"
			    		  );
			}
		}
		printUnder();
	}
	public List<Object> printAdminStoreInsert(){                       //관리자_초기값생성
		String name = ScanUtil.nextLine("상품명: ");
		name = name.trim(); //공백제거
	    int money = ScanUtil.nextInt("가격: ");
	    int full = ScanUtil.nextInt("포만감: ");
	    int intimacy = ScanUtil.nextInt("친밀도: ");
	    int clean = ScanUtil.nextInt("청결도: ");
	    int joy = ScanUtil.nextInt("즐거움: ");
	    int knowledge = ScanUtil.nextInt("지식: ");
	    String content = ScanUtil.nextLine("상품 설명: ");
	    content = content.trim(); //공백제거
	    int count = ScanUtil.nextInt("상품 수량: ");	    
	    
	    List<Object> param = new ArrayList();
    	param.add(name);
    	param.add(money);
    	param.add(full);
    	param.add(intimacy);
    	param.add(clean);
    	param.add(joy);
    	param.add(knowledge);
    	param.add(content);
    	param.add(count);
    	
    	return param;
	}
	public List<Object> printAdminDefaultUpDate(int sel, int intSel){  //관리자_초기값수정
		
		List<Object> param = new ArrayList<Object>();
		
		String name = ScanUtil.nextLine("선택지명 : ");
		name = name.trim(); //공백제거
		String age = ScanUtil.nextLine("나이제한 : ");
		int money = ScanUtil.nextInt("가격 : ");
		int full = ScanUtil.nextInt("포만감 : ");
		int intimacy = ScanUtil.nextInt("친밀도 : ");
		int clean = ScanUtil.nextInt("청결도 : ");
		int joy = ScanUtil.nextInt("즐거움 : ");
		int knowledge = ScanUtil.nextInt("지식 : ");
		param.add(name);
		param.add(age);
		param.add(money);
		param.add(full);
		param.add(intimacy);
		param.add(clean);
		param.add(joy);
		param.add(knowledge);
		param.add(intSel);
		param.add(sel);

		return param;
	}
	
	
	public void printBoardList(List<BoardCategoryVo> boardList){         //커뮤니티 리스트
		printTop();
		printTitle("커뮤니티");
		printLn(2);
		int cnt = 1;
		
		
		for(BoardCategoryVo board : boardList) {
			System.out.print(cnt+". "); cnt++;
		    System.out.println(board.getCtr_name());
		}
		
		System.out.print(cnt+". "); cnt++;
	    System.out.println("TOP10");
		System.out.print(cnt+". "); cnt++;
	    System.out.println("메인으로");
		printUnder();
	}
	public void printPostList(String title,List<BoardPostVo> postList, boolean count){         //게시글 리스트
		printVar();
		printTitle(title);
		printLn(2);
		int cnt = 1;
		
		if(postList.size() == 0 ) {
			System.out.println("게시글이 없습니다.");
		}else {
			for(BoardPostVo post : postList) {
				if(count) {System.out.print(cnt+". "); cnt++;}
			    System.out.print(post.getTitle()+" ");
			    System.out.print(post.getMem_name()+" ");
			    System.out.println(post.getBrd_date());
			    System.out.println("────────────────────────────");
			}
		}		
	}
	public void printPostListMenu(String title,List<BoardPostVo> postList, boolean count, String readonly, String admin){  //게시글 선택지
		printPostList(title,postList,count);
		System.out.println("1. 게시글선택");
		if(admin.equals("Y") || readonly.equals("N")){
			System.out.println("2. 게시글작성");
			System.out.println("3. 커뮤니티");
			System.out.println("4. 메인화면");
		}else if(readonly.equals("Y")) {
			System.out.println("2. 커뮤니티");
			System.out.println("3. 메인화면");
		} 
		printUnder();
	}
	public void printPostDerails(BoardPostVo post) {
		printTop();
		System.out.println(post.getTitle()+"\t\t"+post.getBrd_date());
		printLn(1);
		System.out.println("글쓴이 : "+post.getMem_name());
		printLn(1);
		System.out.println(post.getContent());
		printUnder();
	}
	public void printCommentList(List<BoardCommentVo> commentList, boolean count){         //게시글 리스트
		printLn(2);
		System.out.println("[=댓글=]");
		printLn(1);
		printVar();
		int cnt = 1;
		
		if(commentList.size() == 0 ) {
			System.out.println("댓글이 없습니다.");
			printVar();
		}else {
			for(BoardCommentVo comment : commentList) {
				if(count) {System.out.print(cnt+". "); cnt++;}
			    System.out.print(comment.getMem_name()+"\t\t");
			    System.out.println(comment.getBrd_date());
			    System.out.println(comment.getTitle()+" ");
			    printVar();
			}
		}		
	}
	public void printCommentDerails(String borad, int memNo, int postMemNo, String admin){
		if(admin.equals("Y") || memNo == postMemNo) {
			System.out.println("1. 게시글수정");		
			System.out.println("2. 게시글삭제");	
			System.out.println("3. 댓글작성");
			System.out.println("4. 댓글삭제");
			System.out.println("5. "+borad);
			System.out.println("6. 커뮤니티");
			System.out.println("7. 메인화면");
		}else if(memNo != postMemNo){
			System.out.println("1. 댓글작성");
			System.out.println("2. 댓글삭제");
			System.out.println("3. "+borad);
			System.out.println("4. 커뮤니티");
			System.out.println("5. 메인화면");
		}	
		printUnder();
	}
	
	public void printPostDelect() {
		printTop();
		printTitle("게시글 삭제");
		printLn(2);
		
		System.out.println("1. 삭제하기");
		System.out.println("2. 뒤로가기");
		System.out.println("3. 메인화면");
		
		printUnder();
	}
	
	public void printCommentDelect() {
		printTop();
		printTitle("삭제 가능한 댓글");
		printLn(1);
		System.out.println("※ 번호를 선택하면 삭제됩니다.");
	}
	public void printRenkTop10(List<RenkTop10Vo> top10){         //TOP10
		printTop();
		printTitle("다마고치 TOP10 캐릭터");
		printLn(2);
		int cnt = 1;
		if(top10.size() == 0 ) {
			printVar();
			printLn(1);
			System.out.println("현재 엔딩을 본 캐릭터가 없습니다.");
			printLn(1);
			printVar();
		}else {
			printVar();
			for(RenkTop10Vo top : top10) {
				printLn(1);
			    System.out.print(cnt+". "+top.getChar_name()+"("+top.getId()+")");
			    System.out.print("\t"+top.getEnd_name());
	    		if(top.getHd()==1)System.out.println("+ 하이개그마스터");
	    		else System.out.println();
				printLn(1);
				printVar();
				cnt++;
			}
		}
		printLn(1);
		System.out.println("1. 커뮤니티");
		System.out.println("2. 메인화면");
		
		printUnder();
	}
}
