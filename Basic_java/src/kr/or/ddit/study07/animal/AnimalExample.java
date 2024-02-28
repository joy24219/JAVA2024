package kr.or.ddit.study07.animal;

import java.util.Scanner;

public class AnimalExample {
	public static void main(String[] args) {
		Animal ani =null; 
		
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		if(sel == 1)ani = new Cat();
		if(sel == 2)ani = new Dog();

		ani.cry();
		
	}
}
