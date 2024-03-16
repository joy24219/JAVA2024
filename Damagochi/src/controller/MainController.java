package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.CharacterService;
import service.DefaultSetService;
import service.MemberService;
import service.PlayingCharacterService;
import service.StoreService;
import util.ScanUtil;
import util.View;
import view.Print;
import vo.CharacterVo;
import vo.MemberVo;
import vo.PlayingCharacterVo;
import vo.StoreVo;

public class MainController extends Print {
	
	static public Map<String, Object> sessionStorage = new HashMap<>();
	MemberService memberService = MemberService.getInstance();
	StoreService  storeService  = StoreService.getInstance();
	DefaultSetService defaultSetService = DefaultSetService.getInstance();
	CharacterService characterService = CharacterService.getInstance();
	PlayingCharacterService playingCharacterService = PlayingCharacterService.getInstance();
	
	public static void main	(String[] args) { new MainController().start();	}

	private void start() {
		View view = View.HOME;
		while (true) {
			switch (view) {
			case HOME:
				view = home();
				break;
			case LOGIN:
				view = login();
				break;
			case SIGN:
				view = sign();
				break;
			case MEMBER_HOME:
				view = member_home();
				break;
			case MEMBER_INFO:
				view = member_info();
				break;
			case MEMBER_INFO_VIEW:
				view = member_info_view();
				break;
			case MEMBER_INFO_UPDATE:
				view = member_info_update();
				break;
			case MEMBER_MONEY_CHARGE:
				view = member_money_charge();
				break;
			case ADMIN_HOME:
				view = admin_home();
				break;
			case ADMIN_DEFAULT_SET:
				view = admin_default_set();
				break;
			case ADMIN_STORE:
				view = admin_store();
				break;
			case ADMIN_INFO_UPDATE:
				view = admin_info_update();
				break;
			case CHARACTER_GAME:
				view = character_game();
				break;
			default:
				break;
			}
		}
	}
	
	
	
	private View character_game() {      //게임시작
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.MEMBER_MONEY_CHARGE;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		
		List<PlayingCharacterVo> gamePlaying = playingCharacterService.playGame(param);
		printGamePlaying(gamePlaying);
		
		return null;
	}

	private View admin_info_update() {   //관리자_정보수정
		return null;
	}
	private View admin_store() {         //관리자_특별상점
		//이전페이지 확인, 현재페이지 보내기
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.ADMIN_STORE;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 홈으로 보내기.
		
		List<StoreVo> itemList = storeService.itemList();
		printAdminStore(itemList);
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.ADMIN_STORE_INSERT;
		case 2:	return View.ADMIN_STORE_UPDATE;
		case 3:	return View.ADMIN_STORE_DELETE;
		case 4: return prevView;
		default:return nowView;
		}
	}
	private View admin_default_set() {   //관리자_초기값수정
		//이전페이지 확인, 현재페이지 보내기
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.ADMIN_DEFAULT_SET;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 홈으로 보내기.
		
		printAdminDefault(); //선택지 출력
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.ADMIN_DEFAULT_EAT;
		case 2:	return View.ADMIN_DEFAULT_TOGERTHER;
		case 3:	return View.ADMIN_DEFAULT_BATH;
		case 4:	return View.ADMIN_DEFAULT_TOILET;
		case 5: return View.ADMIN_DEFAULT_CLEAN;
		case 6: return View.ADMIN_DEFAULT_GAME;
		case 7: return View.ADMIN_DEFAULT_STUDY;
		case 8: return View.ADMIN_DEFAULT_HOSPITAL;
		case 9: return prevView;
		default:return nowView;
		}
	}
	private View admin_home() {  		 //관리자페이지
		//이전페이지 확인, 현재페이지 보내기
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.ADMIN_HOME;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 홈으로 보내기.
		
		printAdminHome(); //선택지 출력
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.ADMIN_DEFAULT_SET;
		case 2:	return View.COMMUNITY_HOME;
		case 3:	return View.ADMIN_STORE;
		case 4:	return View.ADMIN_INFO_UPDATE;
		case 5:	return View.LOOUT;
		default:return nowView;
		}
	}

	private View member_money_charge() { //금액충전
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.MEMBER_MONEY_CHARGE;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		printMemberMoney(member);
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	
			List<Object> param = new ArrayList<Object>();
			int monye = ScanUtil.nextInt("충전 금액 : ");
			if(monye<=0) {
				System.out.println("0원 이상 금액을 입력해주세요.");
				return nowView;
			}else if(monye>100000){
				System.out.println("한번 충전시 10만원까지만 가능합니다.");
				return nowView;
			}
			param.add(monye);
			param.add(member.getMem_no());
			
			memberService.memberInfoUpDate(param);
		case 2:	
			if(prevView == null) return View.MEMBER_HOME;
			return prevView;
		default:return nowView;
		}
	}
	private View member_info_update() {  //내정보수정
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.MEMBER_INFO_UPDATE;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		
		String regexPw = "^[a-zA-Z0-9]{6,12}$"; //정규식(영문, 숫자로 조합, 6~12자)
		
		printInfo("내정보수정",member); //내정보출력
		
		
		String name = ScanUtil.nextLine("수정할 이름     : ");
		name= name.trim(); //공백제거
		if(name.length()==0) name = member.getMem_name(); //입력하지 않으면 기본값
		
		String pw = ScanUtil.nextLine(  "영문,숫자조합 6~12자)\n수정할 비밀번호 : ");
		pw= pw.trim(); //공백제거
		boolean pwRegexChk = pw.matches(regexPw);
		if(pw.length()==0) pw = member.getMem_pw(); //입력하지 않으면 넘어감
		else if(!pwRegexChk){            //정규식에 맞지 않는 경우
			System.out.println("조건을 확인해주세요.");
			return nowView; 
		}
		
		String tel = ScanUtil.nextLine( "숫자만)\n수정할 연락처   : ");
		tel= tel.trim(); //공백제거
		if(tel.length()==0) tel = member.getMem_telno(); //입력하지 않으면 기본값
		else if(tel.replaceAll("[^0-9]", "").length() < 9) { //숫자 이외에 모든문자 제외한 값이 9이하
			System.out.println("전화번호를 확인해주세요.");
			return nowView; 
		}else {
			String cleanTel = tel.replaceAll("[^0-9]", ""); //숫자 이외에 모든문자 제외
			tel = cleanTel.replaceFirst("(\\d{2,3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
		}
		
		String bir = ScanUtil.nextLine( "YYYYMMDD형태, 숫자만)\n수정할 생년월일 : ");
		bir= bir.trim();
		if(bir.length()==0) bir = (String) member.getMem_bir(); //입력하지 않으면 기본값
		else if(bir.replaceAll("[^0-9]", "").length() != 8 ) {
			System.out.println("생년월일을 확인해주세요.");
			return nowView; 
		}else {
			String cleanBir = bir.replaceAll("[^0-9]", ""); 
			bir = cleanBir.replaceFirst("(\\d{4})(\\d{2})(\\d{2})", "$1/$2/$3");
		}
		
		param.add(name);
		if(pw!=null)param.add(pw); // pw값은 member 스토리지에 저장하지 않아서 입력하지 않으면 null값
		param.add(tel);
		param.add(bir);	
		param.add(member.getMem_no());	
		
		memberService.memberInfoUpDate(param);
		
		
		if(prevView == null) return View.MEMBER_HOME;
		return prevView;
	}
	private View member_info_view() {    //내정보보기
		//이전페이지 확인, 현재페이지 보내기
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.MEMBER_INFO_VIEW;
		sessionStorage.put("prevView", nowView);
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		printInfoView("내정보보기",member); //내정보,선택지출력
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.MEMBER_INFO_UPDATE;
		case 2:	return View.MEMBER_INFO;
		case 3:	
			if(prevView == null) return View.MEMBER_HOME;
			return prevView;
		default:return nowView;
		}
	}
	private View member_info() {         //마이페이지
		//이전페이지 확인, 현재페이지 보내기
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.MEMBER_INFO;
		sessionStorage.put("prevView", nowView);
		
		//로그인맴버정보가져오기
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		//일반회원이 아니면 홈으로 보내기.
		if (!member.getMem_admin().equals("N")) return View.HOME;
		
		printMyPage(); //선택지출력
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.MEMBER_INFO_VIEW;
		case 2:
			return View.MEMBER_INFO_UPDATE;
		case 3:
			return View.MEMBER_MONEY_CHARGE;
		case 4:
			return View.CHARACTER_HOME;
		case 5:	
			if(prevView == null) return View.MEMBER_HOME;
			return prevView;
		default:
			return nowView;
		}
	}
	private View member_home() {         //회원 메인페이지
		//이전페이지 확인, 현재페이지 보내기
		View prevView = (View) sessionStorage.get("prevView");
		View nowView = View.MEMBER_HOME;
		sessionStorage.put("prevView", nowView);
		
		//로그인맴버정보가져오기
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		//일반회원이 아니면 홈으로 보내기.
		if (!member.getMem_admin().equals("N")) {return View.HOME;}
		
		printMamberHome(); //선택지 출력
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.CHARACTER_GAME;
		case 2:	return View.COMMUNITY_HOME;
		case 3:	return View.STORE_BUY;
		case 4:	return View.MEMBER_INFO;
		case 5: return View.LOOUT;
		default:return nowView;
		}
	}
	
	private View sign() { 				 //회원가입
		//이전페이지 확인
		View prevView = (View) sessionStorage.get("prevView");
		
		List<Object> param = new ArrayList<Object>(); //DB에 입력할 값입력
		
		String regexIdPw = "^[a-zA-Z0-9]{6,12}$"; //정규식(영문, 숫자로 조합, 6~12자)
		
		printTop();
		printTitle("회원가입");
		printLn(2);
		
		String id = ScanUtil.nextLine(  "영문,숫자조합 6~12자)\nID : ");
		id= id.trim(); //공백제거
		boolean idRegexChk = id.matches(regexIdPw);
		param.add(id);
		if(!memberService.idChk(param)) { //회원정보가 있는경우
			System.out.println("아이디가 존재합니다.");
			return View.SIGN; 
		}else if(!idRegexChk){            //정규식에 맞지 않는 경우
			System.out.println("조건을 확인해주세요.");
			return View.SIGN; 
		}
		String pw = ScanUtil.nextLine(  "영문,숫자조합 6~12자)\nPW : ");
		pw= pw.trim(); //공백제거
		boolean pwRegexChk = pw.matches(regexIdPw);
		if(!pwRegexChk){            //정규식에 맞지 않는 경우
			System.out.println("조건을 확인해주세요.");
			return View.SIGN; 
		}
		
		String name = ScanUtil.nextLine("\n이름 : ");
		name= name.trim(); //공백제거
		
		String tel = ScanUtil.nextLine( "숫자만)\n연락처 : ");
		tel= tel.trim(); //공백제거
		if(tel.replaceAll("[^0-9]", "").length() < 9) { //숫자 이외에 모든문자 제외한 값이 9이하
			System.out.println("전화번호를 확인해주세요.");
			return View.SIGN; 
		}else {
			String cleanTel = tel.replaceAll("[^0-9]", ""); //숫자 이외에 모든문자 제외
			tel = cleanTel.replaceFirst("(\\d{2,3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
		}
		
		String bir = ScanUtil.nextLine( "YYYYMMDD형태, 숫자만)\n생년월일 : ");
		bir= bir.trim();
		if(bir.replaceAll("[^0-9]", "").length() != 8 ) {
			System.out.println("생년월일을 확인해주세요.");
			return View.SIGN; 
		}else {
			String cleanBir = bir.replaceAll("[^0-9]", ""); 
			bir = cleanBir.replaceFirst("(\\d{4})(\\d{2})(\\d{2})", "$1/$2/$3");
		}
		printUnder();
		
		param.add(pw);
		param.add(name);
		param.add(tel);
		param.add(bir);
		
		memberService.sing(param);

		return prevView;
		
	}
	private View login() { 				 //로그인
		//이전페이지 확인
		View prevView = (View) sessionStorage.get("prevView");

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
		
		if(!memberService.login(param)) { //회원값 없으면 
			System.out.println("회원정보를 확인해주세요.");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 메인");
			int sel = ScanUtil.menu();
			switch (sel) {
			case 1:	return View.LOGIN;
			case 2:	return View.SIGN;
			default:return View.HOME;
			}			
		} 
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		
		if(member.getMem_admin().equals("Y")) {
			System.out.println("관리자입니다!");
			return View.ADMIN_HOME; //관리자이면 관리자페이지
		}else if(member.getMem_admin().equals("N")) {
			System.out.println(member.getMem_name()+"님 환영합니다!");
			return View.MEMBER_HOME; //일반회원이면 회원페이지
		}else if(prevView == null) return View.HOME; //이전페이지가 값이 없으면 홈으로.
		else return prevView;
	}
	private View home() { 				 //인트로페이지
		//현재페이지 보내기
		View nowView = View.HOME;
		sessionStorage.put("prevView", nowView);
		
		printHome();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.LOGIN;
		case 2:	return View.SIGN;
		default:return nowView;
		}
	}

}
