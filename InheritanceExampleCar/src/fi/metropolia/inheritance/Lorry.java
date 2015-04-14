package fi.metropolia.inheritance;

public class Lorry extends Car{

	private double load;
	private static final double MAXLOAD = 2000.0;

	public Lorry(String name) {
		super(name);
		this.load = 0.0;
		System.out.println("It is a Van. Load:"+load);

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






		// TODO Auto-generated constructor stub
	}

}
