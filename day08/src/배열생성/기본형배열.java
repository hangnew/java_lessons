package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {
		
//		byte형(2byte) 숫자 범위 : -128 ~ 128
//		cpu가 처리할 때는 4byte로 맞춰 처리한다 = "int로 padding한다"
		
//		int[] 변수명 : int로 만들어진 배열을 가리키는 주소가 변수명에 들어간다
		int[] s = new int[10];
		double[] s2 = new double[5];
		String[] s3 = new String[100];
		
//		배열은 자동초기화 시켜준다.
		System.out.println(s); // int 배열 s의 주소 출력
		System.out.println(s[0]);
		System.out.println(s2); // double 배열 s2의 주소 출력
		System.out.println(s3); // char 배열 s3의 주소 출력
		System.out.println(s3[0]);
	}

}
