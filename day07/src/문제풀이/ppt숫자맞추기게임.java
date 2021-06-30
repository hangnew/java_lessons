package 문제풀이;

import java.util.Random;
import java.util.Scanner;

public class ppt숫자맞추기게임 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		while (true) {
			int count = 1;
			int target = r.nextInt(100) + 1;
			System.out.println(target);
			while (true) {
				System.out.print("숫자를 맞춰보세요 (1~100): ");
				int inputNum = sc.nextInt();

				if (inputNum == target) {
					System.out.println("정답입니다. " + count + "번만에 맞추셨네요.");
					break;
				} else if (inputNum > target) {
					System.out.println("Down");
					count++;
				} else {
					System.out.println("Up");
					count++;
				} // 정답 if
			} // 맞춰보세요 질문 while

			System.out.print("재시작 : 1, 종료 : 2");
			int restart = sc.nextInt();
			if (restart == 1) {
				System.out.println();
				continue;
			} else {
				break;
			} // 게임 재시작 if
		} // 전체 while

	}// main

} // class
