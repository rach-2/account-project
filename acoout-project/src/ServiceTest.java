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
	    acount2 = new Account("Bob", "Bobby", "0998990");
	    acount3 = new Account("Greg", "greggy", "008897");	
	}
	
    @Test
    public void countAcountsByNameTest()
    {
    	servive.addAccout(acount1);
    	servive.addAccout(acount2);
        Assert.assertEquals(2,servive.countAcountsByName("Bob"));
    }
  }
    
    
    
     
