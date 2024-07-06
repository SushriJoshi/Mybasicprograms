package Methods;

public class MethodOverloading_NonStatic 
{

	void add(int a)
	{
		int sum=a+60;
		System.out.println(sum);
		
	}
	void add(int a, int b)
	{
		int sum=a+b+60;
		System.out.println(sum);
		
	}
	void add(double a)
	{
		double sum=a+60;
		System.out.println(sum);
		
	}
	void add(int a,double b,int c)
	{
		double sum=a+b+c+60;
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		MethodOverloading_NonStatic n1=new MethodOverloading_NonStatic();
		n1.add(100);
		n1.add(100,200);
		n1.add(3.145);
		n1.add(100,5.6,600);
		
		
	}
}
