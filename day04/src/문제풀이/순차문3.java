package 문제풀이;

import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {

//		숫자 1 입력 : 333
//		숫자 2 입력 : 222	
		String num1 = JOptionPane.showInputDialog("첫번째 숫자 입력");
		String num2 = JOptionPane.showInputDialog("두번째 숫자 입력");

//		두 숫자를 정수로 변환해서 
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);

//		1) 더하기의 결과 출력
//		2) 빼기의 결과 출력
		System.out.println("더하기의 결과: " + (num3 + num4));
		System.out.println("빼기의 결과: " + (num3 - num4));

	}

}
