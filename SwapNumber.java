import java.util.Scanner;

public class SwapNumber {

	     public static void swapnum(int x,int y)
	          {
	        	 int temp;
	        	 temp=x;
	        	 x=y;
	        	 System.out.println("value of a after swapping="+x);
	        	 y=temp;
	        	 System.out.println("value of b after swapping="+y);
	        	 
	          }
	public static void main(String[] args) {
		 int a,b;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("a=");
		 a=sc.nextInt();
		 System.out.println("b=");
		 b=sc.nextInt();
		 swapnum(a,b);
		
  
   
   
   sc.close();
	}

}
