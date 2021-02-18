
public class TestDoctor {

	public static void main(String[] args) {
		Specialist spobj = new Specialist("Mary",1234,"newyork","medicine");
		spobj.display();
		NonSpecialist nonspobj=new NonSpecialist("john",1234,"sydney");
		nonspobj.display();
	}

}
