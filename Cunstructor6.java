
public class Cunstructor6 
{

	static int a;
	int b;
	int c;
	
	static
	{
		System.out.println("running static block");
		a = 22;
	}
	
	{
		System.out.println("running non static block");
		b = 56;
	}

	Cunstructor6()
	{
		System.out.println("running cunstructor");
		this.c = 569;
	}
	
	public static void main(String[] args)
	{
		Cunstructor6 c66 = new Cunstructor6();
	}
	
}
