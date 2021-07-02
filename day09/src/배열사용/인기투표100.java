package 배열사용;

import java.util.Scanner;

public class 인기투표100 {

	public static void main(String[] args) {

		String[] name = { "아이유", "유재석", "방탄소년단" };
		int[] tv = new int[3]; // 투표수 { 0, 0, 0 }
//		System.out.println(name[0] + ": " + tv[0]);

		Scanner sc = new Scanner(System.in);

//		사용자가 사용할 수 있도록 화면을 만들어 보자
		while (true) {
			System.out.println("인기투표 0)아이유 1)유재석 2)BTS 3)종료");
			System.out.print("선택 번호 >> ");
			int num = sc.nextInt();
			if (num == 3) { // 종료되는 코드를 제일 먼저 넣는다
				System.out.println("시스템을 종료합니다.");
				for (int i = 0; i < tv.length; i++) { // 배열의 index가 필요할 땐 일반for문을 쓴다
					System.out.println(name[i] + ": " + tv[i] + "표");
				}
				System.exit(0);
			}
			tv[num]++;
			System.out.println(name[num] + " " + tv[num] + "표 획득!");
		} // while

//		System.out.println(name[0]+"가 한 표 획득!");
	}

}
