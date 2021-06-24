package 복습;

public class 산술계산심화 {

	public static void main(String[] args) {

		int x = 111;
		int y = 222;
		System.out.println("두 수의 합은 "+(x+y));
		System.out.println("두 수의 나눗셈은 "+(x/y));

		int sum = x+y;
		int avg1 = sum/2;	
		System.out.println("평균은 "+avg1);
		//java에서 정수와 정수의 계산은 무조건 정수
		//java에서 하나라도 실수면 무조건 실수의 결과
		//최초에 선언된 형태는 추후에 바꿀 수 없다. (int로 선언시, 실수로 바뀔 수 없다.)
		
		double avg2 = sum/2.0;
		System.out.println("평균은 "+avg2);
		
		int count = 2;
		avg2 = sum/(double)count; 			
		System.out.println("평균은 "+avg2);
		//강제형변환(캐스팅) : cpu가 원래의 데이터 타입을 강제로 다른 타입으로 변환한다.
	}

}
