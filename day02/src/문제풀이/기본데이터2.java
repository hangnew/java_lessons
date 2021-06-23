package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		//예약어는 저장공간의 공간을 쓸 수 없다. (eg.class/char/int 등)
		//선언
		char color; // 2Byte
		int num;	// 계산이 필요없는 숫자(예:전화번호)는 보통 int를 쓰지 않는다.
		double avgAge;	// avgAge : 낙타표기법 Camel case (java 권장)
						// avg_age : 뱀표기법 Snake case (python 권장)
		
		//대입
		color = 'r';
		num = 709;
		avgAge = 27.5;

		//RAM에 만들어지는 저장 공간을 변수라고 부른다.
		//변수(variables) : 저장공간에 들어갈 값은 변할 수 있다.
		
		//출력
		System.out.println("색은 " + color);
		System.out.println("방 번호는 " + num + "호");
		System.out.println("평균 나이는 " + avgAge);
		// 한줄 복사하기 : alt + ctrl + 화살표아래
		// 한줄 이동하기 : alt + 이동방향화살표
		// 한줄 삭제하기 : ctrl + d
	}

}
