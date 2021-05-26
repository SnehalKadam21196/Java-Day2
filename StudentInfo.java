import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		int rollno,totalmarks=0,i;
		String name;
		double percentage;
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter Student info:");
       System.out.println("Rollno:");
       rollno=sc.nextInt();
       System.out.println("Name:");
       name=sc.next();
       System.out.println("students marks:");
       int[]arr=new int[5];
       for( i=0;i<arr.length;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       for(i=0;i<arr.length;i++)
       {
    	   totalmarks=totalmarks+arr[i];
       }
       System.out.println("Total marks:"+totalmarks);
       percentage=(totalmarks/5);
       System.out.println("Percentage:"+percentage);
       
       
		sc.close();
	}

}
