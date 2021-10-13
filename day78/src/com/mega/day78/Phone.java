package com.mega.day78;

public interface Phone {
	
	// 상수 사용 가능
	public final String COMPANY = "mega";
	
	// public abstract 생략 가능
	void internet();
	void call();
	void text();
	void kakao();
}
