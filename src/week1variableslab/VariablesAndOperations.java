package week1variableslab;

public class VariablesAndOperations {
	
	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats on a flight
		int availablePlaneSeats = 5;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceriesAtCheckout = 35.90; 
		
		//create a variable to hold a person's middle initial
		char personsMiddleInitial = 'J'; 
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		String firstName = "Troy"; 
		
		//create a variable to hold a street address
		String streetAddress = "6014 73rd Street"; 
		
		//print all variables to console
		System.out.println("Available Seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceriesAtCheckout + " is the cost of groceries");
		System.out.println(personsMiddleInitial + " is my middle initial");
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + firstName);
		System.out.println(streetAddress + " is where the person lives"); 
		
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceriesAtCheckout += 2.15; 
		System.out.println(costOfGroceriesAtCheckout);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		personsMiddleInitial = 'K';
		System.out.println(personsMiddleInitial);
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		isHotOutside = !isHotOutside; 
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial and a last name of your choice
		String fullName = firstName + " " + personsMiddleInitial + " Williams";
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("This is " + firstName + " and they live at " + streetAddress);
	}

}
