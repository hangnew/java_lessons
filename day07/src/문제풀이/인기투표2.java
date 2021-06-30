package 문제풀이;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {

		int iu = 0;
		int yoo = 0;
		int bts = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("인기 투표 (1:아이유 2:유재석 3:방탄소년단)");
			switch (reply) {
			case "1":
				iu++;
				break;
			case "2":
				yoo++;
				break;
			case "3":
				bts++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1,2,3 중 하나만 입력하세요");
				i--;
				break;
			} // switch
		} // for
		System.out.println("아이유: " + iu + "표");
		System.out.println("유재석: " + yoo + "표");
		System.out.println("방탄소년단: " + bts + "표");
	} // main

} // class
