package 배열응용;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {

//		답안 999개 공간
//		내 답 999개 공간

		int[] 답안 = new int[999];
		int[] 내답 = new int[999];
		Random r = new Random(1); // pseudo 인위적 랜덤

		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 0~3 (+1해줘서 1~4)
			내답[i] = r.nextInt(4) + 1; // 0~3 (+1해줘서 1~4)
		} // for

		System.out.println("번호 :  답안       내답");
		for (int i = 0; i < 내답.length; i++) {
			System.out.println(i + "   :   " + 답안[i] + "   <->   " + 내답[i]);
		} // for

//		점수 채점시 맞은 문제 하나당 1점을 부여
		int jumsu = 0;
//		답안과 내 답이 동일해야 한다
		for (int i = 0; i < 내답.length; i++) {
//			답안[]과 내답[] 속 같은 인덱스(i)에 들어있는 값이 동일하면 점수 1점 획득
			if (답안[i] == 내답[i]) {
				jumsu++;
			}
		} // for
		System.out.println("당신의 토익 점수는 " + jumsu + "개");

//		답안보다 내 답이 정답이 더 큰 경우 몇 문제인지 카운트
		int high = 0;
		for (int i = 0; i < 내답.length; i++) {
			if (내답[i] > 답안[i]) {
				high++;
			} // if
		} // for
		System.out.println("내 답이 더 큰 경우는 " + high + "번");
	}// main

}// class