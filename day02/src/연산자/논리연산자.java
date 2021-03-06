package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리연산자, 조건이 여러개 있을때 판단의 기준
		// 조건이 모두 만족해야 true : and, &&
		// 조건 중 하나만 만족해도 true : or, ||
		// 조건에 해당되지 않을 때 true : not, !

		// java에서는 비교연산자로 기본데이터만 비교 가능하다.

		int id = 1111; // 회원가입id는 1111
		int pw = 2222; // 회원가입pw는 2000

		System.out.println(id == 1111);
		System.out.println(pw == 2000);
		System.out.println(id == 1111 && pw == 2000); // and연산자

		int manager1 = 5555;
		int manager2 = 4444;
		System.out.println(manager1 == 5555 || manager2 == 4000); // or연산자

		// ctrl + shift + f : 코드정리 (포맷팅)

	}

}
