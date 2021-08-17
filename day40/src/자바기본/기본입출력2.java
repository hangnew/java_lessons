package 자바기본;

import java.util.Scanner;

public class 기본입출력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] ondo = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 몇 도인가요? ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요.");
			} 
			sum += temp;
			ondo[i] = temp;
		}
		double avg = sum / 5.0;
		System.out.println("평균은 " + avg + "도");
		for (int i = 0; i < ondo.length; i++) {
			System.out.print(ondo[i] + "도 ");
		}
		sc.close();
	}

}
