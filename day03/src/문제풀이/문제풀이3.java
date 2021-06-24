package 문제풀이;

public class 문제풀이3 {

	public static void main(String[] args) {
		// 생수값 1000, 생수 구매 개수 2, 마스크 값 2000, 마스크 구매개수 3
		// 내가 지불해야할
		// 1) 생수값 금액은 얼마?
		// 2) 마스크값 금액은 얼마?
		// 3) 총 지불금액은 얼마?

		int wPrice = 1000;
		int wNum = 2;
		int mPrice = 2000;
		int mNum = 3;

		int wTotal = wPrice * wNum;
		int mTotal = mPrice * mNum;

		System.out.println("생수값 금액은 " + wTotal + "원");
		System.out.println("마스크값 금액은 " + mTotal + "원");
		System.out.println("총 지불금액은 " + (wTotal + mTotal) + "원");

	}

}
