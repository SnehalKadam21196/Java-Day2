import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		int[]arr=new int[5];
		int i,min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display array:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		 min=max=arr[0];
		 for(i=1;i<arr.length;i++)
		 {
			 if(min>arr[i])
				 min=arr[i];
			 if(max<arr[i])
				 max=arr[i];
		 }
		 System.out.println("Mininum of array:"+min);
		 System.out.println("Maximum of array:"+max);
		 
	    
sc.close();
	}

}
