package program_Interface_concept;

interface Interface_Method2       //assignment
{
	void mul1();
	void div1();
}


abstract class AbstractMethod implements Interface_Method2
{
	abstract void add1();
	abstract void sub1();
	
	void mul()
	{
		int a=45;
		int b=65;
		int mul=a*b;
		System.out.println("Multiplication of a and b."+mul);
	}
	
	void div()
	{
		int a=45;
		int b=65;
		int div=b/a;
		System.out.println("Division of a and b."+div);
	}
}


public class InterfaceMethods extends AbstractMethod
{

	void add()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println("addition of two numbers"+sum);
	}
	
	static void sub()
	{
		int a=100;
		int b=200;
		int sub=a-b;
		System.out.println("addition of two numbers"+sub);
	}
	
	@Override
	public void mul1() 
	{
		System.out.println("Overridden multiplication method.");
		
	}

	@Override
	public void div1() 
	{
		System.out.println("Overridden division method.");
		
	}

	@Override
	void add1() 
	{
		System.out.println("Overridden addition method.");
		
	}

	@Override
	void sub1() 
	{
		System.out.println("Overridden subtraction method.");
		
	}
	
	public static void main(String[] args) 
	{
		new InterfaceMethods().add();
		new InterfaceMethods().mul();
		new InterfaceMethods().div();
		new InterfaceMethods().add1();
		new InterfaceMethods().sub1();
		new InterfaceMethods().mul1();
		new InterfaceMethods().div1();
		sub();
	}

	
}
