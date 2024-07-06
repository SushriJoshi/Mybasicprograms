package Methods;

public class Local_program_global 
{

	int age=60;
	static String name="Meena";
	
	public static void main(String[] args) 
	{
		name="meeta";
		System.out.println(name);
		Local_program_global l1=new Local_program_global ();
		l1.age=90;
		System.out.println(l1.age);
		
	}
}
