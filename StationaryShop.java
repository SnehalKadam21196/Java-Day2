import java.util.Scanner;

/*11:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed items. */

public class StationaryShop {
	public static void price(int... a)
	{int sum=0;
	   for(int i=0;i<a.length;i++)
	   {
		   sum=sum+a[i];
	   }
	
		System.out.println("Total price of all items you purchase:"+sum);
		
	}

	public static void main(String[] args) {
		int item,quantity,price,totalprice,sum=0;
		boolean flag=true;
		
		System.out.println("-----Menu-----");
        System.out.println("1:pen        Price per item:10Rs");
        System.out.println("2:Pencil     Price per item:5Rs");
        System.out.println("3:Notebook   Price per item:20Rs");
        System.out.println("4:Bottle     Price per item:30Rs");
        System.out.println("5:colourBox  Price per item:50Rs");
        System.out.println("6:exit");
		Scanner sc=new Scanner(System.in);
		
		while(flag!=false)
		{
		System.out.println("choose items you want to buy:");
		item=sc.nextInt();
		
		switch(item)
		{ 
		case 1:
			System.out.println("Enter quantity:");
			quantity=sc.nextInt();
			price=10;
			 totalprice=price*quantity;
			System.out.println("total price of pens :"+(totalprice));
		    sum=sum+totalprice;
		
			break;
			
		case 2:
			System.out.println("Enter quantity:");
			quantity=sc.nextInt();
			price=5;
			 totalprice=price*quantity;
			System.out.println("total price of Pencil :"+(totalprice));
			sum=sum+totalprice;
			
			break;
		case 3:
			System.out.println("Enter quantity:");
			quantity=sc.nextInt();
			price=20;
			 totalprice=price*quantity;
			System.out.println("total price of Notebook :"+(totalprice));
			sum=sum+totalprice;
			break;
		case 4:
			System.out.println("Enter quantity:");
			quantity=sc.nextInt();
			price=30;
			 totalprice=price*quantity;
			System.out.println("total price of Bottles :"+(totalprice));
			sum=sum+totalprice;
			break;
		case 5:
			System.out.println("Enter quantity:");
			quantity=sc.nextInt();
			price=50;
			totalprice=price*quantity;
			System.out.println("total price of colourbox:"+(totalprice));
			sum=sum+totalprice;
			break;
		case 6: 
			flag=false;
			System.out.println("invalid choice");
			System.out.println("Shopping done.");
			break;
		 
			
		}
	
		}
		System.out.println("total price of all purchased items:"+sum);
  sc.close();
	}

}
