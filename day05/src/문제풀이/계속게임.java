package 문제풀이;

import javax.swing.JOptionPane;

public class 계속게임 {

	public static void main(String[] args) {
		while (true) { // 무한반복
//		게임을 계속하시겠습니까? (0 계속, 1 종료)
			String y = JOptionPane.showInputDialog("게임을 계속 하시겠습니까? 0:계속, 1:종료");
//			사용자에게 0 혹은 1 입력값을 받아 String타입의 y 변수에 저장
			if (y.equals("0")) { // 입력값이 "0"과 같다면
//		첫번째 사람 숫자를 입력
				String n1 = JOptionPane.showInputDialog("첫번째 숫자를 입력하세요."); // 입력값을 String타입 n1로 저장
				int n2 = Integer.parseInt(n1); // String타입 n1을 정수로 변환하여 n2로 저장
//		두번째 사람 숫자를 입력
				String n3 = JOptionPane.showInputDialog("두번째 숫자를 입력하세요."); // 입력값을 String타입 n3로 저장
				int n4 = Integer.parseInt(n3); // String타입 n3을 정수로 변환하여 n4로 저장
//		더 큰 숫자를 낸 사람이 승리
				if (n2 > n4) { // n2가 n4보다 크다면
					JOptionPane.showMessageDialog(null, "첫번째 사람 승!"); // 출력
				} else if (n2 < n4) { // n2가 n4보다 작다면
					JOptionPane.showMessageDialog(null, "두번째 사람 승!"); // 출력
				} else { // 아무 조건에도 맞지 않다면(= n2와 n4가 같다면)
					JOptionPane.showMessageDialog(null, "무승부!"); // 출력
				}
			} else { // 입력값이 "0"과 같지 않다면 (제일 처음 if 조건과 비교하여 false일시)
				System.exit(0); // 프로그램 종료
			} // if
		} // while
	} // main
} // class
