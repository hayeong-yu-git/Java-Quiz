package com.greedy.section02.looping_and_branching.level01.basic;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 10부터 1까지 결과를 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 10 9 8 7 6 5 4 3 2 1
		 * */
		
		for(int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
//		//while문으로도 작성해보기
//		int num = 10;
//		while(num>=1) {
//			System.out.print(num + " ");
//			num--; 							//증감식을 꼭 써줘야 무한반복안함
//		}

		
		
		
		
		
		
		
		//수정 전 문제
		/* 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 정수를 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 1부터 5까지의 합 : 15
		 * 
		 * */
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 한개를 입력 > ");
//		int input = sc.nextInt();
//		
//		int num = 1;
//		int sum = 0;
//		while(num<=input) {
//			sum += num;
//			num++; 	//증감식 안쓰면 while의 조건이 항상 참이 되어 무한반복하게되므로 주의
//		}
//		System.out.println("1부터 " + input + "까지의 합 : " + sum);

	}
}
