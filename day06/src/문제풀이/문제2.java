package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

// 자동 import : command + shift + o

public class 문제2 {

	public static void main(String[] args) {

		Date d = new Date();

		String age = JOptionPane.showInputDialog("나이 입력");
		int age2 = Integer.parseInt(age) - 1; // 만나이
		int year = d.getYear() + 1900; // 올해

		String birth = JOptionPane.showInputDialog("태어난 시각 입력 (예: 9, 17)");
		int time = Integer.parseInt(birth);
		
		System.out.println("태어난 연도는 " + (year - age2) + "년"); // 올해 - 만나이 = 태어난 연도

		if (time < 6) {
			System.out.println("새벽에 태어나셨군요");
		} else if (time < 12) {
			System.out.println("오전에 태어나셨군요");
		} else if (time < 18) {
			System.out.println("오후에 태어나셨군요");
		} else {
			System.out.println("밤에 태어나셨군요");
		}
	}

}
