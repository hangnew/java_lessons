package 문제풀이;

import java.util.Scanner;

public class 스트링3개입력 {

	public static void main(String[] args) {
		
		
		String[] subject = new String[3]; // {null, null, null}
//		String 변수는 원래 주소가 들어가 있지만,
//		내부적으로 그 주소가 가리키는 char들을 프린트되도록 조정이 되어있는 상태
//		subject[0] = 주소
		
		Scanner sc = new Scanner(System.in);
				
		for (int i = 0; i < subject.length; i++) {
			System.out.print("과목 입력>> ");
			subject[i] = sc.next();
		}
		System.out.println(subject[0] + "보다는 " + subject[1]);
//		String[] subject = { "자바", "스프링", "JSP" };
		sc.close();
	}

}
