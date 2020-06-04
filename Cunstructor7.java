class Programm
{
	int a;
	Programm(int a)
	{
		System.out.println("running cunstructor of programm");
		this.a = a;
		System.out.println(this.a);
	}
}

class Programme1 extends Programm
{
	double b;
	Programme1(double b)
	{
		super(25);
		System.out.println("running cunstructor of programm1");
		this.b = b;
		System.out.println(this.b);
	}
}

public class Cunstructor7 extends Programme1
{
	int q;
	int w;
	
	Cunstructor7(int q,int w)
	{
		super(66.36);
		System.out.println("running cunstructor of Cunstructor7");
		this.q = q;
		this.w = w;
		System.out.println(this.q );
		System.out.println(this.w );
	}
	
	
	public static void main(String[] args)
	{
		Cunstructor7 c77 = new Cunstructor7(33,85);
	}
}
