package 문제풀이;

public class 문제풀이2 {
	public static void main(String[] args) {

//		내 현재 나이를 변수에 저장 100
//		내 내년 나이를 계산하고 출력

		int age = 100;
		int ageNext = age + 1;

		System.out.println("내 내년 나이는 " + ageNext + "살");

//		내 내년 나이가 100세를 넘으면 "이제부터 시작"
//		아니면 "아직 젊어요"

		if (ageNext > 100) {
			System.out.println("이제부터 시작");
		} else {
			System.out.println("아직 젊어요.");
		}

	}
}
