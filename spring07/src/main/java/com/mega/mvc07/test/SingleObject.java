package com.mega.mvc07.test;

public class SingleObject {

	static int count;
	
	public SingleObject() {
		System.out.println("new SingleObject");
		count++;
	}
	
}
