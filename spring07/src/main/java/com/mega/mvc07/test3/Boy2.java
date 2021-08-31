package com.mega.mvc07.test3;

public class Boy2 {
	
	static int count;
	static Boy2 object;
	
	private Boy2() {
		count++;
	}
	
	public static Boy2 getInstance() {
		if(object == null) {
			object = new Boy2();
		}
		return object;
	}
	
}
