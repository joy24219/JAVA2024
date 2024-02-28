package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	public void method6() {
		int[] array = {1,3,5,2,4};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
	public void method5() {
		//1차원 배열 건너뛰기
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[5];
		arr[2] = new int[5];
		
	}
	public void method4() {
      int [][] numList1= new int[5][5];
      int [][] numList2= new int[5][5];
      int [][] numList3= new int[5][5];
      int [][] numList4= new int[5][5];
      
      
      /*
       * 1   2   3   4   5
       * 6   7   8   9   10
       * 11   12   13   14   15
       * 16   17   18   19   20
       * 21   22   23   24   25
       */
      int k=1;
      for(int i=0;i<numList1.length;i++) {
         for(int j=0;j<numList1[i].length;j++) {
            numList1[i][j] = k++;
            
         }
      }
      
      for(int i=0;i<numList1.length;i++) {
         for(int j=0;j<numList1[i].length;j++) {
            System.out.print(numList1[i][j]+"\t");
         }
         System.out.println();
      }
      System.out.println("-------------------------------");
      
      /*
       * 1   6   11   16   21
       * 2   7   12   17   22
       * 3   8   13   18   23
       * 4   9   14   19   24
       * 5   10   15   20   25
       */
      
      for(int i=0;i<numList2.length;i++) {
         for(int j=0;j<numList2[i].length;j++) {
            numList2[i][j] = (i+1) + (j*5);
         }
      }
      for(int i=0;i<numList2.length;i++) {
         for(int j=0;j<numList2[i].length;j++) {
            System.out.print(numList2[i][j]+"\t");
         }
         System.out.println();
      }
      System.out.println();
      int k2=1;
      for(int i=0;i<numList2.length;i++) {
         for(int j=0;j<numList2[i].length;j++) {
            numList2[j][i] = k2++;
         }
      }
      for(int i=0;i<numList2.length;i++) {
         for(int j=0;j<numList2[i].length;j++) {
            System.out.print(numList2[i][j]+"\t");
         }
         System.out.println();
      }
      
      System.out.println("-------------------------------");
      
      /*
       * 1   2   3   4   5
       * 10   9   8   7   6
       * 11   12   13   14   15
       * 20   19   18   17   16
       * 21   22   23   24   25
       */
      int k3 =1;
      for(int i=0;i<numList3.length;i++) {
         for(int j=0;j<numList3[i].length;j++) {
            
            if(i%2==0) {
               numList3[i][j] = k3++;
            }
            else {
               numList3[i][numList3[0].length-1-j] = k3++;
            }
         }
      }
      
      
      for(int i=0;i<numList3.length;i++) {
         for(int j=0;j<numList3[i].length;j++) {
            System.out.print(numList3[i][j]+"\t");
         }
         System.out.println();
      }
      System.out.println("-------------------------------");
      
      /*
       * 1   6   11   16   21
       * 2   7   12   17   22
       * 3   8   13   18   23
       * 4   9   14   19   24
       * 5   10   15   20   25
       */
      
      
      
   }
//	public void method4() {
//		int [][] numList1 = new int[5][5];
//		int [][] numList2 = new int[5][5];
//		int [][] numList3 = new int[5][5];
//		int [][] numList4 = new int[5][5];
//		
//		int k=1;
////		for(int i=0; i<numList1.length; i++) {
////			for(int j=0; j<numList1[i].length; j++) {
////				numList1[i][j] = k++;
////				System.out.print("\t"+numList1[i][j]);
////			}
////			System.out.println();
////		}
//		
////		for(int i=0; i<numList2.length; i++) {
////			for(int j=0; j<numList2[i].length; j++) {
////				
////				numList2[i][j] = i+1 + j*5; 
////				System.out.print("\t"+numList2[i][j]);
////			}
////			System.out.println();
////		}
//		int k3=1;
////		for(int i=0; i<numList3.length; i++) {
////			if(i/2==1) {
////				for(int j=0; j<numList3[i].length; j++) {
////					numList3[i][j] = k3++;
////					System.out.print("\t"+numList3[i][j]);
////				}
////			}else if(i/2==0) {
////				for(int j=0; j<numList3[i].length; j++) {
////					numList3[i][j] = k3++;
////					System.out.print("\t"+numList3[i][j]);
////				}
////			}
////			System.out.println();
////		}
//		for(int i=0; i<numList3.length; i++) {
//			for(int j=0; j<numList3[i].length; j++) {
//				if(i%2==0) {
//					numList3[i][j] = k3++;					
//				}else if(i%2==1) {
//					numList3[i][numList3[i].length-1-j] = k3++;	
//				}
//				
//				System.out.print("\t"+numList3[i][j]);
//			}
//			System.out.println();
//		}
//		for(int i=0; i<numList4.length; i++) {
//			for(int j=0; j<numList4[i].length; j++) {
//				
//			}
//		}
//	}
	public void method3() {
		int [][] scoreList = {	{80,90,95},
								{95,93,88},
								{100,98,98},
								{88,93,97},
								{92,89,87}	};
		
		// 국어 점수 총합
		int korTol = 0;
		
		for(int i=0; i<scoreList.length; i++) {
			korTol += scoreList[i][0];
		}
		System.out.println("국어 점수 총합 : "+korTol);
		
		// 영어 점수 평균
		int engAvg = 0;
		int engTol = 0;
		
		for(int i=0; i<scoreList.length; i++) {
			engTol += scoreList[i][2];
		}
		engAvg = engTol/scoreList.length;
		
		System.out.println("영어 점수 평균 : "+engAvg);
		
		// 각 사람별 평균
		for(int i=0; i<scoreList.length; i++) {
			int tol = 0;
			int avg = 0;
			
			for(int j=0; j<scoreList[i].length; j++) {
				tol += scoreList[i][j];
			}
			avg = tol/scoreList[i].length;
			System.out.println(i+1+"번째 학생의 합계는 "+tol+" 평균은 "+avg);
		}
		
		
	}
	public void method2() {
		// 5명의 국어 영어 수학 점수 만들기
		
		int[] std1 = {80,90,95};
		int[] std2 = {95,93,88};
		int[] std3 = {100,98,98};
		int[] std4 = {88,93,97};
		int[] std5 = {92,89,87};
		
		int[][] scoreList = new int[5][3];
		
		scoreList[0] = std1;
		scoreList[1] = std2;
		scoreList[2] = std3;
		scoreList[3] = std4;
		scoreList[4] = std5;
		
		//1번째 학생에 국어 점수 출력
		int std1Kor = scoreList[0][0];
		System.out.println("1번째 학생의 국어 점수 : "+std1Kor);
				
		//2번째 학생에 수학 점수 출력
		int std2Met = scoreList[1][2];
		System.out.println("2번째 학생의 수학 점수 : "+std2Met);
		
		//3번째 학생에 영어 점수 출력
		int std3Eng = scoreList[2][1];
		System.out.println("3번째 학생의 영어 점수 : "+std3Eng);
		
		
		//4번째 학생에 총점 구하기.
		int std4All = 0;
		for(int i=0; i<scoreList[3].length; i++) {
			std4All += scoreList[3][i];
		}
		System.out.println("4번째 학생의 총점 : "+std4All);
		
		//5번째 학생의 평균구하기
		
		int std5Avg = 0;
		int std5Sum = 0;
		
		for(int i=0; i<scoreList[4].length; i++){
			std5Sum +=scoreList[4][i];
		}
		std5Avg = std5Sum / scoreList[4].length;
		
		System.out.println("5번째 학생의 평균 : "+std5Avg);
				
	} 
	
	public void method1() {
		int[][] arr = new int [3][3];
		
		int[] sub1 = new int[3];
		int[] sub2 = new int[3];
		int[] sub3 = new int[3];
		
		arr[0] = sub1;
		arr[1] = sub2;
		arr[2] = sub3;
	}
}
