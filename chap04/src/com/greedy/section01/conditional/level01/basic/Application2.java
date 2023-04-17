package com.greedy.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
		 * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력 
		 * 
		 * -- 입력 예시 --
		 * 정수를 하나 입력하세요 : 5
		 * 
		 * -- 출력 예시 --
		 * 홀수다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
//		if(input % 2 == 0) {			 //0입력해도 참이 되므로 짝수로 출력됨
//			System.out.println("짝수다.");
//		} else if(input != 0) {			
//			System.out.println("홀수다.");
//		} else {
//			System.out.println("0이다."); //else{}생략가능
//		}
//		sc.close();
		
		if(input == 0) {
			System.out.println("0이다.");
		} else if(input % 2 == 0) {			
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다."); //else{}생략가능
		}
		sc.close();
		
	}

}
