package 순차문;

import javax.swing.JOptionPane;

public class 순차문4 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");

		String id2 = "root"; // 회원가입시 입력한 id
		String pw2 = "pass"; // 회원가입시 입력한 pw

		// 기본형 데이터가 아니면 연산자로 비교할 수 없다
		// String끼리의 비교는 대상.equals(대상2) 사용

		System.out.println(id.equals(id2)); // id(String)와 id2(String) 비교
		System.out.println(pw.equals(pw2)); // pw(String)와 pw2(String) 비교
		System.out.println(id.equals(id2) && pw.equals(pw2)); // (id vs id2) 와 (pw vs pw2)
//																 두 조건이 다 만족할 때 결과 : true

		// and와 or 연산자의 경우, 중요한 조건을 첫 번째에 넣는다.
		// 첫 번째 비교에서 false가 나오면, 이후의 비교 연산자는 실행되지 않는다.
		
		if (id.equals(id2) && pw.equals(pw2)) { // 조건이 true라면
			JOptionPane.showMessageDialog(null, "로그인 성공"); // 메세지 출력
		} else { // 조건이 false라면
			JOptionPane.showMessageDialog(null, "로그인 실패"); // 메세지 출력

		}
	} // main

} // class
