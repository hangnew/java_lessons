package 복습.순차문;

import javax.swing.JOptionPane;

public class 입력처리출력 {

	public static void main(String[] args) { // main 쓰고 자동완성으로도 가능

		// 1. 입력
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		String when = JOptionPane.showInputDialog("언제 하시나요?");
		String time = JOptionPane.showInputDialog("몇 시간이나 하시나요?");

		// 2. 처리
		String result = when + "에 " + hobby + "을 하시는 군요.";
		int time2 = Integer.parseInt(time);
		if (time2 >= 3) {
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요.");
		} else {
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요.");
		}

		// 3. 출력
		JOptionPane.showMessageDialog(null, result);

	}

}
