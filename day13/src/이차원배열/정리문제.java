package 이차원배열;

import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {

//		랜덤한 값 1~100 을 4*5 2차원 배열에 넣으세요
//		전체를 프린트하세요

		Random r = new Random(); // 랜덤 부품
		int[][] numbers = new int[4][5]; // 4*5 2차원배열 numbers

		for (int i = 0; i < numbers.length; i++) { // numbers 행의 개수만큼 (numbers.length)
			for (int j = 0; j < numbers[i].length; j++) { // numbers 열의 개수만큼 (numbers[i].length)
				numbers[i][j] = r.nextInt(100) + 1; // (100)을 넣으면 0~99니까 +1을 해준다
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	} // main

} // class
