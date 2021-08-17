package 자바기본;

import java.util.Scanner;

public class 기본입출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		// 오늘 온도는 몇 도인가요?
		// 변수에 넣어서 30도 이상이면 너무 더워요.
		// 30도 미만이면 괜찮아요.
		for (int i = 0; i < 5; i++) {
			System.out.print("오늘 몇 도인가요? ");
			int temp = sc.nextInt();
			if (temp >= 30) {
				System.out.println("너무 더워요.");
			} else {
				System.out.println("괜찮아요.");
			} 
			sum += temp;
		}
		// int avg = sum / 5;
		double avg = sum / 5.0;
		// double avg = (double)sum / 5;
		System.out.println("평균은 " + avg);
		sc.close();
	}

}
