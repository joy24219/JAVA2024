package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}
	
	public void process() {
		/*
		 *   6개의 단어가 제공되며 
		 *   이중 임의에 단어가 선택 된다. 
		 *   
		 *   사용자는 이를 보고 원래의 단어를 입력 한다. 
		 *   사용자가 단어를 맞출때 까지 반복하며 단어를 맞추었을때 시도 회수
		 *   출력
		 */
		String[] words = {"deserve", "cart", "fright","scrub", "amount", "laugh"};
		
//		new Random().nextInt(words.length);
//		(int)(Math.random()*words.length)
		
		int ran = new Random().nextInt(words.length);
		String select = words[ran];		
		
		// toCharArray  : 문자열 -> 문자 배열로 변환
		
//		int a = 0;
//		int b = 1;
//		System.out.println("a : "+a+" , b"+b);
//		int temp = a; 
//		a        = b;
//		b        = temp;
//		System.out.println("a : "+a+" , b"+b);
		
		
		char[] ch = select.toCharArray();
		for(int i=0; i<1000000; i++) {
			int ran2 = new Random().nextInt(ch.length);
			char temp = ch[0];
			ch[0] = ch[ran2];
			ch[ran2] = temp;
		}
		
		int repet = 0;
		while(true) {
			//cart    tarc
			// 문제 출력하기. 
			System.out.println("\n단어 맞추기 게임 ");
			System.out.println("*영단어의 알파벳이 섞여서 나옵니다. 알파벳을 조합하여 단어를 만드시오!\n");
			System.out.println(Arrays.toString(ch));
			
			
			// 스캐너를 입력 받기 
			String val = sc.nextLine();
			
			repet++;
			
			// 스캐너 입력 받은 값과 정답 비교하기 
			if(val.equals(select)) {
				// 정답이라면 while 종료
				System.out.println("당신은 "+repet+"회 도전하여 정답을 맞추셨습니다!");
				break;
			}else {
				System.out.println("틀렸습니다! 재도전하세요!");				
			}
			
		}
		// 시행 횟수 출력
		
	}
}
