package fi.metropolia.inheritance;

public class Van extends Car implements Loadable {
	
	private double load;
	private static final double MAXLOAD = 2000.0;
	
	public Van(String name) {
		super(name);
		this.load = 0.0;
		System.out.println("It is a Van. Load:"+load);
	}
	
	public void accelerate () {
		this.setSpeed (this.getSpeed()+1.0);
		this.setGasolineLevel(this.getGasolineLevel() - 1.0 - load/MAXLOAD * 5);
		System.out.print("Van "+this.getName()+" accelerating. ");
	}

	public boolean addLoad(double additionalLoad){
		if (this.load+additionalLoad < MAXLOAD) {
			this.load = this.load + additionalLoad;
			System.out.println ("Van "+getName()+"'s load is now "+load);
			return true;
		} else {
			System.out.println ("Van "+getName()+"'s load is still "+load);
			return false;
		}
		
	}
	
	public double getLoad(){
		return this.load;
	}
	
	public void honk(int length) {
		for(int i = 0; i < length; i++) {
			System.out.print("honk ");
		}
		System.out.println();
	}
}
