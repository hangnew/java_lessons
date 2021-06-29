package 문제풀이;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {

//		사원번호 입력 : 기103
		String id = JOptionPane.showInputDialog("사원 번호 입력");
		char team = id.charAt(0);
		char level = id.charAt(1);

		switch (team) {
		case '기':
			System.out.println("기획부");
			break;
		case '인':
			System.out.println("인사부");
			break;
		case '개':
			System.out.println("개부");
			break;
		default:
			System.out.println("해당 부서 없음");
			break;
		}

		switch (level) {
		case '1':
		case '2':
			System.out.println("임원");
			break;
		case '3':
			System.out.println("부장");
			break;
		case '4':
		case '5':
			System.out.println("평사원");
			break;
		default:
			System.out.println("해당 직급 없음");
			break;
		}

	}

}
