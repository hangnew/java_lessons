package com.mega.mvc07.test;

public class SingleObject2 {

	static int count;
	static SingleObject2 object;
	
	private SingleObject2() {
		System.out.println("new SingleObject");
		count++;
	}
	
	public static SingleObject2 getInstance() {
		if (object == null) {
			object = new SingleObject2();
		}
		return object;
	}
	
}
