package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; // tag가 담긴 ArrayList

public class 네이버메인크롤링테스트 {

	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
			System.out.println("1. 사이트 연결 성공");
			System.out.println("2. 소스 받아 오기 성공");
//			System.out.println(doc);
			Elements list = doc.select("a.nav");
//			System.out.println(list);
			System.out.println(list.size());
			for (Element tag : list) {
				System.out.println(tag.text());
			}
			Element aTag0 = list.get(0);
			System.out.println(aTag0);
			Elements list2 = aTag0.select("i");
			System.out.println(list2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
