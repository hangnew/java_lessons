package com.mega.mvc08.casting;

import com.mega.mvc08.exercises.Pen;
import com.mega.mvc08.exercises.Stationery;

public class Derived {

	public static void main(String[] args) {
		
		Stationery p = new Stationery();
		Pen b = new Pen();
		
		p = b;
		b = (Pen)p;
		
		
	}

}
