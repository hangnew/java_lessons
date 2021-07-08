package 이차원배열;

public class 열이다른 {

	public static void main(String[] args) {

		// 배열에 들어갈 값을 아는 경우
		int[][] n1 = { { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4, 5 } };
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}

		// 배열에 들어갈 값을 모르는 경우
		int[][] n2 = new int[3][];
		int[] r0 = new int[3];
		int[] r1 = new int[4];
		int[] r2 = new int[5];
		n2[0] = r0;
		n2[1] = r1;
		n2[2] = r2;
		for (int i = 0; i < n2.length; i++) {
			for (int j = 0; j < n2[i].length; j++) {
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
