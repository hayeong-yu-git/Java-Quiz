package com.greedy.level01.normal;

import java.util.Random;
//import static com.greedy.level01.normal.RandomMaker.*;

public class Application1 {

	/* 실행용 메소드 */
	public static void main(String[] args) {
		
		/* RamdomMaker 클래스의 메소드를 호출해서 실행 */
		
		//System.out.println(rockPaperScissors()); 위에 임포트하면 클래스명 떼고 메소드만 쓸수있음
		System.out.println(RandomMaker.rockPaperScissors());
		
		//System.out.println(tossCoin());
		System.out.println(RandomMaker.tossCoin());
		
	}
}
