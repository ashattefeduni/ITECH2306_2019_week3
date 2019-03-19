//Calculate the wage of a worker.  If they work overtime this is calculated at a higher rate.
package examples;

import java.util.Scanner;

public class CalculateWage {

	public static void main(String[] args) {
		//Declare local variable
		double hours, basicWage, overTime, wage;
		
		//Create a Scanner to obtain input
		Scanner in = new Scanner(System.in);
		
		//Prompt the user for the number of hours worked
		System.out.println("Enter the number of hours worked: ");
		hours = in.nextDouble();
		
		//Calculate the wages
		if (hours > 35) {
			basicWage = 35 * 20;
			overTime = (hours-35) * 30;
			wage = basicWage + overTime;
		}
		else {
			wage = hours * 20;
		}

		//Display the wage
		System.out.println("The wage is: " +wage);
		
		//Close the Scanner 
		in.close();

	}

}
