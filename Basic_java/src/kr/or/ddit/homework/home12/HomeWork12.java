package kr.or.ddit.homework.home12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HomeWork12 hw = new HomeWork12();
		
		hw.process();
	}
	public void process() {
		//사람 클레스를 만들고 필드 값으로는 돈, 이름을 입력받고.
		Person p1 = new Person();
		int buy;
		
		System.out.print("이름 : ");
		p1.name = sc.nextLine();
		System.out.print("보유현금 : ");
		p1.money = sc.nextInt();
		
		// 로또번호가 1~8까지 
		// 6개의 번호를 뽑아서 만들것.
		// while 문을 통해 로또 구매할 숫자를 선택하고
		// 구매후에 로또 추첨을 진행.
		// 로또 6개 번호가 다 맞는다면
		// 100000(10만원) 상금 지급
		// 종료 진행시 끝
		
		while(true) {
			if(p1.money<1000) {
				System.out.println("보유금액이 1000원 이하로 강제 종료됩니다.");
				break;
			}
			
			System.out.println("1개당 1000원 (-1 입력시 종료)");
			System.out.print("로또 구매 금액 입력 : ");
			buy = sc.nextInt();
			
			if(buy==-1) {
				System.out.println("종료됩니다.");
				break;
			}else if(buy>p1.money || buy<1000) {
				if(buy>p1.money)System.out.println("보유 현금이 모자랍니다.");
				if(buy<1000)System.out.println("1000원보다 큰 금액을 입력하세요.");
				System.out.println("1개당 1000원 / -1 입력시 종료.");
				System.out.print("로또 구매 금액 입력 : ");
				buy = sc.nextInt();
			}
			
			p1.money = p1.money-buy;
			p1.money = p1.money+printLotto(lottoPaper(buy/1000));	

			System.out.println("\n"+p1.name+"의 현재 보유금액 :"+p1.money+"\n");

		}
	}
	public int printLotto(Check c1) {
		int prize = 0;
		System.out.println("=======================================");
		System.out.println("당첨로또 : "+Arrays.toString(c1.com));
		System.out.println("=======================================");
			for(int i=0; i<c1.paper.length; i++) {
				System.out.println("구매로또 : "+Arrays.toString(c1.paper[i])+"\t"+c1.check[i]);
				if(c1.check[i].equals("당첨")) prize += 100000;
			}		
		System.out.println("=======================================");
		
		return prize;
	}
	

	public Check lottoPaper(int num) {
	    Check c1 = new Check();
	    c1.com = generateLotto();
	    c1.paper = new int[num][6];
	    c1.check = new String[num];
	    Arrays.fill(c1.check, "당첨");

	    for (int i = 0; i < num; i++) {
	        c1.paper[i] = generateLotto(); // 한 번에 한 번씩 로또 번호 생성

	        // 각 로또 티켓에 대해 당첨 여부를 확인하고 업데이트
	        for (int j = 0; j < 6; j++) {
	            if (c1.com[j] != c1.paper[i][j] && c1.check[i].equals("당첨"))
	                c1.check[i] = "미당첨";
	            else if (c1.com[j] == c1.paper[i][j] && c1.check[i].equals("당첨"))
	                c1.check[i] = "당첨";
	        }
	    }
	    return c1;
	}
	
	public int[] generateLotto() {
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int ran = new Random().nextInt(8)+1;
			lotto[i] = ran;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	
}