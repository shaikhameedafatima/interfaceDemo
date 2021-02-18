
public class AddTime {
	int hour;
	int min;
	int sec;
	int sec1;
	public AddTime(int h,int m,int s)
	{
		hour=h;
		min=m;
		sec=s;
		
	}
	void add()
	{
		this.hour+=this.hour;
		this.min+=this.min;
		this.sec+=this.sec;
		if(sec1>60)
		{
			min=min+sec;
		}
	}
	
	
	void display()
	{
		System.out.println(this.hour +" " +this.min +" " +this.sec);
	}

	public static void main(String[] args) {
		AddTime obj1=new AddTime(10,20,60);
		AddTime obj2=new AddTime(10,15,5);
		obj1.add();
		
		System.out.println("the times after add are:");
		obj1.display();
		
		
	}

}
