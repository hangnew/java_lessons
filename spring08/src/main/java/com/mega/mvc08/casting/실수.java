package com.mega.mvc08.casting;

public class 실수 {

	public static void main(String[] args) {
		
		double pie = 3.141592;
		System.out.println(Math.abs(pie)); // 절대값
		System.out.println(Math.round(pie));
		System.out.println(Math.floor(pie));
		System.out.println(Math.ceil(pie));
		System.out.println(String.format("%.2f", pie));
		System.out.printf("나이: %10d살\n", 20);
		System.out.printf("시력: %.2f\n", 0.195);
		System.out.printf("이름: %s\n", "홍길동");
	}

}
