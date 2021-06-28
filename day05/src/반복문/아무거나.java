package 반복문;

import java.util.Random;

public class 아무거나 {

	public static void main(String[] args) {
		// new : (벽돌처럼) RAM에 새롭게 복사해서 부품을 사용
//		Random r = new Random(); // new 자동완성!
//		JFrame f = new JFrame();
//		JButton b = new JButton();
		
		Random r = new Random(5);
		// ()안에 아무 숫자를 넣으면 random 숫자가 고정된다 : 씨앗값 (Seed)
		
		int num = r.nextInt(100); // 0부터 99까지
		System.out.println(num);
		
		//50보다 작은 임의의 수 생성
		int num2 = r.nextInt(50);
		
		//1000보다 작은 임의의 수 생성
		int num3 = r.nextInt(1000);
		
		//5~49
		int num4 = r.nextInt(45) + 5;
		
	
		
	}//main

}//class
