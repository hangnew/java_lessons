package 배열생성;

public class 아는목록배열 {

	public static void main(String[] args) {
		
//		배열을 만들 때 
//		처음부터 값들을 알고 있는 경우와
//		모르고 있는 경우에는 다르게 써야 한다
		
		String[] names = {"홍길동", "송길동", "정길동", "박길동", "장길동"};
//		for (int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		for (String s : names) {
			System.out.println(s);
		}
		
		int[] ages = {100, 88, 55, 10, 4};
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
		for (int x : ages) {
			System.out.println(x);
		}
		
		
		double[] eyes = {2.0, 1.5, 1.2, 0.8, 1.0};
//		for (int i = 0; i < eyes.length; i++) {
//			System.out.println(eyes[i]);
//		}
		for (double d : eyes) {
			System.out.println(d);
		}
		
		char[] gender = {'남', '여', '남', '여', '남'};
//		for (int i = 0; i < gender.length; i++) {
//			System.out.println(gender[i]);
//		}
		for (char c : gender) {
			System.out.println(c);
		}
		
		boolean[] food = {true, false, true, true, false};
//		for (int i = 0; i < food.length; i++) {
//			System.out.println(food[i]);
//		}
		for (boolean b : food) {
			System.out.println(b);
		}
		
	}

}
