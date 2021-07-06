package 문제풀이;

public class 성적확인문제 {

	public static void main(String[] args) {

		String[] 과목 = { "컴퓨터", "국어", "수학", "영어", "체육" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

//		1. 성적이 2학기에 향상된 과목의 수를 카운트해 보세요.
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			}
		} // for
		System.out.println("2학기에 향상된 과목: " + count1 + "개");

//		2. 성적이 1,2학기 동일한 과목의 수를 카운트해 보세요.
		int count2 = 0;
		int location = -1;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
				location = i;
			}
		} // for
		System.out.println("1,2학기 동일한 과목: " + count2 + "개");

//		3. 성적이 1,2학기 동일한 과목의 과목명을 프린트해보세요.
		String count3 = "";
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count3 = count3 + 과목[i] + " ";
				// count3이라는 String 변수 속에 ""빈칸 + 과목[i] + " "스페이스 (여기서 +는 결합연산자)
			}
		}
		if (location != -1) {
			System.out.println("1,2학기 동일한 과목명: " + 과목[location]);
		} else { 
			System.out.println("1,2학기 동일한 과목명 : 없음");
		}
		System.out.println("1,2학기 동일한 과목명: " + count3);

	}// main

}// class