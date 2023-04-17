package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		/* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
		 * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
		 * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요. 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개를 입력하세요 : ");
		int input = sc.nextInt();
		
		//중첩 if문으로 작성 
		if(1 <= input && input <= 10) {
			if(input % 2 != 0) {
				System.out.println("홀수다.");
			} else {
				System.out.println("짝수다.");
			}
		} else {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		
		//if-else-if문으로 작성 - 조건의 포함관계(연속x)를 따져볼때 중첩 if문이 더 바람직하다는 생각이 듦
		if(0>input || input>10) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		} else if(input % 2 == 0) {
			System.out.println("짝수다");
		} else {
			System.out.println("홀수다");
		}
	}

}
