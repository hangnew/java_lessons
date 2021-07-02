package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {

//		배열을 만들 때 
//		1. 값을 처음부터 알고 있는 경우
		int[] num = { 100, 200, 300 };
		num[1] = 500;
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int x : num) {
			System.out.println(x);
		}

//		2. 값을 처음에 모르지만 나중에 넣는 경우
		int[] num2 = new int[3]; // { 0, 0, 0 } 으로 자동 초기화 된다
		num2[0] = 1000;
		num2[num2.length - 1] = 1000;
		for (int x : num2) {
			System.out.println(x);
		}

	}

}
