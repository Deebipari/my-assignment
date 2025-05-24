package week4.day1;

public class Polymorphism {
	public void reportStep(String msg ,String status)
	{
		System.out.println(msg);
		System.out.println(status);

	}
	
	public void reportStep(String msg ,String status, boolean snap)
	{
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);

	}
	public void takesnap()
	{
		System.out.println("Take a snap");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism obj = new Polymorphism();
		obj.reportStep("printing msg one ", "Active");
		obj.reportStep("printing msg two", "not active", false);
		obj.takesnap();
		
		

	}

}
