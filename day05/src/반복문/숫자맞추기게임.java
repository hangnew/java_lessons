package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		
		Random r = new Random(5);
		int target = r.nextInt(100);

		while (true) {
//			1. 입력을 받아라
			String input = JOptionPane.showInputDialog("숫자를 맞춰보세요.");
//			2. 숫자로 변환처리
			int input2 = Integer.parseInt(input);
//			3. 정답인지를 확인
//			4. 정답이면 프로그램 종료
//			   정답이 아니면 1로 돌아가기
			if (input2 == target) {
				JOptionPane.showMessageDialog(null, "정답입니다.");
				break; // while의 break
//				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "틀렸습니다.");
				if (input2 > target) {
					System.out.println("너무 큽니다.");
				} else {
					System.out.println("너무 작아요.");
				}
			}
		} // while
		System.out.println("게임이 모두 종료되었습니다.");
	}// main

}// class
