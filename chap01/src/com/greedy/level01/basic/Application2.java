package com.greedy.level01.basic;

public class Application2 {

	public static void main(String[] args) {
		
		/* 사각형의 넓이와 둘레를 구하는 문제이다.
		 * 너비 12.5 높이 36.4를 변수에 저장하고
		 * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
		 * 
		 * -- 출력 예시 --
		 * 면적 : 455.0
		 * 둘레 : 97.8
		 *  */
		
		double width = 12.5;
		double height = 36.4;
		
		double extent = 0; 
		double dulle = 0;
		extent = width * height;
		dulle = (width + height) * 2; 
				
		System.out.println("===사각형의 넓이와 둘레===");
		System.out.println("사각형의 넓이 : " + extent);
		System.out.println("사각형의 둘레 : " + dulle);
		
//		System.out.println("사각형의 넓이 : " + (width * height));
//		System.out.println("사각형의 둘레 : " + ((width + height) * 2));
//		System.out.println("사각형의 둘레 : " + ((int)(width + height) * 2)); //int로 변환시 96출력
		
		
		
//		//float로 선언후 초기화했을때 차이점
//		float width = 12.5f;
//		float height = 36.4f;
//		
//		System.out.println("너비(가로)" + width);
//		System.out.println("높이(세로)" + height);
//		System.out.println("넓이: " + (width * height)); //넓이: 455.00003
//		System.out.println("둘레: " + ((width + height)*2)); //둘레: 97.8
		
		
		
	}
}
