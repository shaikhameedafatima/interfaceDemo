
public class Final
{
	class FinalClass {
		public void display() {
		System.out.println("This is a final method.");
		}

		// try to extend the final class
		class FinalClassDemo extends FinalClass {
		public void display() {
		System.out.println("The final method is overridden.");
		}

		public void main(String[] args)
		{
		FinalClass obj = new FinalClass();
		obj.display();

		}
		}
	}
}

