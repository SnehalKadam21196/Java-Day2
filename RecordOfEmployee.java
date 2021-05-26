import java.util.Scanner;

public class RecordOfEmployee {

	public static void main(String[] args) {
		int empid;
		String name,address;
		double salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee info:");
		System.out.println("Empid:");
		empid=sc.nextInt();
		System.out.println("Name:");
		name=sc.next();
		System.out.println("Address:");
		address=sc.next();
		System.out.println("Salary:");
		salary=sc.nextDouble();
		System.out.println("-----------------------------------------");
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Salary:"+salary);
		sc.close();
		
		

	}

}
