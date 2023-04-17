package com.greedy.level01.basic;

public class Application1 {
	
	/* 실행용 메소드 */
	public static void main(String[] args) {
		
		// Calculator 클래스의 메소드를 호출 해서 실행
		Calculator calc = new Calculator();
		calc.checkMethod();
		
		/*String result1 = calc.sumTwoNumber(10, 20);
		  System.out.println(result1); */
		System.out.println(calc.sumTwoNumber(10, 20));
		/*String result2 = calc.multiTwoNumber(30, 40);
		  System.out.println(result2); */
		System.out.println(calc.multiTwoNumber(30, 40));
		
		//리턴값이 int인 메소드 multiTwoNumber2실행
		System.out.println("50과 60의 곱은 " + calc.multiTwoNumber2(50, 60));
	}
}
