package 자바기본;

import java.util.Random;

public class 문제05 {

	public static void main(String[] args) {
		Random r = new Random();
		int n1 = r.nextInt(100);
		int n2 = r.nextInt(100) + 1000;
		int sum = 0;
		for (int i = n1; i < n2; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("첫번째 숫자: " + n1);
		System.out.println("두번째 숫자: " + n2);
		System.out.println("3의 배수만 더한 값: " + sum);

	} // main

}
