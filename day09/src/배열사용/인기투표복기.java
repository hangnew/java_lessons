package 배열사용;

import java.util.Scanner;

public class 인기투표복기 {

	public static void main(String[] args) {

		String[] name = { "아이유", "유재석", "방탄" };
		int[] vote = new int[3]; // { 0, 0, 0 }
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("인기투표 1)아이유 2)유재석 3)방탄 4)종료");
			System.out.print("선택 번호 >> ");
			int num = sc.nextInt() - 1; // 1을 입력:0으로, 2를 입력:1로...
			if (num == 3) {
				System.out.println();
				System.out.println("결과!!!!!!!");
				for (int i = 0; i < vote.length; i++) {
					System.out.println(name[i] + " " + vote[i] + "표");
				}
				System.out.println("투표를 종료합니다.");
				System.exit(0);
			} // 종료 if
			vote[num]++;
			System.out.println(name[num] + " 한 표 획득!");
			System.out.println();
		} // while
	}

}
