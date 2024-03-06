package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import print.Print;
import service.MemberService;
import util.ScanUtil;
import util.View;

public class MainController extends Print {
	
	static public Map<String, Object> sessionStorage = new HashMap<>();
	MemberService memberService = MemberService.getInstance();
	

	public static void main(String[] args) {
		new MainController().start();
	}

	private void start() {
		View view = View.MAIN;
		while (true) {
			switch (view) {
			case MAIN:
				view = home();
				break;
			case MEMBERLIST:
				view = memberList();
				break;
			case SIGN:
				view = sign();
				break;
			case LOGIN:
				view = login();
				break;
			default:
				break;
			}
		}
	}
	private View login() {
		System.out.println("로그인 메뉴");
		
		String id = ScanUtil.nextLine("ID : ");
		String pw = ScanUtil.nextLine("PW : ");
		
		
		
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pw);
		
		boolean loginChk = memberService.login(param);
		if(loginChk) {
			Map<String, Object> member = (Map<String, Object>) sessionStorage.get("member");
			System.out.println(member.get("MEM_NAME")+"님 환영합니다.");
		}else {
			System.out.println("ID, PW 일치하지 않습니다.");
			return View.LOGIN;
		}
		
		
		System.out.println("1.홈");
		int sel = ScanUtil.nextInt(""
				+ "메뉴선택 : ");
		switch(sel) {
			case 1 :
				return View.MAIN;
			default :
				return View.LOGIN;
		}
	}
	private View sign() {
		System.out.println("회원가입 메뉴");
		System.out.println("1.홈");
		int sel = ScanUtil.nextInt("메뉴선택 : ");
		switch(sel) {
			case 1 :
				return View.MAIN;
			default :
				return View.SIGN;
		}
	}
	private View memberList() {
		System.out.println("맴버리스트 메뉴");
		
		String memLike = ScanUtil.nextLine("취미 >>");
		List<Object> param = new ArrayList();
		param.add(memLike);
		
		
		List<Map<String, Object>> memList = memberService.memberList(param);
		
		for(Map<String,Object> map : memList) {
			String id    = (String) map.get("MEM_ID");
			String name  = (String) map.get("MEM_NAME");
			String job   = (String) map.get("MEM_JOB");
			String email = (String) map.get("MEM_MAIL");
			String like  = (String) map.get("MEM_LIKE");
			System.out.println(id+"\t"+name+"\t"+job+"\t"+email+"\t"+like);
		}
		
		System.out.println("1.홈");
		int sel = ScanUtil.nextInt("메뉴선택 : ");
		switch(sel) {
			case 1 :
				return View.MAIN;
			default :
				return View.MEMBERLIST;
		}
	}
	private View home() {
		System.out.println("1. 회원 리스트 조회");
		System.out.println("2. 회원 가입");
		System.out.println("3. 로그인");
		int sel = ScanUtil.nextInt("메뉴선택 : ");
		switch (sel) {
		case 1:
			return View.MEMBERLIST;
		case 2:
			return View.SIGN;
		case 3:
			return View.LOGIN;
		default:
			return View.MAIN;
		}
	}

}
