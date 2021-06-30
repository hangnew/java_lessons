package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표1 {

	public static void main(String[] args) {

		int yes = 0;
		int no = 0;
//		데이터형이 같을 때 ,를 이용하여 한 줄에 입력가능 : int yes = 0, no = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("배가 고픈가요? (배고프면: 1, 안고프면: 2)");
			switch (reply) {
			case "1": // String이기 때문에 ""를 붙인다
				yes++;
				break;
			case "2":
				no++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "1, 2 중 선택해주세요.");
				i--; // default가 실행되면 i(반복횟수)를 1 차감
				break;
			}
		} // for
		System.out.println("배고픈 사람: " + yes + "명");
		System.out.println("안고픈 사람: " + no + "명");

	} // main

} // class
