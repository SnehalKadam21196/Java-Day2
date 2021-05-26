import java.util.Scanner;

/*9: Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.*/

public class ArrayOperation {

	public static void main(String[] args) {
		int[]arr;
		int sum=0,i,min,max;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("-----Array Operations----");
		System.out.println("Accept array:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display Array:");
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Sum of array elements:");
		for(i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum="+sum);
		System.out.println("Average of numbers:");
		avg= (double)sum/size;
		System.out.println(avg);
		System.out.println("mininum and maximum number:");
		min=max=arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("min="+min);
		System.out.println("max="+max);
   sc.close();
	}

}
