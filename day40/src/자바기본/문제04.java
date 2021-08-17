package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 값: ");
		int start = sc.nextInt();
		System.out.print("종료할 값: ");
		int end = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = start; i < end; i++) {
			if (i % 5 == 0) {
				sum += i;
				list.add(i);
			}
		}
		System.out.println("5의 배수만 더한 합계: " + sum);
		System.out.println("5의 배수의 개수: " + list.size());
		System.out.println("5의 배수의 목록: ");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		int avg = sum / list.size();
		System.out.println("5의 배수의 평균: " + avg);
		sc.close();
	}

}
