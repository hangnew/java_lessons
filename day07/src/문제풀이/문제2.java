package 문제풀이;

public class 문제2 {
	public static void main(String[] args) {

//		1부터 1000까지 중 3씩 점프해주세요
//		5의 배수는 더하지 않습니다
//		만약 더한 값이 100이 넘으면 그만!

		int sum = 0;
		int count = 0;

		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum > 100) {
				System.out.println("더한 값이 100이 넘으면 그만");
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i + ": " + sum);
			sum = sum + i;
			count++; // for 반복문이 이곳까지 도달했을 때 count 값이 1씩 늘어난다 = 총 반복 횟수
		}
		System.out.println(sum);
		System.out.println(count);

	}
}
