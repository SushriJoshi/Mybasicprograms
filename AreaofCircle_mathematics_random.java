package Methods;

public class AreaofCircle_mathematics_random 
{

	static double pi_value=Math.PI;
	
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
		double r=Math.random();
		
		double Area=pi_value*r*r;
		System.out.println("The area of circle is ->" +Area);
	    }
	
		
 /*       double r=Math.random();
		
		double Area=pi_value*r*r;
		System.out.println("The area of circle is ->" +  Area);
	*/	
     }
}	
