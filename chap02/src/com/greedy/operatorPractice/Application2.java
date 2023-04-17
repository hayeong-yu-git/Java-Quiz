package com.greedy.operatorPractice;

public class Application2 {

	public static void main(String[] args) {
		
		/*
		 * 임의의 정수 한개를 선언하고 해당 숫자가 13세 이하이면 어린이, 13세초과 ~ 19세 이하이면
		 * 청소년, 19세 초과이면 성인이라고 출력되도록 작성하세요
		 * 
		 * 19
		 * 
		 * ------ 출력 결과 --------
		 * 청소년
		 * */
		
		int age1 = 20;
		int age2 = 19;
		int age3 = 13;
		
		String result1 = (age1 <= 13)? "어린이" : (13 < age1 && age1 <= 19)? "청소년" : "성인" ; 
		String result2 = (age2 <= 13)? "어린이" : (13 < age2 && age2 <= 19)? "청소년" : "성인" ; 
		String result3 = (age3 <= 13)? "어린이" : (13 < age3 && age3 <= 19)? "청소년" : "성인" ; 
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		//answer
		String str = (age1 <= 13)? "어린이" : (age1 > 19) ? "성인" : "청소년";
		System.out.println(str);
		
	}

}
