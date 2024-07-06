package Methods;
import java.util.Scanner;
public class Scanner_Circumferenceof_circle 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter the values of Pi and r.");
		double pi=s1.nextDouble();
		int r=s1.nextInt();
		double Circumference=2*pi*r;
		
		System.out.println("Circumference of the circle is ="+Circumference);
	}
}
