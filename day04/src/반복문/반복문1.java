package 반복문;

import javax.swing.JOptionPane;

public class 반복문1 {

	public static void main(String[] args) {

		// 반복이 무한한 경우 : while (무한루프)
//							while문도 조건이 맞다면 유한하게 만들 수 있다
		// 반복이 유한한 경우 : for
//							for문도 조건이 맞다면 무한하게 만들 수 있다
		
		while (true) {
			System.out.println("나는 계속 돌아요.");
			String q = JOptionPane.showInputDialog("x 입력하면 중단");
			if (q.equals("x")) {
				break;		// 반복 종료
//				system.exit(0); 프로그램 종료
			}
		}
		
	}

}
