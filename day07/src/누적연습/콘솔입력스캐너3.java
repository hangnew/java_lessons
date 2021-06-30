package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + (age + 1) + "세");

		System.out.print("키를 입력 >> ");
		double height = sc.nextDouble();
		System.out.println("내년 키는 " + (height + 10) + "cm");
		
		System.out.print("저녁을 먹었는지 (true/false) >> ");
		boolean dinner = sc.nextBoolean();
		if (dinner) { // if ()괄호 값이 이미 boolean(true/false)이기 때문에 비교당할 변수만 넣으면 된다
			System.out.println("배가 부르시겠군요!");
		} else {
			System.out.println("배고프시겠군요!");
		}
		sc.nextLine();
//		sc.nextLine();은 엔터를 기준으로 입력값을 가지고 온다.
//		하지만, 정작 nextLine을 사용하고 싶은 코드는 아래에 존재하기 때문에
//		미리 sc.nextLine();을 써서 앞선 저녁 질문에 입력한 엔터를 상쇄시켜야 한다.
		
		System.out.print("올해의 목표는 >> ");
		String goal = sc.nextLine();
		System.out.println("올해 목표는 " + goal + "!!");
		
	} // main

}// class