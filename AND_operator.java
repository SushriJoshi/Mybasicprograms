package Methods;

public class AND_operator 
{

	public static void main(String[] args) // AND operator.
	{
		int age=20;
		int salary=10000;
		
		if(age==18 && salary==5000) //false
		{
			System.out.println("I will go for a vacation to Goa");
		}
		if(age==20 && salary==8000) //false
		{
			System.out.println("I will go for a vacation to Kerala");
		}
		if(age>18 && salary==10000) //true
		{
			System.out.println("I will go for a vacation to Kashmir");
		}
		if(age>=18 && salary==10000) //true
		{
			System.out.println("I will go for a vacation to Delhi");
		}
		
		if(age<=25 && salary==5000) //false
		{
			System.out.println("I will go for a vacation to Goa");
		}
			
		
		
	}
	
}
