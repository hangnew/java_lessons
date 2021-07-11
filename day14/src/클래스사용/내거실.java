package 클래스사용;

import 클래스생성.Puppy;
import 클래스생성.TV;

public class 내거실 {

	public static void main(String[] args) {

		TV myTv = new TV();
//		new를 하면, 멤버 변수들이 heap영역에 복사된다.
//		myTv 참조형 변수에는 멤버 변수들의 heap영역주소가 들어간다.
		myTv.ch = 7;
//		myTv의 주소가 가리키는 ch 변수에 7을 넣으라는 의미
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println("myTV의 채널은 " + myTv.ch);
		System.out.println("myTV의 볼륨은 " + myTv.vol);
		System.out.println("myTV의 전원은 " + myTv.onOff);
//		myTv.onOff = false;
		System.out.println(myTv);

		TV yourTv = new TV();
		yourTv.ch = 7;
		yourTv.vol = 9;
		yourTv.onOff = true;
		System.out.println("myTV의 채널은 " + yourTv.ch);
		System.out.println("myTV의 볼륨은 " + yourTv.vol);
		System.out.println("myTV의 전원은 " + yourTv.onOff);
		System.out.println(yourTv);

		Puppy puppy = new Puppy();
		puppy.name = "멍멍이";
		puppy.age = 1;
		puppy.weight = 2.2;
		puppy.sleep = true;
		System.out.println("강아지 이름은 " + puppy.name);
		System.out.println("강아지 나이는 " + puppy.age + "살");
		System.out.println("강아지 몸무게는 " + puppy.weight + "kg");
		System.out.println("강아지가 깨있을까요? " + puppy.sleep);
		puppy.bark();
		puppy.wag();

	}

}
