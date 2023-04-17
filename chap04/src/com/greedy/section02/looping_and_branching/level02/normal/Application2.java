package com.greedy.section02.looping_and_branching.level02.normal;

public class Application2 {

	public static void main(String[] args) {
		
		/* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
		 * 
		 * -- 출력 예시 --
		 * abcdefghijklmnopqrstuvwxyz
		 * */
		
		/* 참고: 문자는 사실 정수로 취급
		System.out.println('a'); //a출력
		System.out.println((int)'a'); //97출력 */
		
//		//그래서 숫자가 출력됨
//		for(int i = 'a'; i <= 'z'; i++) {
//			System.out.print(i);
//		} 
		
		//따라서 출력할때 문자로 형변환하기
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i);
		} 
	}
}
