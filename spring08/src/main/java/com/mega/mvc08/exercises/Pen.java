package com.mega.mvc08.exercises;

public class Pen extends Stationery {
	
	int thickness;
	
	public void write() {
		System.out.println("글을 쓰다");
	}

	@Override
	public String toString() {
		return "Pen 두께:" + thickness + ", 가격: " + price + ", 회사: " + manufacturer;
	}
	
}
