package Methods;

public class NonstaticMethod 
{

	void add()
	{
		System.out.println("Addition");
	}
	
	void subtract()
	{
		System.out.println("Subtraction");
	}
	
	void mul()
	{
		System.out.println("Multiplication");
	}
	
	void div()
	{
		System.out.println("division");
	}
	
	public static void main(String[] args) // How to access non static method.
	{
		NonstaticMethod n1=new NonstaticMethod();
		n1.add();
		n1.subtract();
		n1.mul();
		n1.div();
	}
}
