package Methods;

public class MethodOverloading_static //add method is used in all the methods multiple times.
{

	static void add(int a)  //1 parameter
	{
		int sum=a+60;
		System.out.println(sum);
		
	}
	
	static void add(int a,int b)  //2 parameter
	{
		int sum=a+b+60;
		System.out.println(sum);
		
	}
	
	static void add(double a) //decimal 1 parameter
	{
		double sum=a+60;
		System.out.println(sum);
		
	}
	
	static void add(int a,double b,double c)  //3 parameters
	{
		double sum=a+b+c+60;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	{
		add(100);
		add(100,200);
		add(5.34);
		add(300,2.39,3.34);
	}
}
