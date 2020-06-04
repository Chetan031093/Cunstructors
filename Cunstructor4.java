
class Explicit
{
	double h;
	Explicit(double h)
	{
		System.out.println("running cunstructor of explicit class");
		this.h = h;
		System.out.println(this.h);
	}
}

public class Cunstructor4 extends Explicit
{
	Cunstructor4()
	{
		super(456.456);
		System.out.println("running cunstructor of main mthd");
	}
	
	public static void main(String[] args)
	{
		Cunstructor4 c44 = new Cunstructor4();
		//Explicit e1 = new Explicit(55.63);		
	}

}
