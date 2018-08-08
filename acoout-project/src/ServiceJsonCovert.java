import com.google.gson.Gson;
import com.google.gson.JsonIOException;
public class ServiceJsonCovert {
	
	private Gson gsonConverter;
	private Service serviceObject;
	
	public String serviceJsonConvert(){
		gsonConverter = new Gson();
		serviceObject = new Service();
		String  servieJsonString =  gsonConverter.toJson(serviceObject);
		return servieJsonString;
	}
	
	  
}
	 
