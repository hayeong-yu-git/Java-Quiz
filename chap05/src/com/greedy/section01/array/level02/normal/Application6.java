package com.greedy.section01.array.level02.normal;

import java.util.Random;

public class Application6 {

	public static void main(String[] args) {
		
		/* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1 ~ 10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 찾아서 출력하세요.
		 * 
		 * =========== 출력 ============
		 * 2 10 5 2 3 7 3 7 9 7
		 * 최대값 : 10
		 * 최소값 : 2
		 * */
		
//		//다시작성->반복제거여지있음 아래처럼 개선가능
//		int[] iarr = new int[10];
//		Random r = new Random();
//		
//		for(int i=0; i<iarr.length; i++) {
//			iarr[i] = r.nextInt(10)+1;
//		}
//		
//		for(int i=0; i<iarr.length; i++) {
//			System.out.print(iarr[i] + " ");
//		}
//		
//		int max = 1;
//		int min = 10;
//		
//		for(int i=0; i<iarr.length; i++) {
//			if(iarr[i] > max)
//				max = iarr[i];
//		}
//		for(int i=0; i<iarr.length; i++) {
//			if(iarr[i] < min)
//				min = iarr[i];
//		}
//		System.out.println();
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
	
		
		


		
		int[] iarr = new int[10];
		
		Random r = new Random();
		
		int max = 1;
		int min = 10;
		for(int i=0; i<iarr.length; i++) {
			
			iarr[i] = r.nextInt(iarr.length) + 1;
			
			if(iarr[i] > max) {
				max = iarr[i];
			}
			if(iarr[i] < min) {
				min = iarr[i];
			}
			
			System.out.print(iarr[i] + " "); //배열출력
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}//main
}//class	
