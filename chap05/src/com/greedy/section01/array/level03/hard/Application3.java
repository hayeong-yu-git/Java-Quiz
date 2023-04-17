package com.greedy.section01.array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {

		//

		/*
		 * 숫자 야구게임 만들기 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다. 4자리 숫자를 입력받아
		 * 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다. 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는
		 * 맞지 않는 경우는 볼 이다. 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
		 * 
		 * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료 10번의 기회가 모두 소진 되면
		 * "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
		 * 
		 * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되 횟수는 차감하지
		 * 않는다.
		 * 
		 * -- 프로그램 예시 (난수 7416 의 경우) --
		 *
		 * 10회 남으셨습니다. 4자리 숫자를 입력하세요 : 1234 아쉽네요 0S 2B 입니다. 9회 남으셨습니다. 4자리 숫자를 입력하세요 :
		 * 5678 아쉽네요 0S 2B 입니다. 8회 남으셨습니다. 4자리 숫자를 입력하세요 : 7416 정답입니다.
		 */

		Scanner sc = new Scanner(System.in);

		int iarr[] = new int[4]; // 정답 난수
		int input[] = new int[4]; // 입력받을 수
		int countDown = 10;
		int bCount = 0;
		int sCount = 0;

		for (int i = 0; i < iarr.length; i++) {
			iarr[i] = new Random().nextInt(10);
			// 중복제거
			for (int j = 0; j < i; j++) {
				if (iarr[i] == iarr[j]) {
					i--;
					break;
				}
			}
		}

		// 난수가 하나씩 저장된 int배열 출력
		for (int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}

		while (true) {
			System.out.println(countDown + "번의 기회가 남았습니다.");
			System.out.print("4자리 숫자를 입력하세요 : ");
			String str = sc.nextLine(); // 문자열로 입력받음 - 정수로 받게되면 0으로 시작하는 4자리 숫자가 저장될수없다.

			if (str.length() != 4) { // 문자열의 길이가 4가 아니면
				System.out.println("4자리의 정수를 입력해야 합니다.");
			} else { // 4자리의 문자열로 제대로 입력됐을 경우
				countDown--;

				for (int i = 0; i < input.length; i++) { // 미리 준비해둔 input배열의 길이만큼 반복하여
					input[i] = (int) (str.charAt(i) - 48); // 문자열을 뽑아서 저장하고
					if (iarr[i] == input[i]) { // 난수배열과 인덱스별로 비교
						sCount++;
					}
				}
				/*
				 * (구글링)char 형 숫자를 int형으로 변환하는법 숫자의 아스키 값은 48번부터 0~9를 할당하고 있으므로, char형 '1'은 정수값
				 * 49를 가진다. 따라서 0의 아스키 값인 48을 char형의 값에서 빼주면 순수한 숫자를 얻어낼 수 있다.
				 */

				for (int i = 0; i < iarr.length; i++) {
					for (int j = 0; j < iarr.length; j++) {
						if (input[i] != iarr[i] && iarr[i] == input[j]) {
							bCount++;
						}
					}
				}

				if (sCount == 4) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println("아쉽네요 " + sCount + "S " + bCount + "B입니다.");
				}

			}

			if (countDown == 0) {
				System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
				break;//while문 빠져나감
			}
		}//while

	}// main
}// class
