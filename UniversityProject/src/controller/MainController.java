package controller;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.MemberService;
import util.ScanUtil;
import util.View;
import view.Print;
import vo.MemberVo;

public class MainController extends Print {
	
	static public Map<String, Object> sessionStorage = new HashMap<>();
	MemberService memberService = MemberService.getInstance(); 
	

	public static void main	(String[] args) {
		new MainController().start();
	}

	private void start() {
		View view = View.HOME;
		while (true) {
			switch (view) {
			case HOME:
				view = home();
				break;
			case CLASS_LIST:
				view = classList();
				break;
			case CLASS_LIST_MEMBER:
				view = classListMember();
				break;
			case MEMBER_UPDATE:
				view = memberList();
				break;
			case MEMBER_PRO:
				view = memberPro();
				break;
			case CLASS_INSERT:
				view = classInsert();
				break;
			case CLASS_UPDATE:
				view = classUpDate();
				break;
			case CLASS_DELETE:
				view = classDelete();
				break;
			case MEMBER_STD:
				view = memberStd();
				break;
			case CLASS_SING:
				view = classSing();
				break;
			case LOGIN:
				view = login();
				break;
			default:
				break;
			}
		}
	}
	private View classList() {
		// TODO Auto-generated method stub
		return null;
	}

	private View classListMember() {
		// TODO Auto-generated method stub
		return null;
	}

	private View memberList() {
		// TODO Auto-generated method stub
		return null;
	}

	private View memberPro() {
		printPro();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.CLASS_LIST;
		case 2:
			return View.CLASS_LIST_MEMBER;
		case 3:
			return View.MEMBER_UPDATE;
		case 4:
			return View.CLASS_INSERT;
		default:
			return View.MEMBER_PRO;
		}
	}

	private View classInsert() {
		if(!sessionStorage.containsKey("member")) {
			System.out.println("잘못된 접근입니다.");
			return View.HOME;
		}
		 MemberVo member = (MemberVo)sessionStorage.get("member");
		 
		 if(member.getSort_no() != 1) {
			 System.out.println("등록 권한이 없습니다.");
			 return View.HOME;
		 }
		 List<Object> prarm = new ArrayList<Object>();
		 String name = ScanUtil.nextLine("과목명 입력 : ");
		 String cont = ScanUtil.nextLine("과목설명 입력 : ");
		 int ref = ScanUtil.nextInt("1.전공 | 2.교양 (숫자로 선택) : ");
		 
		 printSesList(memberService.semester());
		 int ses = ScanUtil.nextInt("학기선택 : ");
		 
		 prarm.add(name);
		 prarm.add(cont);
		 if(ref==1) ;
		 else if(ref==2) ;
		 prarm.add(cont);
		 
		
		return null;
	}

	private View classUpDate() {
		// TODO Auto-generated method stub
		return null;
	}

	private View classDelete() {
		// TODO Auto-generated method stub
		return null;
	}

	private View memberStd() {
		printStd();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			return View.CLASS_LIST;
		case 2:
			return View.CLASS_LIST_MEMBER;
		case 3:
			return View.MEMBER_UPDATE;
		default:
			return View.MEMBER_STD;
		}
	}

	private View classSing() {
		// TODO Auto-generated method stub
		return null;
	}

	private View login() {
		int no = (int) sessionStorage.get("no");
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		List<Object> paramList = new ArrayList<Object>();
		paramList.add(id);
		paramList.add(pw);
		
		if(!memberService.login(paramList)) {
			System.out.println("존재하지 않는 회원값입니다.");
			return View.HOME;
		} 
			
		MemberVo member =(MemberVo)sessionStorage.get("member");
		int sort = member.getSort_no();
		String name = member.getMem_name();
		if(no==1 && (sort==1 || sort==10)) {
			System.out.println(name+"교수님 안녕하세요!");
			return View.MEMBER_PRO;
		}else if(no==2 && (sort==2 || sort==3 || sort==4 || sort==5 || sort==6 || sort==7 || sort==8 )) {
			System.out.println(name+"님 안녕하세요!");
			return View.MEMBER_STD;
		}else if(sort==9){
			System.out.println("퇴학생은 권한이 없습니다.");
			return View.HOME;
		}else {
			System.out.println("잘못된 접근입니다.");
			return View.HOME;
		}
	}

	private View home() {
		printHome();
		int sel = ScanUtil.menu();
		switch (sel) {
		case 1:
			sessionStorage.put("no",sel);
			return View.LOGIN;
		case 2:
			sessionStorage.put("no",sel);
			return View.LOGIN;
		default:
			return View.HOME;
		}
	}

}
