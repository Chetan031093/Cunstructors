
class Cunns 
{
	double c;
	Cunns(double c)
	{
		System.out.println("running cunstructor of Cunns");
		this.c = c;
		System.out.println(this.c);
	}
}

class Cuns extends Cunns
{
	float b;
	
	Cuns(float b)
	{
		super(33.3);
		System.out.println("running cunstructor of cuns");
		this.b = b;
		System.out.println(this.b);
	}
}

public class Cunstructor5  extends Cuns
{
	int a;
	Cunstructor5()
	{
		super(22);
		System.out.println("running cunstructor of main mthd");
		this.a = 55;
		System.out.println(this.a);
	}
	
	public static void main(String[] args) 
	{
		Cunstructor5 c55 = new Cunstructor5();
	}

}
