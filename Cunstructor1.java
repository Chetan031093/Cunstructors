
public class Cunstructor1 
{
	int a;
	
	int b;
	int c;
	int d;
	
	Cunstructor1()//zero arguement cunstructor
	{
		this(10,20);
		System.out.println("running zero argurmrnt cunstructor");
		this.a=55;
		b=896;
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------------");
		
	}
	
	Cunstructor1(int c,int d)//arguement cunstructor
	{
		System.out.println("running arguement cunstructor");
		this.c=c;
		this.d =d;
		System.out.println(c);
		System.out.println(d);
		System.out.println("----------------------");
	}
	
	public static void main(String[] args)
	{
		Cunstructor1 c1 = new Cunstructor1();
		System.out.println(c1.c);
		System.out.println(c1.d);
		
	}
	
	

}
