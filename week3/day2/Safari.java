package week3.day2;

public class Safari extends Browser {
	public void readerMode()
	{
		System.out.println("ReaderMode");
		
	}
	public void fullScreenMode()
	{
		System.out.println("Opening in full screen mode");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Safari obj = new Safari();
		System.out.println(obj.browsername);
		obj.readerMode();
		obj.fullScreenMode();
		obj.navigateBack();
		obj.closeBrowser();
	}

}
