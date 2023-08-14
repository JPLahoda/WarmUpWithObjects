/* Jason Lahoda
 * Section 4
 * This program does things with car statistics. */
public class Car {


	String make;
	String model;
	int year;
	double MPG;
	double milesDriven;
	double fuelCapacity;
	double fuelRemaining; 
	
	public Car(String make, String model, int year, double MPG, double milesDriven, double fuelCapacity, double fuelRemaining) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.MPG = MPG;
		this.milesDriven = milesDriven;
		this.fuelCapacity = fuelCapacity;
		this.fuelRemaining = fuelRemaining; 
	}
	
	public void fillTank(double g) {
		if (g + fuelRemaining < fuelCapacity) {
			fuelRemaining += g;
		}
		else {
			fuelRemaining = fuelCapacity;
		}
	}
	
	public void drive(double m) {
		milesDriven += m;
		fuelRemaining -= m / MPG;
	}
	
	public String toString() {
		return make + ", " + model + ", " + year + ", " + MPG + " MPG, " + milesDriven + " miles driven, " + fuelCapacity + " total fuel, and " + fuelRemaining + " fuel remaining";
	}

	public double getFuelRemaining() {
		return fuelRemaining;
	}
	public static int func(int x) {
	    if (x == 1) {
	      return 2;
	    } else {
	      return 2 * func(x - 1) + x;
	    }
	  }

	  public static void main(String []args) {
	    System.out.println(func(5));
	  }
	
}