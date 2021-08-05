package db;

import dto.게시판Bag;

public class 게시판DAO {

	public void create(게시판Bag bag) {
		System.out.println("id: " + bag.getId());
		System.out.println("제목: " + bag.getTitle());
		System.out.println("내용: " + bag.getContent());
		System.out.println("작성자: " + bag.getWriter());
	}
} // class
