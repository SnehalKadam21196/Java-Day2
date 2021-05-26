import java.util.Scanner;

public class ArrayDisplay {

	public static void main(String[] args) {
        int[]arr=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements:");
        for(i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("--------------------------------");
        System.out.println("Display array elements:");
        for(i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
		sc.close();
	}

}
