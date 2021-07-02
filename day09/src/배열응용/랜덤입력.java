package 배열응용;

import java.util.Random;

public class 랜덤입력 {

	public static void main(String[] args) {

		Random r = new Random(42); // seed값을 주면 가짜 랜덤 
		int[] jumsu = new int[100];

//		랜덤한 값 하나 만들어서
//		배열의 특정한 인덱스에 저장
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(101);
		}

		for (int i : jumsu) {
			System.out.println(i);
		}
		
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 100) {
				count++;
			}
		}
		System.out.println(count + "번");
	}

}
