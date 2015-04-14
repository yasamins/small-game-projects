
public class Motorcycle {
	private double accelerate;
	private double speed;
	
	public Motorcycle() {
		this.speed=0.0;
		this.accelerate=300.0;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public double getAccelerate() {
		return this.accelerate;
	}
	
	public void speedacc() {
		
		while(this.accelerate>=100) {
			System.out.println("begin speedacc(): " +this.speed+" , " +this.accelerate);
			speed=speed+10;
			accelerate=accelerate-10;
		}
		System.out.println("end speedacc()" + this.speed + ", " +this.accelerate);
		
	}
	

			
		
	}
	
	


