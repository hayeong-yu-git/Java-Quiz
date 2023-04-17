package com.greedy.section01.array.level03.hard;

import java.util.Random;

public class Application2 {

	public static void main(String[] args) {

		/* 로또번호 생성기 
		 * 6칸 짜리 정수 배열을 하나 생성하고
		 * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
		 * 오름차순 정렬하여 출력하세요
		 * */

		//다시작성
		int[] lotto = new int[6];

		Random r = new Random();
		
		label:
		for(int i=0; i<lotto.length; i++) { //값대입
			lotto[i] = r.nextInt(45) + 1;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) { //중복제거
					i--; 
					continue label; //라벨 붙은 반복문 증감식으로 이동
				}
			}
		}
		
		
		int tmp; //정렬
		for(int i=1; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(lotto[i]<lotto[j]) {
					tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}	
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}//main
}//class















	//		//(1) 배열생성, 난수 배열길이만큼 만들고 인덱스마다 대입
	//		int[] iarr = new int[6];
	//		
	//		for(int i=0; i<iarr.length; i++)  {
	//			iarr[i] = (int)(Math.random()*45) +1;
	//			
	//			//기준인 j번째 값이 오른쪽 값과 같으면 i--하여 바깥 반복문으로 돌아가 이전회차를 다시 돌게 함
	//			for(int j=0; j<i; j++) {
	//				
	//				if(iarr[j] == iarr[i]) {
	//					i--;
	//					break;
	//				}
	//			}
	//			
	//		}//바깥for
	//		
	//		//확인용 출력문 (정렬 전)
	//		System.out.println("==정렬 전==");
	//		for(int i=0; i<iarr.length; i++) { 
	//			System.out.print(iarr[i] + " ");
	//		}
	//		System.out.println();
	//		
	//		
	//		//(2) 오름차순 정렬시키기
	//		System.out.println("==정렬 후==");
	//		for(int i=1; i<iarr.length; i++) {
	//			for(int j=0; j<i; j++) {
	//
	//				if(iarr[i] < iarr[j]) {
	//					int temp;
	//					temp = iarr[i];
	//					iarr[i] = iarr[j];
	//					iarr[j] = temp;
	//				}
	//			}//안쪽for
	//		}//바깥for
	//		
	//		for(int i=0; i<iarr.length; i++) { //출력용 반복문
	//			System.out.print(iarr[i] + " ");
	//		}



