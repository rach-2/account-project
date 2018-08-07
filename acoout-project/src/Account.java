
public class Account 
{
     private   String firstName;
     private  String   lastName;
     private  String  accountNumber;
     
     public Account(String firstName, String lastName, String accoutNumber)
     {
    	   this.firstName = firstName;
    	   this.lastName =  lastName;
    	   this.accountNumber = accountNumber; 
     }
     
      public String getFirstName()
      {
    	  return firstName;
      }
      
      public String getLastName()
      {
    	  return lastName;
      }
     
      public String getAcountNumber()
      {
    	  return accountNumber;
      }
      
      
}
