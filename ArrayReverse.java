
public class ArrayReverse {

	public static void main(String[] args) {
       int[]arr= {10,20,30,40,50};
       for(int i:arr)
       {
    	   System.out.println(i);
       }
      System.out.println("-----------------------");
      System.out.println("Reverse array:");
      for(int j=arr.length-1;j>=0;j--)
      {
    	  System.out.println(arr[j]);
      }
		
		

	}

}
