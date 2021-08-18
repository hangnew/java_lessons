package 자바심화;

import java.util.HashMap;
import java.util.Scanner;

public class 친구추가문제2 {
	
	public static void main(String[] args) {
		HashMap<String, String> list = new HashMap<String, String>();
		list.put("홍길동", "010-0000-0000");
		list.put("김길동", "010-1111-1111");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 전화번호 변경");
			System.out.println("9. 종료");
			System.out.println("----------------");
			System.out.print("메뉴를 선택하세요 >> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("종료합니다.");
				break;
			} else if (choice == 1) {
				System.out.println("친구 목록: " + list);
			} else if (choice == 2) {
				System.out.print("추가할 친구의 이름을 입력하세요>> ");
				String name = sc.next();
				System.out.print("친구의 전화번호를 입력하세요>> ");
				String tel = sc.next();
				int size1 = list.size();
				list.put(name, tel);
				int size2 = list.size();
				if (size1 < size2) {
					System.out.println("친구가 추가되었습니다.");
				} else {
					System.out.println("실패하였습니다. 다시 한 번 시도해보세요.");
				}
			} else if (choice == 3) {
				System.out.print("삭제할 친구의 이름을 입력하세요>> ");
				String name = sc.next();
				if (list.containsKey(name)) {
					list.remove(name);
					System.out.println("친구가 삭제되었습니다.");
				} else {
					System.out.println("해당 이름이 목록에 없습니다. 다시 확인해주세요.");
				}
			} else if (choice == 4) {
				System.out.print("전화 번호를 변경할 친구를 입력하세요>> ");
				String name = sc.next();
				if (list.containsKey(name)) {
					System.out.print("새로운 번호를 입력하세요>> ");
					list.replace(name, sc.next());
					System.out.println("친구의 전화번호가 변경되었습니다.");
				} else {
					System.out.println("해당 이름이 목록에 없습니다. 다시 확인해주세요.");
				}
			} else {
				System.out.println("해당 숫자가 없습니다. 다시 입력하세요.");
			}
		} // while
		sc.close();
	} // main
	
}
