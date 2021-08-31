package com.mega.mvc07.test3;

public class Boy2Main {

	public static void main(String[] args) {
		Boy2 boy1 = Boy2.getInstance();
		Boy2 boy2 = Boy2.getInstance();
		System.out.println("객체수: " + Boy2.count);
	}

}
