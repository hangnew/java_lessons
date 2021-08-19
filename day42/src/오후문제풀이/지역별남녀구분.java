package 오후문제풀이;

public class 지역별남녀구분 {

	public static void main(String[] args) {
		Count count = new Count();
		int[][] areaGender = count.countP(100);
		
		System.out.println("서울지역 " + (areaGender[0][0] + areaGender[0][1]) + "명 중 남자는 " + areaGender[0][0] + "명, 여자는 "
				+ areaGender[0][1] + "명입니다.");
		System.out.println("부산지역 " + (areaGender[1][0] + areaGender[1][1]) + "명 중 남자는 " + areaGender[1][0] + "명, 여자는 "
				+ areaGender[1][1] + "명입니다.");
		System.out.println("제주지역 " + (areaGender[2][0] + areaGender[2][1]) + "명 중 남자는 " + areaGender[2][0] + "명, 여자는 "
				+ areaGender[2][1] + "명입니다.");
		System.out.println("기타지역 " + (areaGender[3][0] + areaGender[3][1]) + "명 중 남자는 " + areaGender[3][0] + "명, 여자는 "
				+ areaGender[3][1] + "명입니다.");
	} // main

}
