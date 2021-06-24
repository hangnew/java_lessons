package 조건문;

import javax.swing.JOptionPane;

public class 조건문1 {

	public static void main(String[] args) {

		int temp = 25;

		if (temp > 27) { // if(조건) {조건이 true일 때 실행시키고 싶은 코드
			JOptionPane.showMessageDialog(null, "에어컨 ON");
		} else { // } else(조건필요없음) {조건이 false일 때 실행시키고 싶은 코드}
			JOptionPane.showMessageDialog(null, "에어컨 OFF");
		}

	}

}
