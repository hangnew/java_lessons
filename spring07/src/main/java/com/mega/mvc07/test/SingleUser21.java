package com.mega.mvc07.test;

public class SingleUser21 {

	public static void main(String[] args) {
		SingleObject2 single = SingleObject2.getInstance();
		System.out.println(SingleObject2.count + "개");
		System.out.println(single);
	}

}
