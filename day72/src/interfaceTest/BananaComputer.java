package interfaceTest;

public class BananaComputer implements ComputerInterface {

	@Override
	public void startUp() {
		System.out.println("Banana On");
	}

	@Override
	public void shutDown() {
		System.out.println("Banana Off");
	}

	@Override
	public void freeze() {
		System.out.println("Frozen banana");
	}

}
