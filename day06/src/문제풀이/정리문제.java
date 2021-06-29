package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {

		String food = "떡볶이";

		switch (food) {
		case "떡볶이": // 데이터형이 같아야 한다 (String)
			System.out.println("분식집");
			break;
		case "우동":
			System.out.println("일식집");
			break;
		case "짜장면":
			System.out.println("중국집");
			break;
		default:
			System.out.println("집에서");
			break;
		}

		String sn = "980201-1037514";
		char gender = sn.charAt(7); // (7번째 위치한 char값을 추출) = '1'

		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}

//		char는 기본형 데이터라 비교연산자 가능
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

}
