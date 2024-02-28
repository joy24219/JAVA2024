package kr.or.ddit.homework.home11;

import java.util.Arrays;
import java.util.Random;

public class Deck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.process();
	}
	
	public void process() {
		// 카드 리스트 호출
		System.out.println(Arrays.toString(cardList()));
		
		// 카드 섞기 (매소드 생성)
		System.out.println(Arrays.toString(cardShuffle()));
		
		// 승패 비교 (매소드 생성)
		// 랜덤한 카드뽑기(내카드), 맨위카드(컴퓨터)
		// 내카드 숫자가 높을 경우 승리
		outcome();
		
	}
	
	public void outcome(){
		Card[] shuffle = cardShuffle();
		int meNum = new Random().nextInt(51)+1;
		
		int com = Integer.parseInt(numReturn(shape(""+shuffle[0])));
		int me  = Integer.parseInt(numReturn(shape(""+shuffle[meNum])));
		
		if(com>=me) {System.out.println("\n컴퓨터 : "+shuffle[0]+" 사용자 : "+shuffle[meNum]+"\n컴퓨터가 승리하였습니다.");}
		else if(com<me) {System.out.println("\n컴퓨터 : "+shuffle[0]+" 사용자 : "+shuffle[meNum]+"\n사용자가 승리하였습니다.");}
	}
	
	public String shape(String s) {
		s=s.replace("♠", "");
		s=s.replace("◆", "");
		s=s.replace("♥", "");
		s=s.replace("♣", "");
		
		return s;
	}
	public String numReturn(String n) {
		if(n.equals("A")) n="1";
		if(n.equals("J")) n="11";
		if(n.equals("Q")) n="12";
		if(n.equals("K")) n="13";
		
		return n;
	}
	
	public Card[] cardShuffle() {
		Card[] cardList = cardList();		
		Card[] shuffle = new Card[cardList.length];
		
		for(int i=0; i<shuffle.length; i++) {
			int ran = new Random().nextInt(cardList.length);
			shuffle[i] = cardList[ran];
			for(int j=0; j<i; j++) {
				if(shuffle[i]==shuffle[j]) {
					i--;
					break;
				}
			} 
		}
		return shuffle;
	}
	public Card[] cardList() {
		Card[] cardList = new Card[52];
		String[] types = {"♠", "◆", "♥", "♣"};
		int cur =0;
		for (String type : types) {
			for(int i=1; i<=13; i++) {
				// 완성 할 것
				cardList[cur] = new Card(i,type);
				cur++;
			}
		}
		return cardList;
	}
}