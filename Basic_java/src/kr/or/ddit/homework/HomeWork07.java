package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.method1();
	}
	public void method1() {
		//로또번호 6개 출력
		
		int[] nums = new int[45];
		// 1. lotto 번호 45개 배열 temp 생성
		for(int i=0; i<45; i++) nums[i] = i+1; 
		
		// 2. temp 배열 섞기 어제 숙제 참고.
		for(int i=0; i<1000000; i++) {
			int ran = new Random().nextInt(45);
			int temp = nums[0];
			nums[0] = nums[ran];
			nums[ran] = temp;
		}

		// 3. 6개 배열 lotto생성
		int[] lotto = new int[6];
		
		// 4. lotto 배열에 temp 앞에 6개 값 복사하기.
		System.arraycopy(nums,0,lotto,0,6);
		
		// 5. 정렬하기
		for(int i=0; i<lotto.length-1; i++) {
			int minIndex = i;
			for(int j=i; j<lotto.length; j++) {
				if(lotto[j]<lotto[minIndex]) { minIndex = j;}
			}
			int temp = lotto[minIndex];
			lotto[minIndex] = lotto[i];
			lotto[i] = temp;
		}
		
		
		
		// 6. 결과 출력하기
		System.out.print(Arrays.toString(lotto));
	}
}
