package 문제풀이;

public class 문제풀이1 {

	public static void main(String[] args) {

//		변수에 저장 : 커피 개수 5잔, 커피값 5000원
//		총 커피값을 계산하고 출력

		int num = 5;
		int price = 5000;
		int total = num * price;

		System.out.println("총 커피값은 " + total + "원");

//		커피값이 20000원을 넘으면 "할인해드릴게요." 프린트
//		넘지 않으면 "총 커피값을 내세요."

		if (total > 20000) {
			System.out.println("할인해드릴게요.");
		} else {
			System.out.println("총 커피값을 내세요.");
		}

	}

}
