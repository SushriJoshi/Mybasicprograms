package Methods;

public class MethodandConstructor_Overloading 
{

	void add(int a)
	{
		int sum=a+60;
		System.out.println(sum);
		
	}
	void add(int a,int b)
	{
		int sum=a+b+60;
		System.out.println(sum);
		
	}
	static void add(int c,double e)  //1 parameter
	{
		double sum=c+e+60;
		System.out.println(sum);
		
	}
	
	static void add(int a,double d,int b)  //2 parameter
	{
		double sum=a+b+d+60;
		System.out.println(sum);
		
	}
	MethodandConstructor_Overloading(int x)
	{
		System.out.println("int datatype");
	}
	MethodandConstructor_Overloading(double y)
	{
		System.out.println("double datatype");
	}
	public static void main(String[] args) 
	{
		add(20,20.5);
		add(20,20.5,30);
		MethodandConstructor_Overloading m1=new MethodandConstructor_Overloading(5);
		MethodandConstructor_Overloading m2=new MethodandConstructor_Overloading(5.38);
		m1.add(20);
		m2.add(20,30);
	}
		
}
