package 복습;

public class 복습1 {

	public static void main(String[] args) {
		// 오늘을 나타내는 정보를 기본 데이터를 이용해서 저장하고 출력해보세요.
		
		double temp = 26.2;					// 8 bytes
		int classNo = 8;					// 4 bytes
		char day = '목';		 				// 2 bytes
		boolean food = false;				// 1 byte
		String lunch = "1층가서 생각해보자";		// 30 bytes		
		
		System.out.println("오늘 온도 : "+temp+"도");
		System.out.println("오늘 수업수 : "+classNo);
		System.out.println("오늘은 "+day+"요일");
		System.out.println("아침 먹었나요? : "+food);
		System.out.println("점심 어떻게 하지? "+lunch);

		//어제 온도와 오늘 온도가 동일한지
		System.out.println(temp == 27.5);		
		//어제 온도보다 오늘 온도가 높은지
		System.out.println(temp > 27.5);

		//오늘 온도 29.2도로 변경
		temp = 29.2;
				
		//어제 온도보다 오늘 온도가 낮은지
		System.out.println(temp < 27.5);
	}

}
