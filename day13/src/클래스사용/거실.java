package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.color = "블랙";
		phone.power = true;
		phone.ring();
		phone.vibe();
		System.out.println("색상: " + phone.color);
		System.out.println("전원: " + phone.power);
		System.out.println();

		Dog dog = new Dog();
		dog.name = "멍멍이";
		dog.age = 2;
		dog.bark();
		dog.wag();
		System.out.println(dog.name + " 나이는 " + dog.age + "살");

	}

}
