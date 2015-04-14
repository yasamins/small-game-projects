package fi.metropolia.inheritance;

public class SportsCar extends Car {
	
	private boolean roofUp;
	
	public SportsCar(String name){
		super(name);
		this.roofUp = false;
		System.out.println("it is a sports car. RoofUp:" + roofUp);
	}
	
	public SportsCar(String name, Boolean roofUp){
		super();
		this.roofUp = roofUp;
		System.out.println("it is a sports car. RoofUp:" + roofUp);
	}
	
	public void accelerate () {
		System.out.print("Sportscar " + this.getName() + " accelerating. ");
		this.setSpeed(this.getSpeed() + 5.0);
		this.setGasolineLevel(this.getGasolineLevel() - 1.0);
	}

	public void honk(int length) {
		for(int i = 0; i < length; i++) {
			System.out.print("beep ");
		}
		System.out.println();
	}
	

}
