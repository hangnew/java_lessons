package 누적연습;

public class 누적10까지 {

	public static void main(String[] args) {

//		1~10까지 더해봅시다
		int sum = 0; // 선언 시 초기값 대입 (이 경우 비워두면 쓰레기값이 들어가 있다)

		for (int i = 1; i <= 10; i++) {
//			1 + 2 + 3 + 4 + ...
			sum = sum + i; // 1 = 0 + 1
							// 3 = 1 + 2
							// 6 = 3 + 3
//			System.out.println(sum); // 반복 과정 중 중간 sum값이 출력된다
		} // for
		System.out.println(sum);
	}

}
