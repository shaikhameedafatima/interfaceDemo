import java.util.Arrays;

public class Arraypos {

	public static void main(String[] args) 
	{
		
		int n1[]= {2,3,-4,5,7,8};

        int[] n3 = new int[5];
 
        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
        //copying entire array n1 to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2="+Arrays.toString(n2));
        //copying elemnets from index 2 on n1 array
        //copying elements to index 1 of n3 array
        //2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 ="+Arrays.toString(n3));

	}

}
