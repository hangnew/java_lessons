package com.mega.mvc07.test;

public class SingleUser2 {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			SingleObject2 single = SingleObject2.getInstance();
		}
		System.out.println(SingleObject2.count + "개");
	}

}
