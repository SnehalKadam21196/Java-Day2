

/*10: Write a  program to input basic salary of an employee and calculate its Gross salary according to 
following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
		float basicSal,hra,da,grossSal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary of employee:");
		basicSal=sc.nextFloat();
		if(basicSal<=10000)
		{ da=(basicSal*80)/100;
		  hra=(basicSal*20)/100;
		}
		else if(basicSal<=20000)
		{ da=(basicSal*90)/100;
		  hra=(basicSal*25)/100;
		}
		
		else 
		{ da=(basicSal*95)/100;
		  hra=(basicSal*30)/100;
		}
		grossSal=basicSal+da+hra;
		System.out.println("Gross salary of employee:"+grossSal);
  sc.close();
	}

}
