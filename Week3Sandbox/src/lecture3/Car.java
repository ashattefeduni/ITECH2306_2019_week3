package lecture3;

import java.util.Date;

class Car {

	int numWheels;

	/**
	 * Creates a new car object with 4 wheels
	 */
	public Car() {
		this.numWheels = 4;
	}
	
	/**
	 * Creates a new car object
	 * @param numWheels
	 */
	public Car(int numWheels) {
		
	}

	

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.toString());



		Date date = new Date();

		

	}

	public int getNumWheels() {
		return numWheels;
	}


	public boolean setNumWheels(int numWheels, String model) {
		if (numWheels > 0) {
			this.numWheels = numWheels;
			return true;
		} 
		return false;
		
		
	}
}
