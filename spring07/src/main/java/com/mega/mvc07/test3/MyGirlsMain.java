package com.mega.mvc07.test3;

public class MyGirlsMain {

	public static void main(String[] args) {
		Girl girl1 = new Girl("길순", 13);
		Girl girl2 = new Girl("길숙", 10);
		System.out.println(girl1);
		System.out.println(girl2);
		System.out.println("age sum: " + Girl.ageSum + "세");
		System.out.println("count: " + Girl.count + "명");
		System.out.println("평균 나이: " + (Girl.ageSum / Girl.count) + "세");
	}

}
