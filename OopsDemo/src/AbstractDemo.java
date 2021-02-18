abstract class Anim
{
	abstract void makeSound();
	public void eat()
	{
		System.out.println("I can eat.");
	}
}
class Do  extends Anim
{
	//provide implementation of abstraction
	public void makeSound()
	{
		System.out.println("bark bark");
	}
}

public class AbstractDemo {

	public static void main(String[] args) 
	{
			Do d1=new Do();
			d1.makeSound();
			d1.eat();

	}

}
