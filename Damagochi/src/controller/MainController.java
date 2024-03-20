package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import service.BoardCategoryService;
import service.BoardCommentService;
import service.BoardPostService;
import service.BoardService;
import service.CharacterService;
import service.CharacterStateService;
import service.DefaultSetService;
import service.MemberItemListService;
import service.MemberItemService;
import service.MemberService;
import service.PlayingCharacterService;
import service.RenkTop10Service;
import service.StateService;
import service.StoreService;
import util.ScanUtil;
import util.View;
import view.Print;
import vo.BoardCategoryVo;
import vo.BoardCommentVo;
import vo.BoardPostVo;
import vo.CharacterVo;
import vo.DefaultSetVo;
import vo.MemberItemListVo;
import vo.MemberVo;
import vo.PlayingCharacterVo;
import vo.RenkTop10Vo;
import vo.StateVo;
import vo.StoreVo;

public class MainController extends Print {
	
	static public Map<String, Object> sessionStorage = new HashMap<>();
	MemberService memberService = MemberService.getInstance();
	StoreService  storeService  = StoreService.getInstance();
	DefaultSetService defaultSetService = DefaultSetService.getInstance();
	CharacterService characterService = CharacterService.getInstance();
	PlayingCharacterService playingCharacterService = PlayingCharacterService.getInstance();
	MemberItemService memberItemService = MemberItemService.getInstance();
	MemberItemListService memberItemlistService = MemberItemListService.getInstance();
	CharacterStateService characterStateService = CharacterStateService.getInstance();
	StateService stateService = StateService.getInstance();
	BoardCategoryService boardCatecoryService = BoardCategoryService.getInstance();
	BoardPostService boardPostService = BoardPostService.getInstance();
	BoardService boardService = BoardService.getInstance();
	BoardCommentService boardCommentService = BoardCommentService.getInstance();
	RenkTop10Service renkTop10Service = RenkTop10Service.getInstance();
	
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
			case LOGOUT:
				view = logout();
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
			case MEMBER_STORE:
				view = member_store();
				break;
			case MEMBER_STORE_VIEW:
				view = member_store_view();
				break;
			case MEMBER_STORE_BUY:
				view = member_store_buy();
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
			case CHARACTER_HOME:
				view = character_home();
				break;
			case CHARACTER_GAME:
				view = character_game();
				break;
			case CHARACTER_NEW:
				view = character_new();
				break;
			case CHARACTER_DELETE:
				view = character_delete();
				break;
			case CHARACTER_UPDATE:
				view = character_update();
				break;
			case ADMIN_STORE_INSERT:
				view = admin_store_insert();
				break;
			case ADMIN_STORE_UPDATE:
				view = admin_store_update();
				break;
			case ADMIN_STORE_DELETE:
				view = admin_store_delete();
				break;
			case ADMIN_DEFAULT_EAT:
				view = admin_default_eat();
				break;
			case ADMIN_DEFAULT_TOGERTHER:
				view = admin_default_togerther();
				break;
			case ADMIN_DEFAULT_BATH:
				view = admin_default_bath();
				break;
			case ADMIN_DEFAULT_TOILET:
				view = admin_default_toilet();
				break;
			case ADMIN_DEFAULT_CLEAN:
				view = admin_default_clean();
				break;
			case ADMIN_DEFAULT_GAME:
				view = admin_default_game();
				break;
			case ADMIN_DEFAULT_STUDY:
				view = admin_default_study();
				break;
			case ADMIN_DEFAULT_HOSPITAL:
				view = admin_default_hospital();
				break;
			case COMMUNITY_HOME:
				view = community_home();
				break;
			case COMMUNITY_TOP:
				view = community_top();
				break;
			case COMMUNITY_POST:
				view = community_post();
				break;
			case COMMUNITY_POSTLSIT:
				view = community_postlist();
				break;
			case COMMUNITY_INSERT:
				view = community_insert();
				break;
			case COMMUNITY_DETAILS:
				view = community_details();
				break;
			case COMMUNITY_UPDATE:
				view = community_update();
				break;
			case COMMUNITY_DELETE:
				view = community_delect();
				break;
			case COMMUNITY_COMMENT_INSERT:
				view = community_commet_insert();
				break;
			case COMMUNITY_COMMENT_DELETE:
				view = community_commet_delect();
				break;
			default:
				break;
			}
		}
	}
	
	private View community_top() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		
		List<RenkTop10Vo> top10 =renkTop10Service.top10List();
		printRenkTop10(top10);
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: return View.COMMUNITY_HOME;
		case 2: 
			if(member.getMem_admin().equals("Y")) return View.ADMIN_HOME;
			else if (member.getMem_admin().equals("N")) return View.MEMBER_HOME;
			else return View.HOME;
		default:  
			printError();
			return View.COMMUNITY_TOP;
		}
	}

	private View community_commet_delect() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		BoardPostVo post = (BoardPostVo) sessionStorage.get("post"); //게시글정보가져오기
		sessionStorage.put("board", board);
		int postNo = post.getNo();
		int memNo = member.getMem_no();
		
		printCommentDelect();		
		
		List<Object> param = new ArrayList<Object>();
		param.add(postNo);
		if(member.getMem_admin().equals("N"))param.add(memNo);
		List<BoardCommentVo> commentList = boardCommentService.commentList(param);
		printCommentList(commentList, true);
		System.out.println((commentList.size()+1)+". 뒤로가기");
		System.out.println((commentList.size()+2)+". 메인화면");
		printUnder();
		
		int sel = ScanUtil.menu();	
		for (int i = 1; i <= commentList.size(); i++) {
			if(sel == i) {
				param.clear();
				param.add(commentList.get(i-1).getNo());
				sessionStorage.put("postNo", postNo);
				boardService.postDelect(param);
				System.out.println("댓글이 삭제되었습니다!");
				return View.COMMUNITY_DETAILS;
			}
		}
		if(sel==(commentList.size()+1)) {
			sessionStorage.put("postNo", post.getNo());
			return View.COMMUNITY_DETAILS;
		}else if(sel==(commentList.size()+2)){
			if(member.getMem_admin().equals("Y")) return View.ADMIN_HOME;
			else if (member.getMem_admin().equals("N")) return View.MEMBER_HOME;
			else return View.HOME;
		}
		printError();
		return View.COMMUNITY_POSTLSIT;
	}
	private View community_commet_insert() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		BoardPostVo post = (BoardPostVo) sessionStorage.get("post"); //게시글정보가져오기
		sessionStorage.put("board", board);
		
		List<Object> param = new ArrayList<Object>();
		
		System.out.println("\n90글자 이내 )");
		String titel = ScanUtil.nextLine("댓글 : ");
		titel = titel.trim();
		if(titel.length()<=0) {
			System.out.println("값을 입력하세요.");
			return View.COMMUNITY_COMMENT_INSERT;
		}else if(titel.length()>90) {
			System.out.println("90 글자가 넘었습니다.");
			return View.COMMUNITY_COMMENT_INSERT;
		}
		String content = "댓글";
		param.add(titel);
		param.add(content);
		param.add(board.getCtr_no());
		param.add(member.getMem_no());
		param.add(post.getNo());
		
		boardService.postInsert(param);
		
		sessionStorage.put("postNo", post.getNo());
		return View.COMMUNITY_POSTLSIT;
	}
	private View community_delect() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		BoardPostVo post = (BoardPostVo) sessionStorage.get("post"); //게시글정보가져오기
		sessionStorage.put("board", board);
		String admin = member.getMem_admin();
		if(!admin.equals("Y") && member.getMem_no() != post.getMem_no()) {
			System.out.println("잘못된 접근입니다.");
			if(admin.equals("N")) return View.MEMBER_HOME;
			else return View.HOME;
		}
		printPostDelect();
		
		List<Object> param = new ArrayList<Object>();
		param.add(post.getNo());
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: 
			boardService.postDelect(param);
			System.out.println("게시글이 삭제되었습니다.");
			return View.COMMUNITY_POST;
		case 2: return View.COMMUNITY_DETAILS;
		case 3: 
			if(admin.equals("Y")) return View.ADMIN_HOME;
			else if (admin.equals("N")) return View.MEMBER_HOME;
			else return View.HOME;
		default:  
			printError();
			return View.COMMUNITY_DELETE;
		}
	}
	private View community_update() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		BoardPostVo post = (BoardPostVo) sessionStorage.get("post"); //게시글정보가져오기
		String admin = member.getMem_admin();
		if(!admin.equals("Y") && member.getMem_no() != post.getMem_no()) {
			System.out.println("잘못된 접근입니다.");
			if(admin.equals("N")) return View.MEMBER_HOME;
			else return View.HOME;
		}
		
		printTop();
		printTitle("게시글 수정");
		printLn(2);
		List<Object> param = new ArrayList<Object>();
		System.out.println("※ 입력하지 않으면 기존값으로 대체 됩니다.");
		System.out.println("\n30글자 이내 )");
		String titel = ScanUtil.nextLine("제목 : ");
		titel = titel.trim();
		if(titel.length()==0) {
			titel = post.getTitle();			
		}else if(titel.length()>30) {
			System.out.println("30 글자가 넘었습니다.");
			return View.COMMUNITY_UPDATE;
		}
		System.out.println("\n900글자 이내 )");
		String content = ScanUtil.nextLine("내용 : ");
		if(content.length()==0) {
			content = post.getContent();	
		}else if(content.length()>900) {
			System.out.println("900 글자가 넘었습니다.");
			return View.COMMUNITY_UPDATE;
		}
		printUnder();
		
		param.add(titel);
		param.add(content);
		param.add(board.getCtr_no());
		param.add(member.getMem_no());
		param.add(post.getNo());
		
		boardService.postUpDate(param);
		
		return View.COMMUNITY_DETAILS;
	}
	private View community_details() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		int postNo = (int) sessionStorage.get("postNo"); //게시글정보가져오기
		
		sessionStorage.put("board", board);
		
		List<Object> param = new ArrayList<Object>();
		param.add(postNo);
		BoardPostVo post = boardPostService.post(param);
		sessionStorage.put("post", post);
		
		printPostDerails(post);
		
		List<BoardCommentVo> commentList = boardCommentService.commentList(param);
		printCommentList(commentList, false);
		
		String borad = board.getCtr_name();
		int memNo = member.getMem_no();
		int postMemNo = post.getMem_no(); 
		String admin = member.getMem_admin();
		
		printCommentDerails(borad, memNo, postMemNo, admin);
		
		int sel = ScanUtil.menu();
		
		if(admin.equals("Y") || member.getMem_no() == post.getMem_no()) {
			switch (sel) {
			case 1: return View.COMMUNITY_UPDATE;
			case 2: return View.COMMUNITY_DELETE;
			case 3:	return View.COMMUNITY_COMMENT_INSERT;
			case 4:	return View.COMMUNITY_COMMENT_DELETE;
			case 5:	return View.COMMUNITY_POST;
			case 6:	return View.CHARACTER_HOME;
			case 7:	
				if(admin.equals("Y")) return View.ADMIN_HOME;
				else if (admin.equals("N")) return View.MEMBER_HOME;
				else return View.HOME;
			default:  
				printError();
				return View.COMMUNITY_DETAILS;
			}
		}else if(memNo != postMemNo){
			switch (sel) {
			case 1:	return View.COMMUNITY_COMMENT_INSERT;
			case 2:	return View.COMMUNITY_COMMENT_DELETE;
			case 3:	return View.COMMUNITY_POST;
			case 4:	return View.CHARACTER_HOME;
			case 5:	
				if(admin.equals("Y")) return View.ADMIN_HOME;
				else if (admin.equals("N")) return View.MEMBER_HOME;
				else return View.HOME;
			default:  
				printError();
				return View.COMMUNITY_DETAILS;
			}
		}	
		printError();
		return View.COMMUNITY_DETAILS;
	}

	private View community_insert() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		sessionStorage.put("board", board);
		if(board.getCtr_readonly().equals("Y") && !member.getMem_admin().equals("Y")) {
			System.out.println("잘못된 접근입니다.");
			if (member.getMem_admin().equals("N")) {
				return View.MEMBER_HOME;
			}else {
				return View.HOME;
			}			
		}
		List<Object> param = new ArrayList<Object>();
		
		System.out.println("\n30글자 이내 )");
		String titel = ScanUtil.nextLine("제목 : ");
		titel = titel.trim();
		if(titel.length()<=0) {
			System.out.println("값을 입력하세요.");
			return View.COMMUNITY_INSERT;
		}else if(titel.length()>30) {
			System.out.println("30 글자가 넘었습니다.");
			return View.COMMUNITY_INSERT;
		}
		System.out.println("\n900글자 이내 )");
		String content = ScanUtil.nextLine("내용 : ");
		if(content.length()<=0) {
			System.out.println("값을 입력하세요.");
			return View.COMMUNITY_INSERT;
		}else if(content.length()>900) {
			System.out.println("900 글자가 넘었습니다.");
			return View.COMMUNITY_INSERT;
		}
		param.add(titel);
		param.add(content);
		param.add(board.getCtr_no());
		param.add(member.getMem_no());
		
		boardService.postInsert(param);
		
		return View.COMMUNITY_POSTLSIT;
	}
	private View community_postlist() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		sessionStorage.put("board", board);
		
		if(member == null) {
			System.out.println("잘못된 접근입니다.");
			return View.HOME;
		}
		
		List<Object> param = new ArrayList<Object>();
		param.add(board.getCtr_no());
		List<BoardPostVo> postList= boardPostService.postList(param);
		
		printPostList(board.getCtr_name(),postList,true);
		System.out.println((postList.size()+1)+". 뒤로가기");
		System.out.println((postList.size()+2)+". 메인화면");
		printUnder();
		
		int sel = ScanUtil.menu();	
		for (int i = 1; i <= postList.size(); i++) {
			if(sel == i) {
				sessionStorage.put("postNo", postList.get(i-1).getNo());
				return View.COMMUNITY_DETAILS;
			}
		}
		if(sel==(postList.size()+1)) {
			return View.COMMUNITY_POST;
		}else if(sel==(postList.size()+2)){
			if(member.getMem_admin().equals("Y")) return View.ADMIN_HOME;
			else if (member.getMem_admin().equals("N")) return View.MEMBER_HOME;
			else return View.HOME;
		}
		printError();
		return View.COMMUNITY_POSTLSIT;
	}
	private View community_post() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		BoardCategoryVo board = (BoardCategoryVo) sessionStorage.get("board"); //게시판정보가져오기
		sessionStorage.put("board", board);
		
		if(member == null) {
			System.out.println("잘못된 접근입니다.");
			return View.HOME;
		}
		
		List<Object> param = new ArrayList<Object>();
		param.add(board.getCtr_no());
		List<BoardPostVo> postList= boardPostService.postList(param);
		printPostListMenu(board.getCtr_name(),postList,false, board.getCtr_readonly(),member.getMem_admin());
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: return View.COMMUNITY_POSTLSIT;
		case 2:	
			if(member.getMem_admin().equals("Y") || board.getCtr_readonly().equals("N")) {
				return View.COMMUNITY_INSERT;
			}else if(board.getCtr_readonly().equals("Y")) {
				return View.COMMUNITY_HOME;
			} 
		case 3:	
			if(member.getMem_admin().equals("Y") || board.getCtr_readonly().equals("N")) {
				return View.COMMUNITY_HOME;
			}else if(board.getCtr_readonly().equals("Y")) {
				if(member.getMem_admin().equals("Y")) return View.ADMIN_HOME;
				else if (member.getMem_admin().equals("N")) return View.MEMBER_HOME;
				else return View.HOME;
			} 
		case 4:
			if(member.getMem_admin().equals("Y") || board.getCtr_readonly().equals("N")) {
				if(member.getMem_admin().equals("Y")) return View.ADMIN_HOME;
				else if (member.getMem_admin().equals("N")) return View.MEMBER_HOME;
				else return View.HOME;
			}else if(board.getCtr_readonly().equals("Y")) {
				printError();
				return View.COMMUNITY_POST;
			} 
		default:  
			printError();
			return View.COMMUNITY_POST;
		}		
	}
	private View community_home() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		
		if(member == null) {
			System.out.println("잘못된 접근입니다.");
			return View.HOME;
		}
		
		List<BoardCategoryVo> boardList = boardCatecoryService.boardList();
		
		printBoardList(boardList);
		int sel = ScanUtil.menu();		
		for (int i = 1; i <= boardList.size()+2; i++) {
			if(sel==boardList.size()+2) {
				if(member.getMem_admin().equals("Y")) return View.ADMIN_HOME;
				else if (member.getMem_admin().equals("N")) return View.MEMBER_HOME;
				else return View.HOME;
			}
			else if(sel==boardList.size()+1) return View.COMMUNITY_TOP;
			else if(sel==i) {
				sessionStorage.put("board", boardList.get(i-1));
				return View.COMMUNITY_POST;
			}				
		} 
		printError();		
		return View.COMMUNITY_HOME;
	}

	private View member_store_view() {		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 아니면 홈으로 보내기.
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		List<MemberItemListVo> memberItemList= memberItemlistService.itemList(param);
		printMemberItemList(memberItemList);
		
		System.out.println("1. 특별상점 아이템 구매");
		System.out.println("2. 뒤로가기");
		printUnder();
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: return View.MEMBER_STORE_BUY;
		case 2:	return View.MEMBER_STORE;
		default:  
			printError();
			return View.MEMBER_STORE_VIEW;
		}
	}
	private View member_store_buy() {
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 아니면 홈으로 보내기.
		
		List<StoreVo> itemList = storeService.itemList();
		
		printStoreList("특별상점 아이템 구매", itemList,true);
		System.out.println("\n"+(itemList.size()+1)+". 뒤로가기");
		printUnder();
		int sel = ScanUtil.menu();
		for(int i=0; i<=itemList.size(); i++) {
			if(sel-1==itemList.size()) {
				return View.MEMBER_STORE;
			}else if(sel-1==i) {
				List<Object> param = new ArrayList<Object>();
				param.add(itemList.get(sel-1).getStr_no());
				boolean itemUpChk = defaultSetService.itemUpDate(param); //재고가 없으면 업로드 안함.
				if(itemUpChk) {
					param.add(member.getMem_no());				
					memberItemService.itemUpDate(param);
					System.out.println(itemList.get(sel-1).getStr_name()+" 1개 구매완료!");
					return View.MEMBER_STORE;
				}else {
					System.out.println(itemList.get(sel-1).getStr_name()+" 재고가 소진되어 구매실패!");
					return View.MEMBER_STORE;
				}
			}
		}
		System.out.println("잘못된 값 입력하였습니다.");
		return View.MEMBER_STORE_BUY;
	}
	private View member_store() {
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 아니면 홈으로 보내기.
		
		printMemberStore();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: return View.MEMBER_STORE_VIEW;
		case 2: return View.MEMBER_STORE_BUY;
		case 3:	return View.MEMBER_HOME;
		default:  
			printError();
			return View.MEMBER_STORE;
		}
	}
	
	private View character_update() {    // 캐릭터 수정
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		
		List<PlayingCharacterVo> gamePlaying = playingCharacterService.playGame(param);
		printGame("수정할 캐릭터 선택", gamePlaying, true);
		if(gamePlaying.size()==0) return View.CHARACTER_HOME;
		System.out.println("4. 뒤로가기");
		
		param.clear();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	
		case 2:	
		case 3:	
			if(sel <= gamePlaying.size()) { // 유효한 인덱스인 경우에만 삭제 수행
                param.clear(); // 이전에 사용된 값들을 제거
                String newName = ScanUtil.nextLine("수정할 이름 : ");
                if(newName.length()>10) {
    				System.out.println("10글자가 넘었습니다.");
    				return View.CHARACTER_HOME;
    			}
                param.add(newName);
                param.add(gamePlaying.get(sel - 1).getChar_no()); // 선택된 캐릭터의 번호를 추가
                playingCharacterService.characterUpDate(param); // 선택된 캐릭터 수정
            } else {
                System.out.println("수정할 캐릭터가 없습니다.");
            }
            break;
		case 4: return View.CHARACTER_HOME;
		default:  
			printError();
			return View.CHARACTER_UPDATE;
		}
		return View.CHARACTER_HOME;
	}
	private View character_delete() {    // 캐릭터 삭제
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		
		List<PlayingCharacterVo> gamePlaying = playingCharacterService.playGame(param);
		printGame("삭제할 캐릭터 선택", gamePlaying, true);
		if(gamePlaying.size()==0) return View.CHARACTER_HOME;
		System.out.println("4. 뒤로가기");
		
		param.clear();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	
		case 2:	
		case 3:	
			if(sel <= gamePlaying.size()) { // 유효한 인덱스인 경우에만 삭제 수행
                param.clear(); // 이전에 사용된 값들을 제거
                param.add(gamePlaying.get(sel - 1).getChar_no()); // 선택된 캐릭터의 번호를 추가
                playingCharacterService.characterDelete(param); // 선택된 캐릭터 삭제
            } else {
                System.out.println("삭제할 캐릭터가 없습니다.");
            }
            break;
		case 4: return View.CHARACTER_HOME;
		default:  
			printError();
			return View.CHARACTER_DELETE;
		}
		return View.CHARACTER_HOME;
	}
	private View character_new() {       // 캐릭터 생성
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		
		List<PlayingCharacterVo> gamePlaying = playingCharacterService.playGame(param);
		printGameNew();
		if(gamePlaying.size()>=3) {
			System.out.println("캐릭터를 최대로 생성하였습니다.");
		}else {
			String charName = ScanUtil.nextLine("한글기준 10자 이내로) \n새로운 캐릭터 이름 : "); 
			if(charName.length()<0) {
				System.out.println("캐릭터 이름을 작성해 주세요.");
				return View.CHARACTER_HOME;
			}else if(charName.length()>10) {
				System.out.println("10글자가 넘었습니다.");
				return View.CHARACTER_HOME;
			}
			param.clear();
			param.add(charName);
			param.add(member.getMem_no());
			CharacterVo charNo = (CharacterVo) playingCharacterService.characterNew(param);
			List<StateVo> stateList = stateService.stateList();
			for(int i=0; i<stateList.size(); i++) {
				param.clear();
				param.add(charNo.getChar_no());
				param.add(stateList.get(i).getState_no());
				characterStateService.characterStateNew(param);
			}
		}
		return View.CHARACTER_HOME;
	}
	private View character_game() {      // 게임시작
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		
		List<PlayingCharacterVo> gamePlaying = playingCharacterService.playGame(param);
		printGamePlaying("캐릭터 선택",gamePlaying,true);
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	
		case 2:	
		case 3:	
			if(sel <= gamePlaying.size()) { // 유효한 인덱스인 경우에만 삭제 수행
				GameController.sessionStorage.put("member", member);
				GameController.sessionStorage.put("char", gamePlaying.get(sel - 1));
				return GameController.game_start();
            } else {
                System.out.println("선택할 캐릭터가 없습니다.");
            }
            break;
		case 4:	return View.CHARACTER_NEW;
		case 5:	return View.CHARACTER_HOME;
		case 6:	return View.MEMBER_HOME;
		default: 
			printError();
			return View.CHARACTER_GAME;
		}
		return View.CHARACTER_HOME;
	}
	private View character_home() {      // 모든캐릭터조회
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		List<Object> param = new ArrayList<Object>();
		param.add(member.getMem_no());
		
		List<PlayingCharacterVo> gamePlaying = playingCharacterService.playGame(param);
		printGameHome("플래이 중인 캐릭터",gamePlaying,false);
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: return View.CHARACTER_GAME;
		case 2: return View.CHARACTER_NEW;
		case 3: return View.CHARACTER_UPDATE;
		case 4: return View.CHARACTER_END;
		case 5: return View.CHARACTER_DELETE;
		case 6:	return View.MEMBER_INFO;
		default:  
			printError();
			return View.CHARACTER_HOME;
		}
	}

	private View admin_default_hospital() { 
		return admin_default_action(8, View.ADMIN_DEFAULT_HOSPITAL);
	}
	private View admin_default_study() {    
		return admin_default_action(7, View.ADMIN_DEFAULT_STUDY);
	}
	private View admin_default_game() {     
		return admin_default_action(6, View.ADMIN_DEFAULT_GAME);
	}
	private View admin_default_clean() {    
		return admin_default_action(5, View.ADMIN_DEFAULT_CLEAN);
	}
	private View admin_default_toilet() {   
		return admin_default_action(4, View.ADMIN_DEFAULT_TOILET);
	}
	private View admin_default_bath() {     
		return admin_default_action(3, View.ADMIN_DEFAULT_BATH);
	}
	private View admin_default_togerther() {
		return admin_default_action(2, View.ADMIN_DEFAULT_TOGERTHER);
	}
	private View admin_default_eat() {      
		return admin_default_action(1, View.ADMIN_DEFAULT_EAT);
	}
	private View admin_default_action(int intNo, View nowView) {  
		int intSel = (int) sessionStorage.get("sel");
        
        MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
        if (member.getMem_admin().equals("N")) {
            return View.HOME;
        } //일반회원이면 홈으로 보내기.
       
        DefaultSetService defaultSetService = DefaultSetService.getInstance();
        List<DefaultSetVo> itemList = defaultSetService.itemList(intNo);
       
		printDeaultSet("초기값 수정",itemList);
		int sel = ScanUtil.menu();
		List<Object> param = printAdminDefaultUpDate(sel, intSel);
       
        defaultSetService.defaultUpdate(sel, param);
        System.out.println("수정이 완료되었습니다.");
        return View.ADMIN_DEFAULT_SET;
	}
	
	private View admin_default_set() {   // 관리자_상호작용선택
	    
	    MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
	    if (member.getMem_admin().equals("N")) { return View.HOME; } //일반회원이면 홈으로 보내기.
	    
	    printAdminDefault("초기값 수정"); // 선택지 출력
	    int sel = ScanUtil.menu(); // 사용자로부터 선택을 받음
	    sessionStorage.put("sel", sel);
	    // 선택한 항목에 따라서 다음 페이지로 이동
	    switch (sel) {
	        case 1: return View.ADMIN_DEFAULT_EAT;
	        case 2: return View.ADMIN_DEFAULT_TOGERTHER;
	        case 3: return View.ADMIN_DEFAULT_BATH;
	        case 4: return View.ADMIN_DEFAULT_TOILET;
	        case 5: return View.ADMIN_DEFAULT_CLEAN;
	        case 6: return View.ADMIN_DEFAULT_GAME;
	        case 7: return View.ADMIN_DEFAULT_STUDY;
	        case 8: return View.ADMIN_DEFAULT_HOSPITAL;
	        case 9: return View.ADMIN_HOME;
	        default:  
				printError();
				return View.ADMIN_DEFAULT_SET;
	    }
	}
	
	private View admin_store_delete() {	 // 관리자_특별상점 아이템 삭제
	    MemberVo member = (MemberVo) sessionStorage.get("member");
	    if (!member.getMem_admin().equals("Y")) {
	        System.out.println("관리자만 접근할 수 있는 페이지입니다.");
	        return View.HOME;
	    }
	    
	    String no = (String) sessionStorage.get("no");
		List<Object> param = new ArrayList<Object>();
		param.add(no);
		
		storeService.storeDelete(param);
		System.out.println("특별상점 아이템이 삭제되었습니다.");
		
		return View.ADMIN_STORE;
	}
	private View admin_store_update() {  // 관리자_특별상점 아이템 수정

	    MemberVo member = (MemberVo) sessionStorage.get("member");
	    if (!member.getMem_admin().equals("Y")) {
	        System.out.println("관리자만 접근할 수 있는 페이지입니다.");
	        return View.HOME;
	    }
	    System.out.println("1. 전체");
		System.out.println("2. 상품명, 상품설명");
		System.out.println("3. 재고, 가격");
		System.out.println("4. 스탯");
		
		int sel = ScanUtil.nextInt("수정할 내용 선택 : ");
		
		List<Object> param = new ArrayList<Object>();
		if(sel == 1 || sel == 2) {
			String name = ScanUtil.nextLine("상품명 : ");
			param.add(name);
			String content = ScanUtil.nextLine("상품설명 : ");
			param.add(content);
		}
		if(sel == 1 || sel == 3) {
			int count = ScanUtil.nextInt("재고 : ");
			param.add(count);
			int money = ScanUtil.nextInt("가격 : ");
			param.add(money);
		}
		if(sel == 1 || sel == 4) {
		    int full = ScanUtil.nextInt("배부름 : ");
			param.add(full);
			int intimacy = ScanUtil.nextInt("친밀도 : ");
			param.add(intimacy);
			int clean = ScanUtil.nextInt("청결도 : ");
			param.add(clean);
			int joy = ScanUtil.nextInt("즐거움 : ");
			param.add(joy);
			int knowledge = ScanUtil.nextInt("지식 : ");
			param.add(knowledge);

		}
		String num = (String) sessionStorage.get("num");
		param.add(num);
		
		storeService.storeUpdate(sel, param);
		System.out.println("특별상점 아이템이 수정되었습니다!");
		
		return View.ADMIN_STORE;
	}
	private View admin_store_insert() {  // 관리자_특별상점 아이템 추가
	    // 이전 페이지 확인, 현재 페이지 설정
	    View nowView = View.ADMIN_STORE_INSERT;
	    sessionStorage.put("prevView", nowView);

	    MemberVo member = (MemberVo) sessionStorage.get("member");
	    if (!member.getMem_admin().equals("Y")) {
	        System.out.println("관리자만 접근할 수 있는 페이지입니다.");
	        return View.HOME;
	    }
	    
	    List<Object> param = printAdminStoreInsert();// 상점 정보 입력 받기
	    
    	storeService.insert(param);
	    System.out.println("특별상점 아이템이 추가되었습니다!");
	    return View.ADMIN_STORE;
	}
	private View admin_store() {         // 관리자_특별상점
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 홈으로 보내기.
		
		List<StoreVo> itemList = storeService.itemList();
		printAdminStore(itemList);
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.ADMIN_STORE_INSERT;
		case 2:	{
			String num = ScanUtil.nextLine("수정할 아이템 이름 : ");
			sessionStorage.put("num", num);
			return View.ADMIN_STORE_UPDATE;
		}
		case 3:	{
			String no = ScanUtil.nextLine("삭제할 아이템 이름 : ");
			sessionStorage.put("no", no);
			return View.ADMIN_STORE_DELETE;
		}
		case 4: return View.ADMIN_HOME;
		default:  
			printError();
			return View.ADMIN_STORE;
		}
	}
	
	private View admin_info_update() {   // 관리자_정보수정
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (member.getMem_admin().equals("N")) {return View.HOME;} //일반회원이면 홈으로 보내기.
		
		String regexPw = "^[a-zA-Z0-9]{6,12}$"; //정규식(영문, 숫자로 조합, 6~12자)
		
		List<Object> param = new ArrayList<Object>();
		String pw = ScanUtil.nextLine("영문, 숫자로 조합, 6~12자)\n변경할 비밀번호 : ");
		pw= pw.trim(); //공백제거
		boolean pwRegexChk = pw.matches(regexPw);
		if(!pwRegexChk){            //정규식에 맞지 않는 경우
			System.out.println("조건을 확인해주세요.");
			return View.ADMIN_INFO_UPDATE; 
		}
		param.add(pw);
		param.add(member.getMem_no());
		memberService.adminUpDate(param);
		
		System.out.println("변경되었습니다.");
		
		return View.ADMIN_HOME;
	}
	private View admin_home() {  		 // 관리자_페이지
		//현재페이지 보내기
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
		case 5:	return View.LOGOUT;
		default: 
			printError();
			return nowView;
		}
	}
	
	private View member_money_charge() { // 금액충전
		View nowView = View.MEMBER_MONEY_CHARGE;
		
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
		case 2:	return View.MEMBER_INFO;
		default: 
			printError();
			return nowView;
		}
	}
	private View member_info_update() {  // 내정보수정
		View nowView = View.MEMBER_INFO_UPDATE;
		
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
		
		return View.MEMBER_INFO;
	}
	private View member_info_view() {    // 내정보보기
		
		MemberVo member = (MemberVo) sessionStorage.get("member"); //로그인맴버정보가져오기
		if (!member.getMem_admin().equals("N")) return View.HOME; //일반회원이 아니면 홈으로 보내기.
		
		printInfoView("내정보보기",member); //내정보,선택지출력
		
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.MEMBER_INFO_UPDATE;
		case 2:	return View.MEMBER_INFO;
		case 3:	return View.MEMBER_HOME;
		default: 
			printError();
			return View.MEMBER_INFO_VIEW;
		}
	}
	private View member_info() {         // 마이페이지
		//로그인맴버정보가져오기
		MemberVo member = (MemberVo) sessionStorage.get("member");
		
		//일반회원이 아니면 홈으로 보내기.
		if (!member.getMem_admin().equals("N")) return View.HOME;
		
		printMyPage(); //선택지출력
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1: return View.MEMBER_INFO_VIEW;
		case 2: return View.MEMBER_INFO_UPDATE;
		case 3: return View.MEMBER_MONEY_CHARGE;
		case 4: return View.CHARACTER_HOME;
		case 5:	return View.MEMBER_HOME;
		default:  
			printError();
			return View.MEMBER_INFO;
		}
	}
	private View member_home() {         // 회원 메인페이지
		//현재페이지 보내기
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
		case 3:	return View.MEMBER_STORE;
		case 4:	return View.MEMBER_INFO;
		case 5: return View.LOGOUT;
		default: 
			printError();
			return nowView;
		}
	}

	private View logout() {              // 로그아웃
		sessionStorage.clear();
		System.out.println("로그아웃되었습니다.");
		return View.HOME;
	}
	private View sign() { 				 // 회원가입
		
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

		return View.HOME;
	}
	private View login() { 				 // 로그인

		List<Object> param = printLogin(); //로그인정보입력
		
		if(!memberService.login(param)) { //회원값 없으면 
			System.out.println("회원정보를 확인해주세요.\n");
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
		}else return View.HOME;
	}
	private View home() { 				 // 인트로페이지		
		printHome();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:	return View.LOGIN;
		case 2:	return View.SIGN;
		default: 
			printError();
			return View.HOME;
		}
	}
	
}
