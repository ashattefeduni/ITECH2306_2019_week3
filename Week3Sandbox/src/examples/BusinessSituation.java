//Calculate the price of an item.  Members receive 20% on all items.
package examples;
import java.util.Scanner;

public class BusinessSituation {

	public static void main(String[] args) {
		//Calculate price dependent on whether the buyer is a member
		//If the buyer is a member provide an 80% discount
		
		//Create a Scanner to obtain input
		Scanner in = new Scanner(System.in);
		
		//Declare variables to store price, charge and membership status
		double price, charge;
		boolean memberStatus;
		
		
		//Prompt the user for the price of the item they are purchasing
		System.out.println("Enter the marked price of the item: ");
		//Store the price
		price = in.nextDouble();
		
		//Prompt the user to see if they are a member
		System.out.println("Are you a member? Enter TRUE for yes");
		//Obtain a single character from input
		memberStatus = in.nextBoolean();
		
		if (memberStatus) {
			charge = price * 0.8;
		}
		else {
			charge = price;
		}
		
		//Report the price
		System.out.println("Final charge is " +charge);
		
		//Close the input Scanner
		in.close();		

	}

}
