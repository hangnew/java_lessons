package com.mega.mvc08.casting;

public class Primitive {

	public static void main(String[] args) {
		
		byte b1 = 100; // -128 ~ 127
		int i1 = 200;
		i1 = b1; // byte가 int로 자동 캐스팅
		b1 = (byte)i1; // int가 byte로 강제 캐스팅
		
		int i2 = 3000;
		byte b2 = (byte)i2;
		System.out.println(b2);
		
	}

}
