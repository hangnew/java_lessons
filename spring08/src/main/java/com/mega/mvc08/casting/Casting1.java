package com.mega.mvc08.casting;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import com.mega.mvc08.MemberDTO;

public class Casting1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		// 자동 캐스팅 (=업캐스팅)
		list.add("홍");
		list.add(new Date());
		list.add(new Random());
		list.add(100);
		list.add(11.11);
		
		MemberDTO dto = new MemberDTO();
		dto.setId("홍");
		
		// 업캐스팅되어 들어간 객체를 다시 다운캐스팅해주어야 한다.
		list.add(dto);
		MemberDTO dto2 = (MemberDTO)list.get(5);
		System.out.println(dto2.getId());
		
		// 100을 꺼내 1을 더해 보자
		int i = (Integer)list.get(3) + 1;
		int i2 = (int)list.get(3) + 1;
		System.out.println(i);
		System.out.println(i2);
		
		// 11.11을 꺼내 100을 더해 보자
		double d = (Double)list.get(4) + 100;
		double d2 = (double)list.get(4) + 100;
		System.out.println(d);
		System.out.println(d2);
		
	}

}
