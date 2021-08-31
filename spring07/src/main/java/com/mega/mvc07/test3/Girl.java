package com.mega.mvc07.test3;

public class Girl {
	String name;
	int age;
	static int ageSum;
	static int count;

	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
		ageSum += age;
		count++;
	}

	@Override
	public String toString() {
		return "Girl 이름: " + name + ", 나이: " + age;
	}
	
}
