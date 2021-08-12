package 상속;

public class Person {
	// 멤버 변수
	String name;
	int age;
	
	// 기본 생성자: 다른 생성자가 존재하지 않을 때 클래스 생성시 자동 생성
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 멤버 메서드
	public void think() {
		System.out.println("생각하다");
	}
	
	public void tool() {
		System.out.println("도구를 이용하다");
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
} // class
