package com.mega.mvc08.exercises;

import java.util.ArrayList;

public class Casting {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		// int 1000 -> 오토박싱 -> Integer -> 업캐스팅 -> Object
		list.add(1000);
		// double 189.1 -> 오토박싱 -> Double -> 업캐스팅 -> Object
		list.add(189.1);
		// boolean false -> 오토박싱 -> Boolean -> 업캐스팅 -> Object
		list.add(false);
		// char '남' -> 오토박싱 -> Character -> 업캐스팅 -> Object
		list.add('남');
		
		System.out.println(list);
		
		// Object -> 다운캐스팅 -> Integer -> 오토 언박싱 -> int 1000
		System.out.println((Integer)list.get(0) + 2000);
		// Object -> 다운캐스팅 -> Double -> 오토 언박싱 -> double 189.1
		System.out.println((Double)list.get(1) + 10);
		// Object -> 다운캐스팅 -> Boolean -> 오토 언박싱 -> boolean false
		if ((Boolean)list.get(2)) {
			System.out.println("배불러요.");
		} else {
			System.out.println("배고파요.");
		}
		// Object -> 다운캐스팅 -> Character -> 오토 언박싱 -> char '남'
		if ((Character)list.get(3) == '남') {
			System.out.println("주민번호는 1, 3이에요.");
		} else {
			System.out.println("주민번호는 2, 4예요.");
		}
	}

}
