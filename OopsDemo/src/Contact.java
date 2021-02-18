
public class Contact {
	void CreateContact()
	{
		
	}
	void CreateContact(String name,int num2)
	{
		System.out.println("the number of the person1 is:" +"num2");
	}
	void CreateContact(String name,int num1,String add)
	{
		System.out.println("the number of the perosn2:"+ "+name" +"num1" +"add");
	}
	

	public static void main(String[] args) {
		Contact c1=new Contact();
c1.CreateContact("ham", 5678);
c1.CreateContact("ham", 897, "poiuy");
	}

}
