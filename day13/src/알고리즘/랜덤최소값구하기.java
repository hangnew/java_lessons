package 알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 랜덤최소값구하기 {

	public static void main(String[] args) {

//			1~1000까지의 랜덤값을 10000개 만들어서
//		1) 최소값을 찾아보세요
//		2) 개수를 세어보세요
//		3) 위치값을 찾아보세요

		Random r = new Random(100);
		int[] num = new int[10000]; // 길이 10000의 int 배열

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000) + 1; // 배열 속에 랜덤값 넣기
		}

		int min = num[0]; // 최소값 넣을 변수
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		} // for
		System.out.println("최소값: " + min);

		int count = 0; // 최소값 개수 넣을 변수
		String index = ""; // 최소값 위치 넣을 스트링
		for (int i = 0; i < num.length; i++) {
			if (num[i] == min) {
				count++;
				index += i + " ";
//				index = index + i + " ";
			}
		}
		System.out.println("최소값 개수: " + count);
		System.out.println("최소값 위치: " + index);

		// 파괴함수 Arrays.sort를 써서 정렬 후 최소값/최대값을 찾아보자
		Arrays.sort(num);
		System.out.println(num[0]);
		System.out.println(num[num.length - 1]);

	} // main

} // class
