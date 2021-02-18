import java.util.Scanner;

public class Area {
	public  int length;
	public  int breadth;
	void Area(int length, int breadth)
	{  
		this.length=length;
		this.breadth=breadth;
	}
	void input()
	{
		int Area;
		Area=length*breadth;
		System.out.println("the area is:"+Area);
	}
	
	public static void main(String[] args)
	{
			
			Area obj=new Area();
			System.out.println("enter length and breadth values:");
			Scanner s=new Scanner(System.in);
			int p=s.nextInt();
			int p1=s.nextInt();
			obj.input();
			
	}

}
