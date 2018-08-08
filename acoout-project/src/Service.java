import java.util.HashMap;

public class Service 
{
	    private HashMap<Integer, Account> acounts = new HashMap();
	    private int count = 0;
	    
	    public void addAccout(Account acount) 
	    {
	    	 this.count++;
	    	 acounts.put(this.count,acount);
	    } 
	    public void removeAcount(Integer accountId)
	    {
	    	   acounts.remove(accountId);
	    }
	    
	    public Account getAccountId(Integer accountId)
	    {
	    	 return acounts.get(accountId);
	    }
	    
	
	    
	    
}
