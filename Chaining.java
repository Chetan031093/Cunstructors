
class Animal //Implicit cunstructor call
{
// constructor
Animal()
{
 System.out.println("We're in class Animal's constructor.");
}

}


class Mammal extends Animal 
{
//constructor
Mammal()
{
 System.out.println("We're in class Mammal 's constructor.");
}

}



public class Chaining
{
	 /**
	* @param args
	*/
	public static void main(String[] args) 
	{
	Mammal m = new Mammal();
	}
}


