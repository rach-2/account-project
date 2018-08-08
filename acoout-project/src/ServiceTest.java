import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ServiceTest 
{     Service servive;
       Account  acount1;
       Account  acount2;
       Account  acount3;
	@Before
	public void setUp()
	{
		servive = new Service(); 
		acount1 = new Account("Bob", "Booby", "008978870");
	    acount2 = new Account("Jim", "jiimmy", "0998990");
	    acount3 = new Account("Greg", "greggy", "008897");
		
	}
   
    @Test
    public void countAcountsTest()
    {
    	servive.addAccout(acount1);
    	servive.addAccout(acount2);
    	servive.addAccout(acount3);
    
        Assert.assertEquals(3,servive.countAcounts());
        
    }
}
