package 배열응용;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {

		int[] seat = new int[10]; // 배열은 일반적으로 맨 위에 선언
//		좌석 10개의 int 배열 seat
//			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		Scanner sc = new Scanner(System.in);
//		Scanner import 후 sc에 복사
		int count = 0;
//		예약 횟수 카운팅용 int 변수 count (초기화)
		final int MONEY = 10000;
//		만원을 나타내는 int 변수 MONEY (final : 상수 (값이 변하지 않는다)) = 10000

		while (true) {
			System.out.println("-------------------");
//			
			for (int i = 0; i < 10; i++) {
				System.out.print((i) + " ");
			}
			System.out.println();
			System.out.println("-------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.print("원하는 자리 번호 입력(종료: -1)>> ");

			int no = sc.nextInt(); // 0 입력
			if (no == -1) { // 항상 종료 조건을 위에 쓴다
				System.out.println("예약 시스템 종료합니다.");
				int total = count * MONEY;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break; // while문 종료
			} // 종료 if

//			0 : 빈 자리, 1 : 예약된 자리
//			예약 처리하기 전에 이미 그 자리가 예약된 자리인지 확인해야 한다
//			0번을 입력하면 배열의 인덱스 0번 자리를 1로 변경해서
//			예약되었다는 것을 저장해주자
			if (seat[no] != 1) {
				seat[no] = 1;
				System.out.println(no + "번 예약 완료");
				count++;
				System.out.println(count + "자리 예약됨");
			} else {
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른 자리를 선택해주세요.");
			}
			System.out.println();
		} // 전체 while

		sc.close();

//		1. 지금까지 배열에 저장된 값들 중 1이 몇 개인지 세어보세요
		int count2 = 0;
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
				count2++;
			} // if
		} // for
		System.out.println(count2 + "자리 예약됨");

//		2. 1로 예약된 자리가 어디인지 프린트
		String sum = "";
		for (int i = 0; i < seat.length; i++) {
			if (seat[i] == 1) {
//				System.out.println(i + "번 자리 ");
				sum = sum + i + "번 ";
			}
		} // for
		System.out.println("예약된 자리 목록: " + sum);

	}// main

} // class
