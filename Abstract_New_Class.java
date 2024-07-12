package abstractClass_Program;

abstract class Abstract_New_Class1
{
	abstract void Add();  //Abstract class will contains abstract and concrete methods.
	abstract void Sub();    //Abstract methods are always non static and needs to be overridden.
}

abstract class Abstract_New_Class2 extends Abstract_New_Class1
{
	abstract void Add1();
	abstract void Sub1();
	
}
public class Abstract_New_Class extends Abstract_New_Class2
{

	static void mul() 
	{
		int a=20;
		int b=30;
		int mul=a*b;
		System.out.println("Multiplication of a and b ="  +mul);
	}
	
	static void div()
	{
		int a=400;
		int b=20;
		int div=a/b;
		System.out.println("division of a and b ="   +div);

	}


	void Add1() 
	{
		int a=60;
		int b=30;
		int sum1=a+b;
		System.out.println("Addition for Add1 method="  +sum1);
		
	}

	@Override        //We can delete these auto generated lines.
	void Sub1() 
	{
		int a=60;
		int b=30;
		int sub1=a-b;
		System.out.println("Subtraction for sub1 method="  +sub1);
		
	}

	@Override
	void Add() 
	{
		int a=660;
		int b=630;
		int sum=a+b;
		System.out.println("Addition for Add method="  +sum);
		
	}

	@Override
	void Sub() 
	{
		int a=660;
		int b=630;
		int sub=a-b;
		System.out.println("Subtraction for sub method="  +sub);
	}
	
	public static void main(String[] args) 
	{
		new Abstract_New_Class().Add();
		new Abstract_New_Class().Add1();
		new Abstract_New_Class().Sub();
		new Abstract_New_Class().Sub1();
		mul();
		div();
	}
}
