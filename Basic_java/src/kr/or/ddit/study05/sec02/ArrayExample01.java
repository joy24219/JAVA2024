package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();		
//		obj.method6();	
//		obj.method7();		
//		obj.method8();		
		obj.method9();			
	}
	public void method1() {
		// int 점수 5개 입력후 총접 평균계산하기
		
//		int s1 =100;
//		int s2 =95;
//		int s3 =87;
//		int s4 =94;
//		int s5 =77;
//		
//		int sum = s1+s2+s3+s4+s5;
//		double avg = sum/5.0;
		
		//int 타입
		//[] 배열 선언
		//new 메모리 할당
		//int[변수개수]
		// int[] array = new int[5];
		int array[] = new int[5];
		
		array[0] = 100;
		array[1] = 95;
		array[2] = 87;
		array[3] = 94;
		array[4] = 77;
		
		int sum = 0;
		
		for(int i=0; i<array.length; i++) {
			sum+= array[i];
		}
		
	}
	public void method2() {
		//정수 5개 입력하고 출력
		
		int num[] = new int[5];
//		System.out.println(num[1]);
		
		int sum = 0;
		System.out.println("숫자 5개를 입력해주세요!");
		for(int i=0; i<5; i++) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		System.out.println(sum);
		
	}
	public void method3() {
		//{배열 값1, 배열 값2, 배열 값3}
		int [] score = {75,80,95,81,84};
		//최대값 구하기 
		int max = score[0];
		for(int i=0; i<score.length; i++) {
			if(max<score[i]) max = score[i];
		}
		System.out.println("최대값 : "+max);
		
		//최소값 구하기
		int min = score[0];
		for(int i=0; i<score.length; i++) {
			if(min>score[i]) min = score[i];
		}
		System.out.println("최소값 : "+min);
		
		
	}
	public void method4() {
		// 키보드로 금액을 입력받고
		// 알맞은 금액을 거슬러 주세요.
		// ex) 55400 -> 10000*5+5000+100*4
		
		int[] coin = {50000,10000, 5000, 1000, 500, 100, 50, 10};
		
		System.out.println("거스름돈 계산기");
		System.out.print("계산 금액 : ");
		
		int money = sc.nextInt();
		
		
		for(int i=0; i<coin.length; i++) {

			int count = money/coin[i];
			
			if(count == 0) continue;
			money = money%coin[i];
			System.out.println(coin[i]+" : "+count+"개");
			
		}
		
		
	}
	public void method5() {
		//배열복사 : 얕은복사(shallow copy), 깊은복사
		//1. 얕은복사, 복사된 배열이나 원본 배열이 변경될때 서로 간의 값이 같이 변경(주소값 복사)
		
		int[] source = {1,2,3,4,5};
		int[] target = source;
		System.out.println("변경전");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
		System.out.println();
//		for(int i=0; i<source.length; i++) {
//			System.out.print(source[i]+"\t");
//		}
//		System.out.println();
//		for(int i=0; i<target.length; i++) {
//			System.out.print(target[i]+"\t");
//		}
//		System.out.println();
		
		target[2] = 10;
		
		System.out.println("변경후");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
		System.out.println();
	}
	public void method6() {
		// 2. 깊은 복사, 배열공간을 별도로 확보
		// a. 반복문이용
		// b. System.arraycopy();
		// c. clone();
		
		int[] source = {1,2,3,4,5};
		
		//a. 반복문 이용
		int[] target1 = new int[source.length];
		
		for(int i=0; i<source.length; i++) {
			target1[i] = source[i];
		}

		
//		System.out.println("변경전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target1));
//		target1[2] = 10;
//		
//		System.out.println("변경후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target1));
		
		
		//b.System.arraycopy();
		int[] target2 = new int[source.length];
		System.arraycopy(source,0,target2,0,source.length);
		
		System.out.println("변경전");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target2));
		target2[2] = 10;
	
		System.out.println("변경후");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target2));
		
		//c.clone();
		int[] target3 = source.clone();
		
		System.out.println("변경전");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));
		target2[2] = 10;
	
		System.out.println("변경후");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));
		
		
	}
	public void method7() {
		// 버블정렬
		// 원본자료가 n개일때 n-1차 운행한다.
		// 각회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은값을 앞에 위치시킴
		
		int[] num = {67,55,9,86,98};
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=0; j<num.length-1; j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					System.out.println();
				}
			}
		}
	}
	public void method8() {
		// 항상된버블정렬
		// 원본자료가 n개일때 n-1차 운행한다.
		// 각회차에서 인접한 두 값을 비교하여 오름차순인 경우
		// 작은값을 앞에 위치시킴
		// 버블정렬이 완료되면 반복문을 종료시킨다.
		
		int[] num = {67,55,9,86,98};
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length-1; i++) {
			boolean flag = true;
			for(int j=0; j<num.length-1; j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = false;
				}
			}
			if(flag) break;
		}
	}
	public void method9() {
		//
		int[] num = {67,55,9,86,98};
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length-1; i++) {
			int minIndex = i;
			for(int j=i; j<num.length; j++) {
				if(num[j]<num[minIndex]) {
					minIndex = j;
				}
			}
			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}
		System.out.println(Arrays.toString(num));
	}
}
