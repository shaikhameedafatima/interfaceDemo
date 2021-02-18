
public class Emp {
	int id;
	String name;
	Address address;//aggregation

	public Emp(int id,String name,Address address)
	{
	this.id=id;
	this.name=name;
	this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state);
	}
	public static void main(String[] args)
	{
		Address address1=new Address("bangalore","hyderabad","delhi");
		Address address2=new Address("bang","hyd","del");
		Emp e1=new Emp(111,"hameeda",address1);
		Emp e2=new Emp(112,"tiger",address2);
		e1.display();
		e2.display();
	}
	

}
