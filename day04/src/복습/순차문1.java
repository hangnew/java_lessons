package 복습;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 순차문의 순서: 입력 - 처리 - 출력

		// 1. 입력
//		import 실패시 : 밑줄 블록 클릭하고 fn + f2, 마지막 글자를 지우고 다시 자동완성
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String temp = JOptionPane.showInputDialog("오늘은 몇도인가요?");
		// 모든 input 입력데이터는 String이어서 산술연산이 불가능하다
		// 숫자로 쓸지, 스트링 그대로 사용할지는 프로그래머가 결정한다
		// 숫자로 써야한다면 숫자로 변환하는 처리를 해주어야 한다

		// 2. 처리, "금요일은 27.5도"
		String result = today + "은 " + temp + "도";

		// 3. 출력
		System.out.println(result);
		
	} // main

} // class
