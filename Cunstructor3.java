
class Name 
{
	int a;
	double b;
	Name(int a)
	{
		this(55.66);//this statement is use to call same class cunstructor or overloaded cunstructor
		this.a = a;
		System.out.println(this.a);
	}
	
	Name(double b)
	{
		this.b = b;
		System.out.println(this.b);
	}
	
}
public class Cunstructor3 extends Name
{
	double c;
	
	Cunstructor3(double c)
	{
		super(55); //super statement is use to call another class cunstructor
		System.out.println("running cunstructor of main mthd");
		this.c = c;
	}
	
	public static void main(String[] args) 
	{
		Cunstructor3 c33 = new Cunstructor3(33.23);
		System.out.println(c33.c);
		System.out.println(c33.b);
		
	}

}




