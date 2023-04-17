package com.greedy.section02.demensional_array.level02.normal;

public class Application2 {

	public static void main(String[] args) {

		/*
		 * 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고, 2열 3행 2차원 배열을 2개 할당하여 각
		 * 1분단 2분단이라고 칭한다. 순차적으로 1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
		 * 
		 * -- 출석부 -- 1. 홍길동 2. 이순신 3. 유관순 4. 윤봉길 5. 장영실 6. 임꺽정 7. 장보고 8. 이태백 9. 김정희 10.
		 * 대조영 11. 김유신 12. 이사부
		 * 
		 * -- 출력 예시 -- == 1분단 == 홍길동 이순신 유관순 윤봉길 장영실 임꺽정
		 * 
		 * == 2분단 == 장보고 이태백 김정희 대조영 김유신 이사부
		 */
		
		
		String[] names = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
		
		String[][] bundan1 = new String[3][2];
		String[][] bundan2 = new String[3][2];
		
		//대입
		int cnt = 0;
		for(int i=0; i<bundan1.length; i++) {
			for(int j=0; j<bundan1[i].length; j++) {
				bundan1[i][j] = names[cnt];
				cnt++;
			}
		}
		for(int i=0; i<bundan2.length; i++) {
			for(int j=0; j<bundan2[i].length; j++) {
				bundan2[i][j] = names[cnt];
				cnt++;
			}
		}
		
		//출력
		for(int i=0; i<bundan1.length; i++) {
			for(int j=0; j<bundan1[i].length; j++) {
				System.out.print(bundan1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===========");
		for(int i=0; i<bundan2.length; i++) {
			for(int j=0; j<bundan2[i].length; j++) {
				System.out.print(bundan2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		//출석부 1차원배열 생성
//		String[] student = new String[12];
//
//		student[0] = "홍길동";
//		student[1] = "이순신";
//		student[2] = "유관순";
//		student[3] = "윤봉길";
//		student[4] = "장영실";
//		student[5] = "임꺽정";
//		student[6] = "장보고";
//		student[7] = "이태백";
//		student[8] = "김정희";
//		student[9] = "대조영";
//		student[10] = "김길동";
//		student[11] = "이길동";
//
//		//2차원 배열 두개 생성
//		String[][] sarr1 = new String[3][2]; // 1분단
//		String[][] sarr2 = new String[3][2]; // 2분단
//
//		System.out.println("====1분단====");
//
//		int count = 0;
//		for (int i = 0; i < sarr1.length; i++) {
//			for (int j = 0; j < sarr1[i].length; j++) {
//				sarr1[i][j] = student[count++];
//					//sarr1[i][j] = student[count]; 하고 아래에 count++해줘도 됨
//				System.out.print(sarr1[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println("====2분단====");
//
//		for (int i = 0; i < sarr2.length; i++) {
//			for (int j = 0; j < sarr2[i].length; j++) {
//				sarr2[i][j] = student[count++];
//				System.out.print(sarr2[i][j] + " ");
//			}
//			System.out.println();
//		}

	}// main
}// class
