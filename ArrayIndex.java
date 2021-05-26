import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		int[]arr=new int[5];
		int num,i;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Accept array:");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Display array:");
		for( i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("-----------------");
		System.out.println("Accept number from user :");
		num=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{   flag=true;
				System.out.println("index="+i);
				break;
			}
			else
				flag=false;
				
		}
		if(flag==false)
			System.out.println("Number not exists");
	
sc.close();
	}

}
