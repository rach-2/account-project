import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

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
		public int countAcountsByName(String name) 
		{
		       int numberOfAcountsByGivenName = 0;
		       Iterator<Entry<Integer, Account>> accountIterator = acounts.entrySet().iterator();
		       while (accountIterator.hasNext())
		       {
		    	   for(Account acount: acounts.values())
		    	   {
		    		if(acount.getFirstName().equals(name));
		    		numberOfAcountsByGivenName++;
		    	   }
		    	       break;
		    	}
		         return numberOfAcountsByGivenName;
		  }
}
