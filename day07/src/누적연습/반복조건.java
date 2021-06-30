package 누적연습;

public class 반복조건 {

	public static void main(String[] args) {

		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) { // % : 나머지 연산자
				sum1 = sum1 + i;
			} // if
		} // for
		System.out.println(sum1);

		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
//				continue : 강제로 반복문을 계속 실행하라는 의미
//				*** 조건에 맞는 경우 아래에 있는 코드는 더 이상 실행되지 않는다 *** (필터 역할)
//				즉, 제외의 의미이다 (exclude)
			} // if
			if (sum2 > 20) {
				System.out.println("20보다 합이 크므로 stop");
				break;
			}
			sum2 = sum2 + i;
		} // for
		System.out.println(sum2);

		int sum3 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 != 0) {
				sum3 = sum3 + i;
			} // if
		} // for
		System.out.println(sum3);

	} // main
} // class