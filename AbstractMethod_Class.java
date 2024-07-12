package abstractClass_Program;

class concreteClass
{
	static void add2()
	{
		int a=25;
		int b=35;
		int add2=a+b;
		System.out.println("Addition2 ="   +add2);     // Two concrete methods
	}
	
	static void sub2()
	{
		int a=256;
		int b=135;
		int sub2=a-b;
		System.out.println("Subtraction2 ="   +sub2);
	}
}

abstract class Abstract_Class1 extends concreteClass
{
	abstract void Add();  //Abstract class will contains abstract and concrete methods.
	abstract void Sub();  ////Abstract methods are always non static and needs to be overridden.
	
	void mul()
	{
		int a=25;                         //Two concrete methods and two abstract methods.
		int b=35;
		int mul=a*b;
		System.out.println("Multiplication ="   +mul);
	}
	
	void div()
	{
		int a=255;
		int b=35;
		int div=a/b;
		System.out.println("Division="   +div);
	}
}


public class AbstractMethod_Class extends Abstract_Class1
{

	static void Add3()
	{
		int a=25;
		int b=35;                           //Two concrete methods
		int add3=a+b;
		System.out.println("Addition 3 ="   +add3);
	}
	
	static void sub3()
	{
		int a=258;
		int b=355;
		int sub3=b-a;
		System.out.println("Subtraction 3 ="   +sub3);
	}

	@Override
	void Add() 
	{
		int a=55;
		int b=32;
		int sum=a+b;
		System.out.println(sum);
		
	}

	@Override
	void Sub() 
	{
		int a=32;
		int b=65;
		int sub=b-a;
		System.out.println(sub);
		
	}
	
	public static void main(String[] args) 
	{
		new AbstractMethod_Class().Add();
		new AbstractMethod_Class().Sub();
		new AbstractMethod_Class().mul();
		new AbstractMethod_Class().div();
		add2();
		sub2();
		Add3();
		sub3();
		
	}
}
