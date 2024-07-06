package Methods;

import java.util.Scanner;

public class Scanner_inputmismatch_exception 
{

	public static void main(String[] args) 
	{
		Scanner t1=new Scanner(System.in);
		
		System.out.println("Please enter the value of g1");
		String g1=t1.next();
		
		System.out.println("Please enter the value of g2");
		int g2=t1.nextInt();
		
		System.out.println("Please enter the value of g3");
		short g3=t1.nextShort();
		
		System.out.println("Please enter the value of g4");
		byte g4=t1.nextByte();
		
		System.out.println("Please enter the value of g5");
		long g5=t1.nextLong();
		
		System.out.println("Please enter the value of g6");
		boolean g6=t1.nextBoolean();
		
		System.out.println("Please enter the value of g7");
		float g7=t1.nextFloat();
		
		System.out.println("Please enter the value of g8");
		double g8=t1.nextDouble();
		
	
	}
	
}
