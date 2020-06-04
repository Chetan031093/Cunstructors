
public class Cunstructor2 
{

	int c;
	int d;
	
	Cunstructor2(int c,int d)//arguement cunstructor
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
		Cunstructor2 c2 = new Cunstructor2(11,55);
	}
}
