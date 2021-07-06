package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {

		int[] jumsu = new int[10000];
		Random r = new Random(5);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(331); // 0~330
		} // for

//		1. 수능 만점자는 몇 명일까요?
//		2. 만점자 번호는 몇 번일까요?
		int count = 0;
		String index = ""; // index 저장용
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 330) {
				count++;
				System.out.println("번호> " + i);
				index = index + i + "번 "; // String의 +는 결합연산자
			}
		} // for
		System.out.println("만점자: " + count + "명");
		System.out.println("만점자: " + index);

	} // main

}// class
