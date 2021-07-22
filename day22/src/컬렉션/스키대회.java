package 컬렉션;

import java.util.ArrayList;

public class 스키대회 {

	public static void main(String[] args) {

		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		
		for (int i = 0; i < ski.size(); i++) {
			System.out.print((i + 1) + "등: " + ski.get(i) + " ");
		} // 출력for
		System.out.println();
		
		// 2등이 반칙하여 탈락
		ski.remove(1);
		
		for (int i = 0; i < ski.size(); i++) {
			System.out.print((i + 1) + "등: " + ski.get(i) + " ");
		} // 출력for
	}

}
