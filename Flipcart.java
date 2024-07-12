package program_Interface_concept;

interface Amazon
{
	void login_with_emailid();    //No need to write abstract keyword in interface.
	void login_with_mob_no();
}


public class Flipcart implements Amazon
{
    static void add()
    {
    	int a=20;
    	int b=30;
    	int sum=a+b;
    	System.out.println("Addition of a and b"    +sum);
    }
	@Override
	public void login_with_emailid()   //public keyword will be automatically added after override.
	{
		System.out.println("Login with email id.");
		add();
	}

	@Override
	public void login_with_mob_no() 
	{
		
		System.out.println("Login with mobile number." );
	}

	public static void main(String[] args) 
	{
		new Flipcart().login_with_emailid();
		new Flipcart().login_with_mob_no();
	}
}
