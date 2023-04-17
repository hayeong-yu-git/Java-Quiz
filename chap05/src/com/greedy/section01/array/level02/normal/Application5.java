package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application5 {

	public static void main(String[] args) {
		
		/* 후라이드, 양념, 파닭, 매콤, 치즈, 간장이라는 메뉴 치킨 메뉴를
		 * 배열에 초기화하고, 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다"
		 * 를 출력하세요
		 * 
		 * ========== 출력 ===========
		 * 치킨 이름을 입력하세요 : 양념
		 * 양념치킨 배달 가능
		 * 
		 * 치킨 이름을 입력하세요 : 달콤
		 * 달콤치킨은 없는 메뉴입니다.
		 * */
		
		String[] menu = {"후라이드", "양념", "파닭", "매콤", "치즈", "간장"};
		
		//입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String order = sc.nextLine();
		
		boolean check = false;
		for(int i=0; i<menu.length; i++) {
			if(order.equals(menu[i])) {
				check = true;
				break;
			}
		}
		
		if(check) {
			System.out.println(order + " 치킨배달가능");
		} else { 
			System.out.println(order + " 치킨은 없는 메뉴입니다."); 
		}
		//출력문은 반복문 안이 아니라 바깥에서 한번만 수행된다. 반복할것에 해당x
		
		
		
		
		
		
		//향상된 for문 - 배열의 값들을 나열하고 조회+출력할때 쓴다
//		//입력받은 문자열을 배열값들과 비교하여 안내문구 출력
//			
//		for(String m : menu) {
//			if(order.equals(m)) {
//				System.out.println(order + "치킨 배달 가능");
//				return;
//			}
//		}
//		System.out.println(order + "치킨은 없는 메뉴입니다.");
		
		
		
	}//main
}//class
