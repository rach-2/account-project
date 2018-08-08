
public class App {

	public static void main(String[] args) 
	{
		
		System.out.println("Hello world to the standred output");
		Account account = new Account("Bob", "Boby","088997090");
		Service service =  new Service();
	    service.addAccout(account);
	    System.out.println(service.getAccount(1));
  }

}
