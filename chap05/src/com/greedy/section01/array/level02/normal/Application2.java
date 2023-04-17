package com.greedy.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
		 * 성별 자리 이후부터 *로 가려서 출력하세요
		 * 
		 * -- 입력 예시 --
		 * 주민등록번호를 입력하세요 : 990101-1234567
		 * 
		 * -- 출력 예시 --
		 * 990101-1******
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요 : ");
		String id = sc.nextLine();
		
		//문자 배열에 넣기
		char[] carr = new char[id.length()]; //문자열길이만큼의 문자배열생성 (null값들이 들어가있음)
		
		for(int i=0; i<carr.length; i++) {
			carr[i] = id.charAt(i); //문자열의 i번째에 해당하는 문자를 만들어둔 문자배열[i]에 하나씩 대입
			if(i>=8) {
				carr[i] = '*';
			}
			
			System.out.print(carr[i]);

		}//for문
		
	}

}
