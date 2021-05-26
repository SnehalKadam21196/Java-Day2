import java.util.Scanner;

public class ArrayReverse1 {

	public static void main(String[] args) {
		int[]arr=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display array elements:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("Reverse Array:");
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
