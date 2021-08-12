package 상속;

public class GiantBabyUser {

	public static void main(String[] args) {
		GiantBaby baby1 = new GiantBaby();
		baby1.age = 1;
		baby1.name = "자이언트베이비 주니어 3세";
		baby1.cry = true;
		baby1.weight = 1500;
		baby1.think();
		baby1.tool();
		baby1.crawl();
		baby1.bite();
		
		System.out.println(baby1);
	}

}
