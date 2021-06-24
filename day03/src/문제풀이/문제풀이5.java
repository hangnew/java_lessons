package 문제풀이;

public class 문제풀이5 {

	public static void main(String[] args) {
		// 국어점수 75, 수학점수 50을 변수에 저장
//		국어 점수와 수학점수의 총합을 구해서 프린트
//		평균을 구해서 프린트

		int korean = 75;
		int math = 50;
		int sum = korean + math;
		double avg = (double) sum / 2;

		System.out.println("평균 점수: " + avg + "점");

	}

}
