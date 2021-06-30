package 문제풀이;

public class 문제1 {

	public static void main(String[] args) {

//		33~222 모두 더해주세요
		int sum = 0;
		for (int i = 33; i <= 222; i++) { // 증감연산자 (i++의 의미 : i = i + 1)
			sum = sum + i;
			System.out.println(i + ": " + sum);
		}
		System.out.println(sum);

//		55~4500, 2씩 점프하면서 더해주세요
		int sum1 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);

//		0~6000, 5씩 점프하면서 더해주세요
		int sum2 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);

	}// main

} // class
