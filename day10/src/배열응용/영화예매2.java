package 배열응용;

import java.util.Scanner;

public class 영화예매2 {

	public static void main(String[] args) {

		int[] seat = new int[10]; // 10개의 int 배열 seat 
		Scanner sc = new Scanner(System.in); // 스캐너 부품
		int count = 0; // int형 count 초기화
		final int MONEY = 10000; // int형 MONEY 값 입력+선언 (final: 추후에 값변경 불가) (=상수)

		while (true) {
			System.out.println("-------------------");
//			i가 1~11까지 반복 (한바퀴 돌 때마다 +1), 출력한다 (자리 번호)
//			1~10으로 출력하기 위해서 초기값을 1, 범위를 <11 로 준다
			for (int i = 1; i < 11; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			System.out.println("-------------------");
			
//			i가 0~10(배열의 갯수)
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			
			System.out.println();
			System.out.println("-------------------");
			System.out.print("원하는 자리 번호 입력(종료:0)>> ");
			int input = sc.nextInt();
			if (input == 0) {
				System.out.println("예약 시스템을 종료합니다.");
				int total = count * MONEY;
				System.out.println("금액: " + total + "원");
				break;
			} // if
			if (seat[input - 1] == 0) {
				seat[input - 1] = 1;
				System.out.println(input + "번 자리 예약완료");
				count++;
				System.out.println(count + "자리 예약");
			} else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("빈 자리를 선택해주세요.");
			}
			System.out.println();
		} // while
		sc.close();

		// 몇 자리가 예약됐는지 (1인 갯수)
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			}
		} // for
		System.out.println("총 " + count2 + "자리 예약");

		// 몇번 자리가 예약됐는지 (1의 위치)
		String sum = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				sum = (sum + (i + 1)) + "번 ";
			}
		} // for
		System.out.println("예약된 자리: " + sum);

	}// main

}// class
