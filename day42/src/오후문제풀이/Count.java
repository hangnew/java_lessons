package 오후문제풀이;

import java.util.Random;

public class Count {
	
	public int[][] countP(int count) {
		// 랜덤 객체 생성
		Random r = new Random();
		// 주민등록번호 담아놓을 스트링 배열
		String[] ssnList = new String[count];
		// 스트링 배열에 주민번호 랜덤생성해서 넣는다
		for (int i = 0; i < ssnList.length; i++) {
			// 0~3999999 + 1000000 숫자 생성하여 주민번호인 척 하기 -> 스트링으로 형변환
			ssnList[i] = String.valueOf(r.nextInt(4000000) + 1000000);
			// System.out.println(ssnList[i]);
		} // for
		// [지역 4개][남, 여, 총합] 정수 배열
		int[][] areaGender = new int[4][2];
		for (int i = 0; i < ssnList.length; i++) {
			// ssnList 배열 중 i 번째 사람의 주민 번호
			String ssn = ssnList[i];
			// 출생지가 서울인 사람
			// ssn의 두번째 자리가 1인 사람 골라내기 
			if (ssn.charAt(1) == '1') {
				// 출생지가 서울이고 남자인 사람
				// ssn의 첫번째 자리가 1이나 3인 사람 골라내기
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGender[0][0]++;
				} else { // 출생지가 서울이고 여자인 사람
					areaGender[0][1]++;
				}
				// 출생지가 부산인 사람
			} else if (ssn.charAt(1) == '2') {
				// 출생지가 부산인 남자
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGender[1][0]++;
				} else { // 출생지가 부산이고 여자인 사람
					areaGender[1][1]++;
				}
				// 출생지가 제주인 사람
			} else if (ssn.charAt(1) == '3') {
				// 출생지가 제주인 남자
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGender[2][0]++;
				} else { // 출생지가 제주이고 여자인 사람
					areaGender[2][1]++;
				}
				// 그 외 출생지인 사람
			} else {
				// 남자
				if (ssn.charAt(0) == '1' || ssn.charAt(0) == '3') {
					areaGender[3][0]++;
				} else { // 여자
					areaGender[3][1]++;
				}
			}
		} // for
		return areaGender;
	}
}
