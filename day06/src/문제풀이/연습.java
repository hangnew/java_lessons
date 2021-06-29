package 문제풀이;

public class 연습 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { // i가 5 될때까지 (1씩 증가) 반복
			for (int j = 0; j < i; j++) { // j가 i보다 작을때 반복 (1씩 증가)
				System.out.print("ㅁ");
			}
			System.out.println("");
		}
		for (int i = 5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("ㅁ");
			}
			System.out.println("");
		}
	}

}
