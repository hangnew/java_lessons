package 컬렉션;

import java.util.HashMap;

public class 키값쌍컬렉션 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		dic.put("사과", "apple");
		dic.put("바나나", "banana");
		dic.put("메론", "melon");
		System.out.println(dic);
		
//		dic.clear(); // 전체값 삭제
		System.out.println(dic.size());
		
//		키를 넣어 값 찾기
		System.out.println(dic.get("사과"));
		
//		같은 키에 다른 값을 넣으면 값이 덮어 씌워진다.
		dic.put("사과", "blueapple");
		System.out.println(dic);
		
		dic.remove("메론");
		System.out.println(dic);
		
	}

}
