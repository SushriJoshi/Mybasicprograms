package Methods;
import java.util.Scanner;
public class Scanner_Areaof_Rectangle 
{

	static Scanner s1=new Scanner(System.in);
	
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter the values of length and breath.");
		int length=s1.nextInt();
		int breath=s1.nextInt();
		int Area=length*breath;
		System.out.println("Area of Rectangle is ="+Area);
		
		System.out.println("Please enter the values of Pi and r.");
		double pi=s1.nextDouble();
		int r=s1.nextInt();
		double Circumference=2*pi*r;
		
		System.out.println("Circumference of the circle is ="+Circumference);
		
		
		
	}
	
}
