package 복습;

import java.util.Random;

public class 랜덤1000개 {

	public static void main(String[] args) {
		
		
		int[] jumsu = new int[1000];
		// {0, 0, 0, 0, 0, 0, 0, .....0}
		// 변수 개수 : 1002개
		// 램의 크기 : 4004 + 8 = 4012byte
		System.out.println(jumsu.length + "개");
		System.out.println(jumsu);
		// 기본형 변수(값) : 1001개
		// 참조형 변수(주소) : 1개
		
		Random r = new Random(42);
//		System.out.println(r.nextInt(100));
//		jumsu[0] = r.nextInt(100);
//		jumsu[1] = r.nextInt(100);
//		jumsu[2] = r.nextInt(100);
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(100);
		} // for
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
	} // main

} // class
