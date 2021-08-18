package 자바심화;

import java.util.ArrayList;
import java.util.Scanner;

public class 친구추가문제 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 이름 변경");
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
				int size1 = list.size();
				list.add(sc.next());
				int size2 = list.size();
				if (size1 < size2) {
					System.out.println("친구가 추가되었습니다.");
				} else {
					System.out.println("실패하였습니다. 다시 한 번 시도해보세요.");
				}
			} else if (choice == 3) {
				System.out.print("삭제할 친구의 이름을 입력하세요>> ");
				int ind = list.indexOf(sc.next());
				if (ind != -1) {
					list.remove(ind);
					System.out.println("친구가 삭제되었습니다.");
				} else {
					System.out.println("해당 이름이 목록에 없습니다. 다시 확인해주세요.");
				}
			} else if (choice == 4) {
				System.out.print("이름을 변경할 친구를 입력하세요>> ");
				int ind = list.indexOf(sc.next());
				if (ind != -1) {
					System.out.print("변경할 이름을 입력하세요>> ");
					list.set(ind, sc.next());
					System.out.println("친구 이름이 변경되었습니다.");
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
