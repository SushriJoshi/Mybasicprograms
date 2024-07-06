package Methods;

public class OR_NOT 
{

	public static void main(String[] args) //or with not operator. Not operator reverse the input. T for F and F for T.
	{
	
		char gender='F';
		int salary=10000;
		
		if(!(gender=='F' || salary==5000)) //true--false
		{
			System.out.println("Sita");
		}
		if(!(gender!='F' || salary==8000)) //false--true
		{
			System.out.println("Gita");
		}
		if(!(gender=='F' || salary==10000)) //true---false
		{
			System.out.println("Malti");
		}
		if(!(gender!='F' || salary==10000)) //true--false
		{
			System.out.println("Priti");
		}
		
		if(!(gender=='F' || salary==5000)) //true--false
		{
			System.out.println("Rita");
		}
		
	}
}
