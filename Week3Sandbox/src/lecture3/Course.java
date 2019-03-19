package lecture3;

public class Course {
	
	public static final String INSTITUTION_NAME = "FedUni";
	public static final int ACCREDITATION_ID 	= 123445678;
	public static final String LOCATION_NAME 	= "Berwick";
	
	private static int numberOfCoursesCreated;
	private String name;
	private int numberOfDays;
	private double price;
	
	// constructor
	public Course (String name, int days, double price )  {
		setName(name);
		setNumberOfDays(days);
		setPrice(price);
		numberOfCoursesCreated++;
	}
	
	public static int getNumberOfCoursesCreated() {
    		return numberOfCoursesCreated;
  	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
