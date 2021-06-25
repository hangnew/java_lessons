package 순차문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 순차문의 순서: 입력 - 처리 - 출력

		// 1. 입력
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇도인가요?");

		// 2. 처리
		int yes = 28; // 어제 온도
//		int temp2 = Integer.parseInt(temp); // Integer.parseInt(대상) : 대상을 int로 형변환
		double temp3 = Double.parseDouble(temp); // Double.parseDouble(대상) : 대상을 double로 형변환

//		int result = yes - temp2;
		double result2 = yes - temp3;

		// 3. 출력
//		System.out.println(result + "도 차이가 나요.");
		System.out.println(result2 + "도 차이가 나요.");

	} // main

} // class
