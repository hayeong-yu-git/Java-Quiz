package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application5 {

	public static void main(String[] args) {
		
		/* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
		 * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
		 * 계절 구분
		 * 봄 : 3월,4월,5월
		 * 여름: 6월,7월,8월
		 * 가을: 9월,10월,11월
		 * 겨울: 12월,1월,2일
		 * 
		 * -----  출력 -----
		 * 숫자를 입력하세요 : 1
		 * 겨울
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12사이의 정수를 입력해주세요 : ");
		int num = sc.nextInt();
		String season = "";
		
		switch(num) {
			case 12 :                  
			case 1 : 					
			case 2 : season = "겨울"; break;
			case 3 : 					
			case 4 : 				
			case 5 : season = "봄"; break;
			case 6 : 					
			case 7 : 					
			case 8 : season = "여름"; break;
			case 9 : 			
			case 10 : 		
			case 11 : season = "가을"; break;
			default : System.out.println("잘못입력하셨습니다"); 
							//이렇게 default를 쓰는 경우엔 아래처럼 season이 빈 문자열이 아닐때(즉 뭐라도 입력받았을때) 출력하는 출력문 작성
		}
		
		if(season != "")
			System.out.println("입력하신 달은 " + season + "에 해당합니다.");
		
		
		
		/* 잘못입력하셨습니다 default가 아니라 if로 하는 방법? */
//		if(0>num || num>12) {
//			System.out.println("잘못입력하셨습니다");
//		}
//		else {
//			System.out.println("입력하신 달은 " + season + "에 해당합니다.");
//		}
		
	}
}
