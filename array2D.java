import java.util.Scanner;

public class array2D {

	public static void main(String[] args) {
		int [] [] arr=new int [3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("accept array:");
		for(i=0;i<arr.length;i++)

		{
			for(j=0;j<arr.length;j++)
			{
				arr [i][j]=sc.nextInt();
			}
		}
		
		System.out.println("display array:");
		for(i=0;i<arr.length;i++)
	
	{
		for(j=0;j<arr.length;j++)
		{
			System.out.print(" " +arr[i][j]);
		}
		System.out.println("");
	}

		sc.close();
}
}