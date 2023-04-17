package com.greedy.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* BMI(신체질량지수)를 계산하고, 계산된 값에 따라 
		 * 저체중(20 미만)인 경우 "당신은 저체중 입니다.", 
		 * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.", 
		 * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.", 
		 * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
		 * 
		 * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
		 * 
		 * 계산 예시) BMI = 67 / (1.7 * 1.7)
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("신장을 입력하세요 : ");
		double heightM = sc.nextDouble() / 100;
		
		System.out.print("체중을 입력하세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (heightM * heightM);
		
		/*반올림하게되면 24.7이어도 25가 되어서 결과가 달라짐 - double값이 비교되는것이 맞다
		int bmi = (int)(Math.round( weight / (heightM * heightM))); 
		System.out.println("반올림한뒤 소수점절삭한 BMI : " + bmi); */
	
		
//		//조건식 더 간단하게 가능(연속적인 구간을 구분하는 조건일때)
//		if(0 < bmi && bmi < 20) { 
//			System.out.println("당신은 저체중 입니다.");
//		} else if(20 <= bmi && bmi < 25) {
//			System.out.println("당신은 정상체중 입니다.");
//		} else if(25 <= bmi && bmi < 30) {
//			System.out.println("당신은 과체중 입니다.");
//		} else {
//			System.out.println("당신은 비만 입니다.");
//		}
		
		//중복을 제거 - 가장 간단한 코드
		String result = "";
		if(bmi<20) {
			result = "저체중";
		} else if(bmi<25) {
			result = "정상체중";
		} else if(bmi<30) {
			result = "과체중";
		} else {
			result = "비만";
		}
		System.out.println("당신은 " + result + "입니다.");
		
		
		//중첩으로도 작성할수있으나 굳이 이렇게 만들 필요 없어보임 - 그저 연속됨(서로 배타적)
//		String result = "";
//		if(bmi<=30) {
//			if(bmi<20) {
//				result = "저체중";
//			} else if(bmi<25) {
//				result = "정상체중";
//			} else {
//				result = "과체중";
//			}
//		} else {
//			result = "비만";
//		}
//		System.out.println("당신은 " + result + "입니다.");
	
	} 
}
