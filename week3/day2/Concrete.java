package week3.day2;

public class Concrete implements DataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataBaseConnection obj = new Concrete();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUPdate");
	}

}
