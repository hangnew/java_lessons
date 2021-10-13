package com.mega.day78;

public abstract class ApplePhone implements MegaPhone {

	String tel = "010-1111-2222";
	
	public abstract void camera();
	
	@Override
	public void internet() {
		System.out.println("Internet");
	}

	@Override
	public void call() {
		System.out.println(tel + " calling");
	}

	@Override
	public void text() {
		System.out.println("texting");
	}

	@Override
	public void kakao() {
		System.out.println("Kakao Talk");
	}

	@Override
	public void map() {
		System.out.println("GPS Service");
	}

	@Override
	public void siri() {
		System.out.println("Siri");
	}

}
