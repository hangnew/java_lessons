package 자바기본;

import java.util.Scanner;

public class 문제01 {

	public static void main(String[] args) {
		// 문제 :
		// "아무거나"라는 대답이 나올 때까지 점심 메뉴를 물어보자.
		
		// 스캐너 객체 생성 (괄호 안에 입력스트림을 넣는다)
		Scanner sc = new Scanner(System.in);
		// 무한 반복
		while (true) {
			System.out.print("오늘 뭐 먹을래? ");
			// 스캐너.next = 입력값을 ln 스트링 변수에 넣는다.
			String ln = sc.next();
			// 사용자가 "아무거나" 라고 입력한다면
			if (ln.equals("아무거나")) {
				System.out.println("너랑 안 먹어.");
				// "너랑 안 먹어" 메시지 출력 후 반복 종료
				break;
			} else {
				// 그 외의 입력에는 메시지 출력 후 반복문을 반복한다.
				System.out.println(ln + " 말고 다른거 먹자.");
			}
		}
		// 스트림은 사용이 끝난 후 닫아야 한다.
		sc.close();
	}

}
