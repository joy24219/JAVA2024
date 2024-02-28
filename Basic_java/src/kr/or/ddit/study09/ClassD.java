package kr.or.ddit.study09;

import java.util.HashMap;

import kr.or.ddit.study09.ClassA.ClassB;
import kr.or.ddit.study09.ClassA.ClassC;

public class ClassD {
	public static void main(String[] args) {
		// 클레스 값을 가지고 오기?
		
		ClassA a = new ClassA();
		ClassB b = a.new ClassB();
		System.out.println(b.b);
		
		ClassC cc = new ClassA.ClassC();
		System.out.println(cc.c);
		
		HashMap h = new HashMap();
		
	}
}
