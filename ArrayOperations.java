/*9: Write a program to create an array of integers and perform following operations on that array like 
finding the sum, average, maximum and minimum number in that array. Accept the numbers of the 
array from user.*/
import java.util.Scanner;
public class ArrayOperations {

	public static void main(String[] args) {
		int[]arr;
		int choice,sum=0,size;
		boolean flag=true;	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of array:");
	    size=sc.nextInt();
	    arr=new int[size];
		System.out.println("--------Array Operations--------");
		System.out.println("Menu:");
		System.out.println("1:Accept Array");
		System.out.println("2:display Array");
		System.out.println("3:Sum");
		System.out.println("4:Average");
		System.out.println("5:Mininum and Maximum number");
		System.out.println("6:exit");
		
		while(flag!=false){
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
		switch(choice)
		{case 1:
			System.out.println("Accept Array elements:");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			break;
		case 2:
			System.out.println("Display array:");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			break;
		case 3:
			System.out.println("Sum of array elements:");
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			System.out.println(sum);
			break;
		case 4:
			System.out.println("Average of array elements:");
			for(int i=0;i<arr.length;i++)
			{
				sum=sum+arr[i];
			}
			double avg=(double) sum/size;
			System.out.println(avg);
			break;
		case 5:
			System.out.println("Min and max number:");
			int min,max;
			min=max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(min>arr[i])
					min=arr[i];
				if(max<arr[i])
					max=arr[i];
			}
			System.out.println("min number="+min);
			System.out.println("max number="+max);
			break;
		
		case 6:
			flag=false;
			break;
			
			
		}
		}
		sc.close();
	}

}
