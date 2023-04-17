package com.greedy.section02.looping_and_branching.level01.basic;

public class Application1 {

	public static void main(String[] args) {
		
		/* 1부터 10까지 합계를 구하고 결과를 출력하세요
		 * 
		 * -- 출력 예시 --
		 * 1부터 10까지의 합 : 55
		 * */
		
		//1.for문으로 작성
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		//2.while문으로 작성해보기
		int num = 0;
		int sum = 0;
		
		while(num<=10) {
			sum += num; //sum=0+0에서 시작해서 +1 +2...
			num++;		//증감식 빼먹으면 조건식이 항상 참이 되어 무한반복하게됨
			
//			num++;		//순서 바뀌게되면 num=1부터 시작되어 sum=0+1부터 시작되어 +2 +3 +4... 
//			sum += num; //num=10이 while문에 들어온뒤 11이 되어서 더해지기 때문에 마지막에 11이 한번 더 더해짐!!
		}
		System.out.println("1부터 10까지의 합 : " + sum);

	}
}
