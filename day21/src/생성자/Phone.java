package 생성자;

public class Phone {
	String company;
	String number;
	String whose;
//
//	public Phone(String company, String number, String whose) {
////		this는 현재 클래스를 나타낸다.
////		즉, this.company의 의미는 클래스 바로 아래에 있는 company변수 (ln 4)
//		this.company = company;
//		this.number = number;
//		this.whose = whose;
//	}
//
//	public String toString() {
//		return company + ", " + number + ", " + whose;
//	}
	public Phone(String company, String number, String whose) {
		this.company = company;
		this.number = number;
		this.whose = whose;
	}
	
	public String toString() {
		return "Phone [company=" + company + ", number=" + number + ", whose=" + whose + "]";
	}
	
	
}
