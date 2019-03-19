package examples;

import java.util.Scanner;

public class Week2Test {

	
	public static void main(String[] args) {
		Person jane = new Person();
		int x = 10;
		
		jane.setName("Jane Do");
		jane.setWeight(60);
		jane.setAddress("Ballarat");
		jane.setDateOfBirth(1980);
		jane.setHeight(168);
		jane.setWeight(60);
		
		
		Person kathleen = new Person("Kathleen", 1967, "Ballarat", 168.0, 70.0);
		System.out.println(jane.getHeight());
		
		System.out.println(kathleen.toString());
		System.out.println(jane.toString());
		
		jane.setHeight(180);
		System.out.println(jane.toString());
		Scanner s = new Scanner(System.in);
		//s.nextInt();// read input
	}

}
