package 배열생성;

public class 기본형배열2 {
	public static void main(String[] args) {

		int[] s = new int[10];
//		int[] : int 타입의 배열 변수 선언
//				int 배열을 가리키는 주소가 들어간다는 의미
//		s : 변수명
//			힙영역에 할당된 저장 공간의 주소가 들어간다
//		= : 변수 s에 우항을 넣는 대입연산자
//			힙영역에 할당된 저장 공간의 주소를 변수에 넣는다
//		new : 부품 복사
//			  힙영역에 지정된 타입의 크기만큼 배열을 만들어라
//		int[10] : 배열 갯수 10개
//				  배열로 연속으로 만들어질 데이터의 타입과 크기

		System.out.println(s.length);

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
			// 배열은 자동 초기화
		}
		System.out.println();

		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}

		for (int i = 0; i < s.length; i++) {
			System.out.print((s[i] + 1) + " ");
		}

	}
}
