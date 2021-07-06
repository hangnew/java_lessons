package 문제풀이;

public class 성적깊은복사 {

	public static void main(String[] args) {

//		과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" }
//		1학기 성적 = { 44, 66, 22, 99, 100 }
		// 배열의 깊은 복사 이용
//		2학기 성적 = { 22, 66, 88, 99, 100 }

		String[] 과목 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;

//		0) 전체 1학기, 2학기 성적 프린트 
		System.out.print("1학기 성적: ");
		for (int i : term1) {
			System.out.print(i + "점 ");
		}
		System.out.print("\n2학기 성적: ");
		for (int i : term2) {
			System.out.print(i + "점 ");
		}

//		1) 1학기, 2학기 성적 중 동일한 성적 과목수
		int count1 = 0; // 동일한 성적 과목수
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count1++;
			}
		} // for
		System.out.println("\n동일한 성적 과목수: " + count1 + "개");

//		2) 1학기, 2학기 성적 중 오른 과목수
//		3) 1학기, 2학기 성적 중 오른 과목명
		int count2 = 0; // 오른 과목수
		String count3 = ""; // 오른 과목명 결합할 빈칸 스트링
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++;
				count3 = count3 + 과목[i] + " ";
			}
		} // for
		System.out.println("성적이 오른 과목수: " + count2 + "개");
		System.out.println("성적이 오른 과목명: " + count3);

	}// main

}// class
