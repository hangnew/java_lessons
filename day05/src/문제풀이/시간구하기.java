package 문제풀이;

import java.util.Date;

public class 시간구하기 {

	public static void main(String[] args) {

		Date d = new Date();

//		시간을 구해보세요
//		10시 전이면 굿모닝
//		15시 전이면 굿애프터눈
//		20시 전이면 굿이브닝
//		나머지는 굿나잇
		int hour = d.getHours();
		if (hour < 10) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿애프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}

//		요일이 토/일이면 쉬어요
//		나머지 요일이면 달려요
		int day = d.getDay();
		if (day == 6 || day == 0) {
			System.out.println("쉬어요");
		} else {
			System.out.println("달려요");
		}

//		3~5월이면 봄
//		6~8이면 여름
//		9~11이면 가을
//		나머지면 겨울
		int month = d.getMonth() + 1;
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("봄");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("여름");
		} else if (month == 9 || month == 10 || month == 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}

	}

}
