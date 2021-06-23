package 연산자;

public class MyInfo {

	public static void main(String[] args) {
		// 나에 대한 정보
		// 이름, 나이, 몸무게, 성별, 점심먹었나요?
		String name = "홍길동";			// 문자열 String
		int age = 100;
		double weight = 99.9;
		char gender = 'c';
		boolean food = true; //false

		System.out.println(name);
		System.out.println(weight);
		System.out.println(age + 1);
		
		weight = weight - 10;
		System.out.println(weight);
	}

}
