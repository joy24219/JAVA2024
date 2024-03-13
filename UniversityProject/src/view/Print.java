package view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import util.ScanUtil;
import vo.MenuVo;

public class Print {
	
	public void printVar() {
		System.out.println("==========================================");
	}
	public void printLn(int line) {
		for(int i=0; i<line; i++) System.out.println();
	}
	public void printHome(){
		printVar();
		System.out.println("1. 교수 페이지");
		System.out.println("2. 회원 페이지");
		printLn(1);
		printVar();
		printLn(2);
	}
	public void printStd(){
		printVar();
		System.out.println("1. 전체 강의 내역");
		System.out.println("2. 내 강의 내역 조회");
		System.out.println("3. 회원 정보 수정");
		printLn(1);
		printVar();
		printLn(2);
	}
	public void printPro(){
		printVar();
		System.out.println("1. 전체 강의 내역");
		System.out.println("2. 내 강의 내역 조회");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 강의 등록");
		printLn(1);
		printVar();
		printLn(2);
	}
	
	public void printList(List<MenuVo> menuList){
		System.out.println("");
		
		for(MenuVo map : menuList) {
			  int no   = map.getNo();
	    	  String menu    = map.getMenu();
	    	  String content  = map.getContent();
	    	  String type  = map.getType();
	    	  int price  = map.getPrice();
	          System.out.println(no+"\t"+menu+"\t"+content+"\t"+type+"\t"+price);
       }
		printVar();
		System.out.println("1. 타입검색");
		System.out.println("2. 메뉴변경");
		System.out.println("3. 메뉴삭제");
		printLn(1);
		printVar();
		printLn(2);
	}
	public void printSearch(List<MenuVo> menuList){
		System.out.println("");
		
		for(MenuVo map : menuList) {
			  int no   = map.getNo();
	    	  String menu    = map.getMenu();
	    	  String content  = map.getContent();
	    	  String type  = map.getType();
	    	  int price  = map.getPrice();
	          System.out.println(no+"\t"+menu+"\t"+content+"\t"+type+"\t"+price);
       }
		printVar();
		System.out.println("1. 메뉴변경");
		System.out.println("2. 메뉴삭제");
		System.out.println("3. 전체리스트로");
		printLn(1);
		printVar();
		printLn(2);
	}
}
