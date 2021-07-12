package 메서드반환값;

import java.util.Random;

public class 다양한리턴2 {

	public int get(int a) {
		int result = a * 2;
		return result;
	}
	
	public double get() {
		double result = 11.11;
		return result;
	}
	
	public int[] get2() {
		int[] result = {10, 20, 30, 40, 50};
		return result;
	}

	public Random get3() {
		Random r = new Random();
		return r;
	}

}
