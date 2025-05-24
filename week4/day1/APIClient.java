package week4.day1;

public class APIClient {

	public void sendRequest(String endpoint) {
		
		System.out.println("printing the 1st method endpoint" +endpoint);
		
	}
public void sendRequest(String endpoint ,String requestBody ,String requestStatus) {
	System.out.println("printing the 2rd method end point"+endpoint);
	System.out.println(requestBody);
	System.out.println(requestStatus);

		
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
          APIClient obj= new APIClient();
         obj.sendRequest("client1");
         obj.sendRequest("receiver", "customer", "send successfully");
	}

}
