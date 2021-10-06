package interfaceTest;

public class Phone implements PhoneInterface {

	@Override
	public void ring(int number) {
		System.out.println("ring my bell");
	}

	@Override
	public String msg(String sender) {
		String message = "message from " + sender;
		return message;
	}

	@Override
	public void alarm(int time) {
		System.out.println("wake me up at " + time);
	}

}
