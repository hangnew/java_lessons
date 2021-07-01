package 배열응용;

import java.util.Scanner;

public class ppt점수입력배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하세요: ");
			int scoreInt = sc.nextInt();
			score[i] = scoreInt;
//			System.out.println(score[i]); 확인용
		}
//		System.out.println("score[0] : "+score[0]);
//		System.out.println("score[1] : "+score[1]);
//		System.out.println("score[2] : "+score[2]);	확인용

		int sum = 0;
		for (int i : score) {
			sum = sum + i;
//			System.out.println(sum); 확인용
		}

		System.out.println("총점 : " + sum + "점");
		System.out.println("평균 : " + (sum / score.length) + "점");
	}

}
