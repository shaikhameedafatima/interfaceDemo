
public class ArrrayDemo {

	public static void main(String[] args) {
		int age[]= {12,4,5,33,43};
		System.out.println("using for loop");
		for(int i=0;i<age.length;i++)
		{
			if(i==4)
			{
				break;
			}
			System.out.println(age[i]);
			
		}
         
	}

}
