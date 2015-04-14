import java.util.ArrayList;

import java.util.Scanner;

public class Monthlyincome {
	
	

	public void Tester() {
		
		ArrayList <String> monthNames = new ArrayList <String>();
		
		  monthNames.add("January");
		  monthNames.add("February");
		  monthNames.add("March");
		  monthNames.add("April");
		  monthNames.add("May");
		  monthNames.add("June");
		  monthNames.add("July");
		  monthNames.add("Augest");
		  monthNames.add("September");
		  monthNames.add("October");
		  monthNames.add("November");
		  monthNames.add("December");
		  double price;
		  boolean warningGiven=false;
		  
		  System.out.print("please input your initial price");
			
			Scanner s1 = new Scanner(System.in);
			price= s1.nextDouble();
			
			System.out.print("please inter the percentage ");
			
			int percentage=s1.nextInt();
			
			System.out.println("please inter the limitation");
			
		
			double limitation=s1.nextDouble();
			
			for (String monthName:monthNames){
			     System.out.print(monthName+" ");
				price=price+(price*percentage/100);
				
				System.out.println(", on this month the price will be"+price+"euros");
				if(price>limitation && !warningGiven){
					warningGiven = true;
					System.out.println("The price is more than" + limitation) ;
					
				}

	
}
	}
}