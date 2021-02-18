
public class Animal{
    String name;
  public void eat()
  {
	  System.out.println("I can eat");
  }
  
}
class Dog extends Animal
{
	//new method in sub class
	public void display()
	{
		System.out.println("my name is +name");
	}
}
class AnimalTest{
	
	public static void main(String[] args)
	{
		//creating an object
		Dog labrador=new Dog();
		//access field of superclass
		labrador.name="hameeda";
		labrador.display();
		labrador.eat();
	}
}