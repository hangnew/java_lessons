package 컬렉션;

import java.util.LinkedList;

public class 우유냉장고 {

	public static void main(String[] args) {
//		냉장고에 어제, 오늘 우유를 사다 놓았음
//		어제 우유이름은 상한우유
//		오늘 우유이름은 싱싱우유
//		어제의 우유를 먼저 먹음
//		현재 남은 우유 이름을 프린트
		LinkedList fridge = new LinkedList();
		fridge.add("상한우유");
		fridge.add("싱싱우유");
		System.out.println(fridge);
		fridge.remove();
		System.out.println(fridge);
	}

}
