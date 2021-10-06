package interfaceTest;

public class AppleComputer implements ComputerInterface {

	@Override
	public void startUp() {
		System.out.println("Apple Computer On");
	}

	@Override
	public void shutDown() {
		System.out.println("Apple Computer Off");
	}

	@Override
	public void freeze() {
		System.out.println("Apple Computer lagging");
	}

}
