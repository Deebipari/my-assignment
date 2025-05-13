package week3.day2;

public class LoginData1 extends TestData {

	public void enterUsername()
	{
		System.out.println("logindata1 username");
	}
	public void enterPassword()
	{
		System.out.println("logindata1 password");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginData1 obj = new LoginData1();
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();
	}

}
