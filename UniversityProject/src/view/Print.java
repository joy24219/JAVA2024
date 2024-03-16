package view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import util.ScanUtil;
import vo.MenuVo;
import vo.SemesterVo;

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
	public void printSesList(List<SemesterVo> list){
		printVar();
		for(SemesterVo map : list) {
			  int no   = map.getSes_no();
	    	  String name    = map.getSes_name();
	          System.out.println(no+"\t"+name);
       }
		printVar();
	}
}
