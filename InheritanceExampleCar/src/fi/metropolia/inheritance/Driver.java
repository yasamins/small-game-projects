package fi.metropolia.inheritance;

import java.util.ArrayList;

public class Driver {

	private ArrayList<Car> myCars;

	public Driver(){
		myCars = new ArrayList<Car>();
		myCars.add(new SportsCar("CrazyFastFportscar"));
		myCars.add(new SportsCar("RoofUpSportscar",true));
		myCars.add(new Van("LazyVan"));
		myCars.add(new Car("NormalCar"));	
	    myCars.add(new Lorry("FastCar"));
	}

	public void drive() {
		for (Car thisCar:myCars) {
			thisCar.accelerate();
			System.out.println ("Car " + thisCar.getName() + "'s " + "speed is now " + thisCar.getSpeed());
			if(thisCar instanceof Loadable) {
				Loadable car = (Loadable)thisCar;
				car.addLoad(200.0);
			}

		}
	}
}
