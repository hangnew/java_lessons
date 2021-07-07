package 그래픽문제;

public class 이차원배열2 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		int[][] arrList = new int[3][]; // 2d 배열에서 각 행마다 열이 다르면 [열] 대괄호를 비워둔다
		arrList[0] = arr1;
		arrList[1] = arr2;
		arrList[2] = arr3;
		
//			0	1	2	3	4
//		0	0	0	0
//		1	0	0	0	0	0
//		2	0	0	0	0
		
		arrList[1][1] = 1;
		arrList[1][2] = 1;
		arrList[2][2] = 1;
		
		System.out.println(arrList.length); // 2차원 배열의 행 개수
		System.out.println(arrList[0].length); // 첫번째 행의 길이
		System.out.println(arrList[1].length); // 두번째 행의 길이
		System.out.println(arrList[2].length); // 세번째 행의 길이

		
	}

}
