package 생성자;

public class TV {
	String color;
	int price;
	
//	기본 생성자
//	public TV() {
//		System.out.println("객체 하나 만들어짐.");
//	}
	
	public TV(String c, int p) {
		color = c;
		price = p;
	}

	public String toString() {
		return color + ", " + price;
	}
}
