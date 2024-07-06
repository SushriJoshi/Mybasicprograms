package Methods;

public class Constructor_Overloading 
{

	Constructor_Overloading(int a)
	{
		System.out.println("int datatype");
	}
	Constructor_Overloading(double b)
	{
		System.out.println("double datatype");
	}
	Constructor_Overloading(boolean d)
	{
		System.out.println("boolean datatype");
	}
	Constructor_Overloading(char r)
	{
		System.out.println("charcter datatype");
	}
	public static void main(String[] args) 
	{
/*	Constructor_Overloading c1=new Constructor_Overloading('A');
	Constructor_Overloading c2=new Constructor_Overloading(3.14);
	Constructor_Overloading c3=new Constructor_Overloading(100);
	Constructor_Overloading c4=new Constructor_Overloading(true);*/
	
	new Constructor_Overloading('A');
	new Constructor_Overloading(3.14);
	new Constructor_Overloading(100);
	new Constructor_Overloading(true);
	}
	
	
	
}
