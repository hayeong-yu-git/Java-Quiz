package com.greedy.operatorPractice;

public class Application3 {

	public static void main(String[] args) {
		
		/*
		 * 문자형 변수 하나를 선언하고 변수에 값이 M으로 초기화하면 남자입니다.
		 * F이면 여성입니다를 출력하도록 작성하세요 (삼항연산자사용)
		 * 
		 * M 
		 * 
		 * ---- 출력 결과 ---
		 * 남자입니다.
		 * */
		
//		char gender1 = 'M';
//		char gender2 = 'F';
//		System.out.println((gender1=='M')? "남자입니다." : "여성입니다.");
		
		
		char gender3;
		gender3 = 'M'; 
		System.out.println((gender3=='M')? "남자입니다." : "여성입니다.");
		
		//answer (변수에 담아서 출력한 점만 다름)
		String result = (gender3=='M')? "남자입니다." : "여성입니다.";
		System.out.println(result);
		
	}

}
