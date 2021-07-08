package 알고리즘;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 가변적인다양한타입 {

	public static void main(String[] args) {

//		set : (=집합) 중복된 값을 허용하지 않는다
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(100);
		System.out.println(set.size());
		System.out.println(set);

//		많은 양의 데이터를 다룰 때, 가변적이고 다양한 데이터 타입인 경우 ArrayList를 사용한다
		ArrayList list = new ArrayList();

//		값을 넣을 때는 ArrayList이름 . add
		list.add(100); // int 가능
		list.add(100.33); // double 가능
		list.add(true); // boolean 가능
		list.add('a'); // char 가능
		list.add("감자"); // String 가능

		Random r = new Random();
		list.add(r); // 참조형 가능

//		값을 가져올 때는 ArrayList이름 . get
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list);

//		ArrayList의 길이는 이름 . size
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}

//		값을 지울 때 ArrayList이름 . remove(index값)
		list.remove(5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}

	}

}
