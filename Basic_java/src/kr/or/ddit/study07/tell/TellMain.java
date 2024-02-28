package kr.or.ddit.study07.tell;

import java.util.Scanner;

import kr.or.ddit.study07.animal.Cat;
import kr.or.ddit.study07.animal.Dog;

public class TellMain {
	public static void main(String[] args) {
		/*
		 * Schdeular 클래스
		 * 1. getNextCall();
		 * 2. sendCallToAgent();
		 * 
		 * RoundRobn, LeastJob, PriorityAllocation 클래스 각각
		 * Schdeular 클래스 상속 후 각 메세지를 출력할것.
		 * 
		 * PriorityAllocation
		 * 1-> 우선순위가 높은 상담전화를 대기열에서 가져옴.
		 * 2-> 업무스킬이 가장 우수한 상담원에게 상담전화 분배
		 * 
		 * LeastJob
		 * 1-> 상담전화를 대기열에서 차례대로 가져옴
		 * 2-> 대기열에서 가장 짧은 상담원에게 상담전화 분배
		 * 
		 * RoundRobn
		 * 1-> 상담전화를 대기열에서 차례대로 가져옴
		 * 2-> 차례대로 상담원에게 상담전화를 분배
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("전화 상담 분배 방식 선택");
		System.out.println("R: RoundRobn");
		System.out.println("L: LeastJob");
		System.out.println("P: PriorityAllocation");
		
		String sel = sc.next();
		
		Schdeular sch = null;
		
		if(sel.equals("R"))sch = new RoundRobn();
		if(sel.equals("L"))sch = new LeastJob();
		if(sel.equals("P"))sch = new PriorityAllocation();
		
		sch.getNextCall();
		sch.sendCallToAgent();
		
	}
}
