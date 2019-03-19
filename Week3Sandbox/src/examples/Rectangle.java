package examples;

public class Rectangle {

	//Declare instance variables
	private double length;
	private double width;
	
	//Class constructors
	//Create a new Rectangle with no width or length set
	public Rectangle(){
		length=0;
		width=0;
	}
	
	//Create a new Rectangle with the width and length as the provided values
	public Rectangle(double aWidth, double aLength){
		width=aWidth;
		length=aLength;
	}
	
	//Set the width of the Rectangle
	void setWidth(double aWidth){
		width = aWidth;
	}
	
	//Get or return the width of the Rectangle
	double getWidth(){
		return width;
	}
	
	//Set the length of the Rectangle
	void setLength(double aLength){
		length = aLength;
	}
	
	//Get or return the width of the Rectangle
	double getLength(){
		return length;
	}
	
	//Return the area of the Rectangle
	double calculateArea(){
		return width * length;
	}
	
	//String representation of the object
	public String toString() {
		return length +" | " + width +" | " +this.calculateArea();
	}
		
	 /**
     * Print object description
     */
    public void  printMe()
    {
        System.out.println(this);
    }
}
