package 조건문;

public class 조건문1 {

	public static void main(String[] args) {

		// 1. 입력
		int jumsu = 77;

		// 2. 처리 (학점 부여)
		String result = null; // 변수의 초기화 initialize :
//								 변수를 선언할 때 초기값을 꼭 대입하자 (기본형이 아닐 경우 null)
//								 초기화가 되어있지 않으면 오류가 생겼을 때 뒤에 따라오는 코드들이 작동을 하지 않는다.

		// else if : 체에 거르는 과정
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 80) {
			result = "B학점";
		} else if (jumsu >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}

		// 3. 출력
		System.out.println(result);
	}

}
