

public class FunctionOverloading {
       public static void add(int a,int b)
       {
         int  result=a+b;
          System.out.println("Addition:"+result);
    	   
       }
       public static void add(int a,double d)
       {
         double  result=a+d;
          System.out.println("Addition:"+result);
    	   
       }
       public static void add(int a,float b)
       {
    	   float result=a+b;
           System.out.println("Addition:"+result);
     	 
       }
       public static void add(double a,double b)
       {
    	   double result=a+b;
    	   System.out.println("Addition:"+result);
       }
       public static void add(float a,float b)
       {
    	   float result=a+b;
    	   System.out.println("Addition:"+result);
       }
      
       
     
       
	public static void main(String[] args) {
	   
         add(10,20.5);
         add(10,1.5);
         add(12,3.5);
         add(4.5,4.5);
         add(10,3.4f);
         add(6.7f,8.9f);
	    
        
	}

}
