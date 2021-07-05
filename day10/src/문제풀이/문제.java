package 문제풀이;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {

//		##참고, 사과/바나나는 2000원씩, 포도/키위는 3000원씩
//		===========
//		좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 1
//		===========
//		사과가 선택되었습니다.

//		===========
//		좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 2
//		===========
//		바나나가 선택되었습니다.

//		===========
//		좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료>> 0
//		===========
//		시스템이 종료됩니다.
//		사과: 3개
//		바나나: 2개
//		포도: 1개
//		키위: 2개
//		구매하려면 전체 금액은 _________원입니다.

		Scanner sc = new Scanner(System.in);
		String[] fruits = { "사과", "바나나", "포도", "키위" };
		int[] count = new int[4]; // 과일 갯수
		while (true) {
			System.out.println("=============");
			System.out.print("좋아하는 과일은? 1)사과 2)바나나 3)포도 4)키위 0)종료 >> ");
			int select = sc.nextInt();
			System.out.println("=============");
			if (select == 0) { // 사용자가 0을 입력하면
				System.out.println("시스템이 종료됩니다.");
				for (int i = 0; i < fruits.length; i++) { // 구매한 갯수 알려주기
					System.out.println(fruits[i] + ": " + count[i] + "개"); // (i위치 과일이름+카운트 출력)*4번반복
				}
				int total = (count[0] + count[1]) * 2000 + (count[2] + count[3]) * 3000; // 총 금액 계산
				System.out.println("구매하려면 전체 금액은 " + total + "원입니다."); // 총 금액 출력
				break;
			}
			// *** index는 0부터 시작하기 때문에 입력값 - 1을 해야한다. ***
			count[select - 1]++; // 카운트 + 1
			System.out.println(fruits[select - 1] + "가 선택되었습니다."); // 선택한 과일 이름 출력
			System.out.println();
		} // while
		sc.close();

	} // main

}// class
