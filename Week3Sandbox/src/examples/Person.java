package examples;  // Use this for demonstration purposes in workshop lecture

public class Person {
 // data or instance variables for object Person
	private String name;
	private int dateOfBirth;
	private String address;
	private double height;  // discuss if these attributes are relevant for Person object?
	private double weight;
	private Course myCourse; // associate a Course object with the Person
	
	//constructor - special method called when new Person() is invoked
	Person() {
		name = "";
		dateOfBirth = 1900;
		address = "unknown";
		height = 0.0;
		weight = 0.0;
	}
	
	Person (String _name, int _dateOfBirth) {
		this.setName(_name);
		this.setDateOfBirth(_dateOfBirth);
	}
	
	Person (String _name, int _dateOfBirth, String _address, double _height, double _weight) {
		name = _name; // or better: this.setName(_name);
		dateOfBirth = _dateOfBirth; // this.setDateOfBirth(_dateOfBirth);
		address = _address; // this.setAddress(_address);
		height = _height; // this.setHeight(_height);
		weight = _weight; // this.setWeight(_weight);
	}
	
	public void setName(String _name) {
		this.name = _name;
	}
	
	
	public int setWeight(double _weight) {
		if (_weight > 1) // presume valid weight is 1 or greater
			{this.weight = _weight;
			 return 1;
			}
		else 
			return 0;
	}
	
	public void setDateOfBirth(int _dateOfBirth) {
		dateOfBirth = _dateOfBirth > 1900 ? _dateOfBirth : 1900;  // default year of birth is 1900
	}
	
	public void setAddress(String _address) {
		address = _address;
	}
	
	public void setHeight(double _height) {
		height = _height > 0.5 ? _height : 0 ; 
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
		
	}
	
	public String getAddress() {
		return this.address;
	}
	public String getName() {
		return name;
		
	}
	public int getDateOfBirth () {
		return dateOfBirth;
	}
	
	public String toString() {
		return "Name " + name + "Address " + address + "Date of Birth " + dateOfBirth + "Weight " + weight + "Height " + height ;
	}
}
