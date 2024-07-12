package program_Interface_concept;

interface Email
{
	void emailID();
	
}

interface mob_no
{
	void mobile_no();
}

public class Facebook_login implements Email,mob_no
{

	@Override
	public void emailID() 
	{
		System.out.println("Login with email id.");
		
	}

	@Override
	public void mobile_no() 
	{
		System.out.println("Login with mobile number.");
	}
	
	public static void main(String[] args) 
	{
		new Facebook_login().emailID();
		new Facebook_login().mobile_no();
	}

}
