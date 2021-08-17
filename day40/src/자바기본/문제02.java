package 자바기본;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		// 오늘의 도시별 유가를 입력받아 입력받은 값들과 평균을 구해보자.
		// 입력받을 도시의 개수도 입력받자.
		Scanner sc = new Scanner(System.in);
		// 반복할 횟수를 입력받아 count 정수 변수에 넣는다.
		System.out.print("입력할 유가 갯수: ");
		int count = sc.nextInt();
		
		// 입력값을 넣어 놓을 배열과 합계를 선언하고 초기화한다.
		int sum = 0;
		// 배열의 길이는 처음에 입력받은 count
		int[] prices = new int[count];
		
		// 입력받은 횟수(count)만큼 반복한다
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "번째: ");
			int price = sc.nextInt();
			
			// sum = sum + price
			sum += price;
			// i번째 배열의 값 = price
			prices[i] = price;
		}
		
		// 평균
		int avg = sum / count;
		System.out.println("오늘의 유가 평균: " + avg + "원/리터");
		
		// 배열의 길이만큼 반복하여 출력한다.
		System.out.print("입력받은 값 : ");
		for (int i = 0; i < prices.length; i++) {
			System.out.print(prices[i] + "원 ");
		}
		System.out.println();
		
		// 입력받은 유가 중 최고가와 최저가를 구해보자.
		// 최고가와 최저가를 선언 후 배열의 첫 번째 값을 넣어 놓는다.
		int high = prices[0];
		int low = prices[0];
		
		// 배열의 길이만큼 반복하여 high에 들어간 값보다 크면 그 수로 덮어씌운다.
		for (int i = 0; i < prices.length; i++) {
			if (high < prices[i]) {
				high = prices[i];
			}
		}
		
		// 배열의 길이만큼 반복하여 low에 들어간 값보다 작으면 그 수로 덮어씌운다.
		for (int i = 0; i < prices.length; i++) {
			if (low > prices[i]) {
				low = prices[i];
			}
		}
		
		// high와 low 출력
			System.out.println("최고가: " + high + "원/리터");
			System.out.println("최저가: " + low + "원/리터");
		
		sc.close();
	}

}
