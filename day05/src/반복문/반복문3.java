package 반복문;

import javax.swing.JOptionPane;

public class 반복문3 {

	public static void main(String[] args) {

//		시작 입력값 : 3
//		종료 입력값 : 10
//		3, 4, 5, 6, 7, 8, 9, 10까지 출력

		String i1 = JOptionPane.showInputDialog("시작값을 입력해주세요.");
		int i2 = Integer.parseInt(i1); // 시작값

		String e1 = JOptionPane.showInputDialog("종료값을 입력해주세요.");
		int e2 = Integer.parseInt(e1); // 종료값

		while (i2 <= e2) { // 조건
			System.out.println(i2);
			i2++; // 증감
		}

	} // main

} // class
