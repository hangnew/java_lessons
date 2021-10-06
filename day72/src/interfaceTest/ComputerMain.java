package interfaceTest;

public class ComputerMain {

	public static void main(String[] args) {
		AppleComputer c1 = new AppleComputer();
		c1.startUp();
		c1.shutDown();
		c1.freeze();
		
		BananaComputer c2 = new BananaComputer();
		c2.startUp();
		c2.shutDown();
		c2.freeze();
	}

}
