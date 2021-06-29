package 복습;

import javax.swing.JOptionPane;

public class 예제 {

	public static void main(String[] args) {

		String num = JOptionPane.showInputDialog("몇 번째 자음이 궁금한가요?");
		int num2 = Integer.parseInt(num) - 1;

		String kor = "가나다라마바사아자차카타파하";

		if (num2 > 0 && num2 < 15) {
			char kor2 = kor.charAt(num2);
			System.out.println(kor2);
		} else {
			System.out.println("1~14 사이의 숫자를 입력하세요.");
		}

	}

}
