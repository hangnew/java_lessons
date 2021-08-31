package com.mega.mvc08.exercises;

public class PenMain {

	public static void main(String[] args) {
		
		Pen pen = new Pen();
		pen.price = 1000;
		pen.manufacturer = "모나미";
		pen.thickness = 100;
		pen.buy();
		pen.write();
		System.out.println(pen);
		
	}

}
