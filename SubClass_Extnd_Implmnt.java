package program_Interface_concept;

interface Myntra
{
	void Add();
	void Subtract();
}

class Flipkart
{
	void mul()
	{
		int a=22;
		int b=32;
		int mul=a*b;
		System.out.println("Multiplication ="+mul);
	}
	
	void div()
	{
		double a=6.3254;
		double b=5.3269;
		double div=a/b;
		System.out.println("Division="+div);
	}
}

public class SubClass_Extnd_Implmnt extends Flipkart implements Myntra
{

	

	@Override
	public void Add() 
	{
		int a=52;
		int b=32;
		int add1=a+b;
		System.out.println(add1);
		
	}

	@Override
	public void Subtract() 
	{
		int a=96;
		int b=63;
		int sub1=a-b;
		System.out.println(sub1);
		
	}
	
	public static void main(String[] args) 
	{
		SubClass_Extnd_Implmnt s1=new SubClass_Extnd_Implmnt();
		s1.Add();
		s1.div();
		s1.mul();
		s1.Subtract();

	}
	
}
