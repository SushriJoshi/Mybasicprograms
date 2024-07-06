package Methods;

public class Global_add_sub_mul_div 
{

	static int a=10;
	static int b=20;
	static int sum=a+b;
	static int sub=a-b;
	static int mul=a*b;
	static int div=a/b;
	
	double pi=3.14;
	int r=7;
	double area=pi*r*r;
	
	int age=60;
	int salary=30300;
	
	static int c;
	static long d;
	static double e;
	static boolean f;
	static char m;
	static String g;
	
	
	public static void main(String[] args) 
	{
		
		System.out.println("Global Variable");
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		Global_add_sub_mul_div g1=new Global_add_sub_mul_div();
		System.out.println(g1.area);
		g1.age=50;
		System.out.println(g1.age);
		System.out.println(g1.salary);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(m);
		System.out.println(g);
		
	}
	
	
	
}
