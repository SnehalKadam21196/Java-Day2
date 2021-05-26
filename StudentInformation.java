import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args) {
	int roll,maths,his,eng,chem,geo,totalmarks;
	double per;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("roll no:");
	roll=sc.nextInt();
	System.out.println("Name:");
	name=sc.next();
	System.out.println("enter marks of maths:");
	maths=sc.nextInt();
	System.out.println("enter marks of History:");
	his=sc.nextInt();
	System.out.println("enter marks of English:");
	eng=sc.nextInt();
	System.out.println("enter marks of Chemistry:");
	chem=sc.nextInt();
	System.out.println("enter marks of geography:");
	geo=sc.nextInt();
	totalmarks=maths+his+eng+chem+geo;
	System.out.println("total marks:"+totalmarks);
	
	 per=(totalmarks/5);
	 System.out.println("percentage:"+per);
	if(per>75)
		System.out.println("Grade A");
	else if(per<74 || per>60)
		System.out.println("Grade B");
	else if(per<59)
		System.out.println("Grade C");
	else
		System.out.println("fail");
		
	
			
    
	sc.close();
	}

}
