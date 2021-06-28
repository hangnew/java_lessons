package 반복문;

public class 반복문1 {

	public static void main(String[] args) {

//		1부터 5까지 반복해서 찍어보자
		for (int i = 1; i <= 5; i++) { // i++ : i + 1
			System.out.println(i);
		}

//		1부터 10까지 2씩 점프해서 찍어보자
		for (int i = 1; i <= 10; i = i + 2) {
			System.out.println(i);
		}

//		1부터 100까지 5씩 점프해서 찍어보자
		for (int i = 1; i <= 100; i = i + 5) {
			System.out.println(i);
		}

//		100부터 1까지 1씩 점프해서 찍어보자
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}

//		1000부터 0까지 8씩 점프해서 찍어보자
		for (int i = 1000; i >= 0; i = i - 8) {
			System.out.println(i);
		}

	}

}
