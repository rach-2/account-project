import java.util.HashMap;

public class Service 
{
	    private HashMap acounts = new HashMap();
	    
         
	    public void addAccout(Account acount) 
	    {
	    	 acounts.put("Acount", acount.getAcountNumber());
	    }
	    
}
