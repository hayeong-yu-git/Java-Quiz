package com.greedy.level01.normal;

public class RandomMaker {

	/* 
	 * static 메소드로 생성
	 * 반환형 : String
	 * 메소드명 : rockPaperScissors
	 * 
	 * 가위,바위,보 중에 하나를 출력
	 * (가위,바위,보 는 난수를 이용하여 구현)
	 * 
	 * -- 출력 --
	 * 가위
	 * */
	
	/* 
	 * static 메소드로 생성
	 * 반환형 : String
	 * 메소드명 : tossCoin
	 * 
	 * 동전 앞/뒤 중에 하나를 출력
	 * (앞면,뒷면은 난수를 이용하여 구현)
	 * 
	 * -- 출력 --
	 * 앞면
	 * 
	 * */
	
	public static String rockPaperScissors() {
		//int randNum = new Random().nextInt(3); //Random클래스의 nextInt()메소드
		int randNum = (int) (Math.random() * 3);//Math클래스의 static메소드
		System.out.println("randNum : " + randNum);
		String result = (randNum == 0)? "가위" : (randNum == 1)? "바위" : "보";
		return result;
	}
	
	public static String tossCoin() {
		//int randNum = new Random().nextInt(2);
		int randNum = (int) (Math.random() * 2);
		System.out.println("randNum : " + randNum);
		String result = (randNum == 0)? "앞면" : "뒷면";
		return result;
	}
	
	
}
