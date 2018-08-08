import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class App {

	public static void main(String[] args) 
	{

		
		System.out.println("Hello world to the standred output");
		Service service =  new Service();
	   Gson gsonCovneter = new Gson();
        Account account = new Account("Bob", "Boby","088997090");
		String jsonCoventer = gsonCovneter.toJson(account);
		System.out.println(jsonCoventer);
		service.addAccout(account);
		
		
	}
	
}
