package 컬렉션;

import java.util.HashSet;

public class 팀원목록 {

	public static void main(String[] args) {
//		팀을 구성하려고 합니다.
//		한 명씩만 필요하고
//		디자이너, 프로그래머, DB관리자
//		팀원 목록을 프린트
		HashSet member = new HashSet();
		member.add("디자이너");
		member.add("프로그래머");
		member.add("DB관리자");
		System.out.println(member);
	}

}
