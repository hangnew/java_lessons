package 상속;

public class GiantBaby extends Baby{
	int weight;
	
	public void bite() {
		System.out.println("깨물어요");
	}

	@Override
	public String toString() {
		return "GiantBaby [weight=" + weight + ", cry=" + cry + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
