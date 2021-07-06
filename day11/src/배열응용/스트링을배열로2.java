package 배열응용;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {

//		String에 포함되어 있는 공백을 제거할 때는 trim을 쓴다
		String s1 = "    감자    ";
		System.out.println(s1.length());
		String s2 = s1.trim(); // 공백을 제거해준다
		System.out.println(s2.length());
		String s3 = s1.replace("    ", ""); // (a, b) 앞의 값(a)을 뒷값(b)으로 대체한다
		System.out.println(s3.length());

		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		System.out.println(data.length());
		String data2 = data.trim();
		System.out.println(data2);
		System.out.println(data2.length());
		String data3 = data2.replace(" ", ""); // 원본이 그대로 유지된다 = 비파괴함수
		System.out.println(data3);

		int[] num = { 1, 2, 5, 10, 4, 20 };
		Arrays.sort(num); // Arrays.sort 함수는 원본을 바꿔버린다 = 파괴함수
		for (int i : num) {
			System.out.print(i + " ");
		}
	}// main

}// class
