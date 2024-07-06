package Methods;

public class OR_Operator 
{

	public static void main(String[] args) // OR operator symbol &&.
	{
		char gender='F';
		int salary=10000;
		
		if(gender=='F' || salary==5000) //true
		{
			System.out.println("Sita");
		}
		if(gender!='F' || salary==8000) //false
		{
			System.out.println("Gita");
		}
		if(gender=='F' || salary==10000) //true
		{
			System.out.println("Malti");
		}
		if(gender!='F' || salary==10000) //true
		{
			System.out.println("Priti");
		}
		
		if(gender=='F' || salary==5000) //true
		{
			System.out.println("Rita");
		}
		
	}
	
}
