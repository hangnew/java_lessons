package 컬렉션;

import java.util.HashMap;

public class 단축키 {

	public static void main(String[] args) {
//		휴대폰 단축키 1번은 엄마, 2번은 아빠
//		3번은 친구, 4번은 동생
//		휴대폰 2번은 누구? 프린트
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		phone.put(4, "동생");
		System.out.println(phone.get(2));
	}

}
