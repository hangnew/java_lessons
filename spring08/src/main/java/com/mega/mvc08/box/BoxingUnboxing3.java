package com.mega.mvc08.box;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class BoxingUnboxing3 {

	public static void main(String[] args) {
		
		ArrayList<Serializable> list = new ArrayList<Serializable>();
		list.add("홍길동");
		list.add(new Date());
		list.add(new Random());
		list.add(1);
		
		
	}

}
