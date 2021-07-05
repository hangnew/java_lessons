package 문제풀이;

import java.util.Scanner;

public class 정수5개입력 {
	public static void main(String[] args) {

		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (i + 1) * 10;
//		}
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력>> ");
			num[i] = sc.nextInt();
		}
//		for (int i : num) {
//			System.out.println(i);
//		}
		System.out.println("첫번째+세번째 " + (num[0] + num[2]));
		sc.close(); // 스트림(연결통로)를 닫아라
	}
}
