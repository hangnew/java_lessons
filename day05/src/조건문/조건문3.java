package 조건문;

import javax.swing.JOptionPane;

public class 조건문3 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			// 1.입력
			// 입력을 받아서 처리해보세요.
			String jumsu1 = JOptionPane.showInputDialog("당신의 점수는?");
			int jumsu2 = Integer.parseInt(jumsu1);

			// 2.처리
			String result = null; // 선언 : RAM에 공간이 할당
//		처음에 공간을 할당할 때, 쓰레기값이 들어있는 공간이 할당된다.
//		쓰레기값 : 프린트/연산 등 처리 불가
//		변수(공간)를 깨끗하게 비우는 작업이 처음에 필요하다
//		= "변수의 초기화"

			if (jumsu2 >= 90) {
				result = "A학점";
			} else if (jumsu2 >= 80) {
				result = "B학점";
			} else if (jumsu2 >= 70) {
				result = "C학점";
			} else {
				result = "F학점";
			}

			// 3.출력
			System.out.println("당신의 학점은 " + result);

		} // for
	} // main

} // class
