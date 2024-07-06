package Methods;

import java.util.Scanner;

public class Scanner_Class_Add_Sub_Mul_Div_Mod 
{

	static Scanner s1=new Scanner(System.in);
	static void add()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("Addition of a and b is ="+sum);
		
	}
	
	static void sub()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println("Subtraction of a and b is ="+sub);
		
	}
	
	static void mul()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println("Multiplication of a and b is ="+mul);
		
		
		
	}
	
	static void div()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int div=a/b;
		System.out.println("Division of a and b is ="+div);
	}
	
	static void mod()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int mod=a%b;
		System.out.println("Modulus of a and b is ="+mod);
	}
	public static void main(String[] args) 
	{
		System.out.println("Please enter the values of a and b for addition.");
		add();
		System.out.println("Please enter the values of a and b for subtraction.");
		sub();
		System.out.println("Please enter the values of a and b for multiplication.");
		mul();
		System.out.println("Please enter the values of a and b for division.");
		div();
		System.out.println("Please enter the values of a and b for modulus.");
		mod();
		
	}
}
