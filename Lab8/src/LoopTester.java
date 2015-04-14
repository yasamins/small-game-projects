
import java.util.Scanner;

public class LoopTester {
	public LoopTester() {
		
	}
		
		public void doTheLoop() {
			int month;
			double price;
			boolean warningGiven=false;
			
			System.out.print("please input your initial price");
			
			Scanner s1 = new Scanner(System.in);
			price= s1.nextDouble();
			
			System.out.print("please inter the percentage ");
			
			Scanner s2= new Scanner(System.in);
			int percentage=s2.nextInt();
			
			System.out.println("please inter the limitation");
			
			Scanner s3= new Scanner(System.in);
			double limitation=s3.nextDouble();
			
			
			
			for(month=1 ; month<13 ; month++) {
				price=price+(price*percentage/100);
				System.out.println("on month"+month+"the price will be"+price+"euros");
				if(price>limitation);
				if(!warningGiven) {
					System.out.println("price") ;
					warningGiven=true;
			}
			
	
	}
	
	

		}
}
	


