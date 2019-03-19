//Obtain from the user the age of a person and then display what type of person they are
package examples;

import java.util.Scanner;


public class AgeDescription {

	public static void main(String[] args) {
		//Declare local variables
		int age;
				
		//Create a Scanner to obtain input
		Scanner in = new Scanner(System.in);
		
		//Prompt the user for the age of the person
		System.out.println("Enter the age of the person : ");
		age = in.nextInt();
		
		//Calculate the ages
		if (age >= 18) {
			System.out.println("The person is an adult");
		}
		else if (age >= 13){
			System.out.println("The person is an adolescent");
		}
		else {
			System.out.println("The person is a minor");
		}


						
		//Close the Scanner 
		in.close();

	}

}
