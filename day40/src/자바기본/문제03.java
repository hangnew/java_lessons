package 자바기본;

public class 문제03 {

	public static void main(String[] args) {
		int i = 100;
		int sum = 0;
		int count = 0;
		while (i < 500) {
			sum += i;
			i++;
			count++;
		}
		System.out.println("100부터 500까지 합계: " + sum);
		System.out.println("더한 횟수: " + count + "번");
	}

}
