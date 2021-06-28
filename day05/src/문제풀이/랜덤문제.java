package 문제풀이;

import java.util.Random;

public class 랜덤문제 {

	public static void main(String[] args) {

//		랜덤한 숫자를 2개 발생시켜서
		Random r = new Random(); // cpu가 Random 부품을 벽돌처럼 사용하기 위해서 RAM 속에 새롭게 r에 복사
//									() 괄호 안에 seed 숫자를 넣을시 랜덤 숫자가 고정된다
		int num1 = r.nextInt(50); // num1이라는 이름의 int 변수에 r 벽돌틀을 이용해 임의의 숫자 생성 (바운더리 0~50)
		int num2 = r.nextInt(50); // num2 int 변수

//		첫번째 랜덤한 숫자가 더 크면 첫번째 숫자가 더 커요
//		두번째 			더 크면 두번째 숫자가 더 커요
		if (num1 == num2) { // 조건1 : num1과 num2가 같다면
			System.out.println("첫번째 숫자: " + num1); // 출력
			System.out.println("두번째 숫자: " + num2); // 출력
			System.out.println("숫자가 같아요."); // 출력
		} else if (num1 > num2) { // 조건2 : 윗조건에는 false지만, num1가 num2보다 크다면
			System.out.println("첫번째 숫자: " + num1); // 출력
			System.out.println("두번째 숫자: " + num2); // 출력
			System.out.println("첫번째 숫자가 더 커요."); // 출력
		} else { // 위 두 조건에 모두 false일 때
			System.out.println("첫번째 숫자: " + num1); // 출력
			System.out.println("두번째 숫자: " + num2); // 출력
			System.out.println("두번째 숫자가 더 커요."); // 출력
		}
	}

}
