package 클래스생성;

public class 계산기 {

	public void 더하기(int a, int b) {
		System.out.println("더하기 기능 처리");
		int result = a + b;
		System.out.println("두 수의 합: " + result);
	}

	public void 빼기() {
		System.out.println("빼기 기능 처리");
	}

	public void 곱하기(int price, int count) {
		System.out.println("곱하기 기능 처리");
		int result = price * count;
		System.out.println("두 수의 곱: " + result);
	}

	public void 나누기(double a, double b) {
		System.out.println("나누기 기능 처리");
		double result = a / b;
		System.out.println("두 수의 나누기: " + result);
	}

	public void order(String food) {
		System.out.println("당신이 주문한 것은 " + food + "입니다.");
	}

}
