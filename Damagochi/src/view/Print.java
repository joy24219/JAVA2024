package view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import util.ScanUtil;
import util.View;
import vo.CharacterVo;
import vo.MemberVo;
import vo.PlayingCharacterVo;
import vo.StoreVo;

public class Print {
	
	public void printVar() {
		System.out.println("==========================================");
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
	
	public void printHome(){
		printTop();
		printTitle("다마고치");
		printLn(2);
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		printUnder();
	}
	public void printMamberHome(){
		printTop();
		printTitle("다마고치");
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
		System.out.println("5. 뒤로가기");
		printUnder();
	}
	public void printInfo(String title, MemberVo myInfo){    //내정보수정
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
	public void printInfoView(String title, MemberVo myInfo){ //내정보보기
		printInfo(title, myInfo);
		System.out.println("1. 내정보수정");
		System.out.println("2. 마이페이지");
		System.out.println("3. 뒤로가기");
		printUnder();
	}
	public void printMemberMoney(MemberVo myInfo){    //금액충전
		printTop();
		printTitle("금액충전");
		printLn(2);
	    System.out.println("보유금액 : "+myInfo.getMem_money()+"\n");
	    System.out.println("1. 금액충전");
	    System.out.println("2. 뒤로가기");
		printVar();
	}

	public void printAdminHome(){ //관리자페이지
		printTop();
		printTitle("관리자페이지");
		printLn(2);
		System.out.println("1. 초기값수정");
		System.out.println("2. 커뮤니티");
		System.out.println("3. 특별상점");
		System.out.println("4. 마이페이지");
		System.out.println("5. 로그아웃");
		printUnder();
	}

	public void printAdminDefault(){ //관리자_초기값수정
		printTop();
		printTitle("초기값 수정");
		printLn(2);
		System.out.println("1. 먹기");
		System.out.println("2. 함께하기");
		System.out.println("3. 목욕하기");
		System.out.println("4. 화장실가기");
		System.out.println("5. 청소하기");
		System.out.println("6. 게임하기");
		System.out.println("7. 교육하기");
		System.out.println("8. 병원가기");
		System.out.println("9. 뒤로가기");
		printUnder();
	}

	public void printAdminStore(List<StoreVo> itemList){    //내정보수정
		printTop();
		printTitle("특별상점");
		printLn(2);
		if(itemList.size() == 0 ) {
			System.out.println("특별상품없음.");
		}else {
			for(StoreVo item : itemList) {
			    System.out.println(
			    		 ". 상품명   : "+item.getStr_name()+"\t"
			    		 +"상품설명 : "+item.getStr_content()+"\t"
			    		 +"재고     : "+item.getStr_count()+"\n"
			    		 +"나이제한 : "+item.getStr_age()+"\t"
			    		 +"금액     : "+item.getStr_money()+"\t"
			    		 +"포만감   : "+item.getStr_full()+"\t"
			    		 +"친밀도   : "+item.getStr_intimacy()+"\t"
			    		 +"청결도   : "+item.getStr_clean()+"\t"
			    		 +"즐거움   : "+item.getStr_joy()+"\t"
			    		 +"지식     : "+item.getStr_knowledge()+"\t"
			    		  );
			}
		}
		printVar();
		System.out.println("1. 아이템등록");
		System.out.println("2. 아이템수정");
		System.out.println("3. 아이템삭제");
		System.out.println("3. 뒤로가기");
	}

	public void printGamePlaying(List<PlayingCharacterVo> characterList){    //내정보수정
		printTop();
		printTitle("특별상점");
		printLn(2);
		if(characterList.size() == 0 ) {
			System.out.println("특별상품없음.");
		}else {
			for(PlayingCharacterVo character : characterList) {
			    System.out.println(
			    		  "캐릭터명 : "+character.getPlay_name()+"\t"
			    		 +"개월수   : "+character.getPlay_age()+"\t"
			    		 +"포만감   : "+character.getPlay_full()+"\t"
			    		 +"친밀도   : "+character.getPlay_intimacy()+"\t"
			    		 +"청결도   : "+character.getPlay_clean()+"\t"
			    		 +"즐거움   : "+character.getPlay_joy()+"\t"
			    		 +"지식     : "+character.getPlay_knowledge()+"\t"
			    		 +"다마머니 : "+character.getPlay_money()+"\t"
			    		  );
			}
		}
		printVar();
		System.out.println("1. 아이템등록");
		System.out.println("2. 아이템수정");
		System.out.println("3. 아이템삭제");
		System.out.println("3. 뒤로가기");
	}

//	public void printAdminStore(List<StoreVo> itemList){    //내정보수정
//		printVar();
//		printTitle("특별상점");
//		printLn(2);
//		int no = 1;
//		if(itemList.size() == 0 ) {
//			System.out.println("새로운 제품의 오픈시간과 정보는 공지사항을 확인하세요!");
//		}else {
//			
//			for(StoreVo item : itemList) {
//			    System.out.println(
//			    	     no
//			    		 +". 상품명   : "+item.getStr_name()+"\t"
//			    		 +"상품설명 : "+item.getStr_content()+"\t"
//			    		 +"재고     : "+item.getStr_count()+"\n"
//			    		 +"나이제한 : "+item.getStr_age()+"\t"
//			    		 +"금액     : "+item.getStr_money()+"\t"
//			    		 +"포만감   : "+item.getStr_full()+"\t"
//			    		 +"친밀도   : "+item.getStr_intimacy()+"\t"
//			    		 +"청결도   : "+item.getStr_clean()+"\t"
//			    		 +"즐거움   : "+item.getStr_joy()+"\t"
//			    		 +"지식     : "+item.getStr_knowledge()+"\t"
//			    		  );
//			    no++;
//			}
//		}
//		System.out.println(no+". 뒤로가기");
//		printVar();
//	}
}
