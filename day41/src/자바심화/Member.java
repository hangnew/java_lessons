package 자바심화;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Member {

	public static void main(String[] args) {

		// HashMap과 DTO 클래스를 이용하여 프로그램을 만들자
		// 회원가입, 정보수정, 회원탈퇴 기능 구현
		Scanner sc = new Scanner(System.in);
		HashMap<String, DTO> list = new HashMap<String, DTO>();
		while (true) {
			System.out.println("-----------");
			System.out.println("1. 회원가입");
			System.out.println("2. 정보수정");
			System.out.println("3. 아이디 찾기");
			System.out.println("4. 회원탈퇴");
			System.out.println("9. 종료");
			System.out.println("-----------");
			System.out.print("메뉴를 선택하세요>> ");
			int choice = sc.nextInt();
			if (choice == 9) {
				System.out.println("종료합니다.");
				break;
			} else if (choice == 1) {
				DTO dto = new DTO();
				System.out.print("아이디: ");
				dto.setId(sc.next());
				System.out.print("비밀번호: ");
				dto.setPw(sc.next());
				System.out.print("이름: ");
				dto.setName(sc.next());
				System.out.print("전화번호: ");
				dto.setTel(sc.next());
				list.put(dto.getId(), dto);
				System.out.println("회원가입이 완료되었습니다.");
			} else if (choice == 2) {
				DTO dto = new DTO();
				System.out.print("아이디: ");
				String id = sc.next();
				if (list.containsKey(id)) {
					dto = list.get(id);
					System.out.print("비밀번호: ");
					if (dto.getPw().equals(sc.next())) {
						System.out.println(dto);
						System.out.print("1)비밀번호 변경 2) 이름 변경 3) 전화번호 변경 >> ");
						int ctgry = sc.nextInt();
						if (ctgry == 1) {
							System.out.print("새로운 비밀번호를 입력하세요>> ");
							dto.setPw(sc.next());
							System.out.println("비밀번호가 변경되었습니다.");
						} else if (ctgry == 2) {
							System.out.print("새로운 이름을 입력하세요>> ");
							dto.setName(sc.next());
							System.out.println("이름이 변경되었습니다.");
						} else if (ctgry == 3) {
							System.out.print("새로운 전화번호를 입력하세요>> ");
							dto.setTel(sc.next());
							System.out.println("전화번호가 변경되었습니다.");
						} else {
							System.out.println("번호를 잘못 입력하였습니다. 다시 시도해주세요.");
						}
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				} else {
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}
			} else if (choice == 3) {
				Set<Entry<String, DTO>> entrySet = list.entrySet();
				System.out.print("가입된 이름을 입력하세요>> ");
				String name = sc.next();
				String id = null;
				for (Entry<String, DTO> entry : entrySet) {
					if (entry.getValue().getName().equals(name)) {
						id = entry.getKey();
					}
				}
				if (id == null) {
					System.out.println("존재하지 않는 회원 정보입니다.");
				} else {
					System.out.println("아이디는 " + id + " 입니다.");
				}
			} else if (choice == 4) {
				DTO dto = new DTO();
				System.out.print("아이디: ");
				String id = sc.next();
				if (list.containsKey(id)) {
					dto = list.get(id);
					System.out.print("비밀번호: ");
					if (dto.getPw().equals(sc.next())) {
						System.out.print("탈퇴하려면 y를 입력해주세요 (돌아가려면 아무 키 입력)>> ");
						if (sc.next().equals("y")) {
							list.remove(dto.getId());
							System.out.println("탈퇴완료");
						}
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				} else {
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}
			} else {
				System.out.println("번호를 잘못 입력하였습니다. 다시 시도해주세요.");
			}
		} // while
		sc.close();
	} // main

}
