package fi.metropolia.inheritance;

public class Car {
	private final double MAXGASOLINE = 50.0;
	private double speed;
	private double gasolineLevel;
	private String name= null;
	
	
	
	
	public Car() {
		//this.name = null;
		this.speed = 0.0;
		this.gasolineLevel = 1.0;
	}
	
	public Car(String name) {
		
		this.name = name;
		this .speed = 0.0;
		this.gasolineLevel = 1.0;
		System.out.println("New car "+name+" created");
	}
	
	public void accelerate() {
		System.out.print("Car " + name + " accelerating. ");
		this.speed = this.speed + 2;	
		this.gasolineLevel = this.gasolineLevel - 0.5;
	}
	
	protected void setSpeed(double speed){
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public String getName() {
		return name;
	}
	
	public double getGasolineLevel() {
		return this.gasolineLevel;
	}
	
	protected void setGasolineLevel(double level) {
		this.gasolineLevel = level;
	}
	
	public void fillTank() {
		this.gasolineLevel = this.MAXGASOLINE;
	}
}
