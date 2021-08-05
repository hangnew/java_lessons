package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; // tag가 담긴 ArrayList

public class w3school크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공");
			System.out.println("2. 소스 받아 오기 성공");
//			System.out.println(doc);
			Elements list = doc.select("a.w3-bar-item.w3-button");
//			System.out.println(list);
			System.out.println(list.size());
			for (int i = 7; i < 17; i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
