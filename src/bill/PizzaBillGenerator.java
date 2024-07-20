package bill;

import java.util.Scanner;

public class PizzaBillGenerator {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Define pizzas
	        Pizza vegPizza = new Pizza("Veg Pizza", 300);
	        Pizza nonVegPizza = new Pizza("Non-Veg Pizza", 400);
	        Pizza deluxVegPizza = new Pizza("Delux Veg Pizza", 550);
	        Pizza deluxNonVegPizza = new Pizza("Delux Non-Veg Pizza", 650);

	        System.out.println("--Welcome to Pizzamania---");
	        System.out.println("Which pizza: (1.Veg Pizza 2.Non-Veg Pizza 3.Delux Veg Pizza 4.Delux Non-Veg Pizza) =>");
	        int pizzaType = scanner.nextInt();

	        // Get the selected pizza
	        Pizza selectedPizza = null;
	        boolean askExtraOptions = true;

	        switch (pizzaType) {
	            case 1:
	                selectedPizza = vegPizza;
	                break;
	            case 2:
	                selectedPizza = nonVegPizza;
	                break;
	            case 3:
	                selectedPizza = deluxVegPizza;
	                askExtraOptions = false;
	                break;
	            case 4:
	                selectedPizza = deluxNonVegPizza;
	                askExtraOptions = false;
	                break;
	            default:
	                System.out.println("Invalid pizza type selected.");
	                System.exit(0);
	        }

	        // Get extra options
	        boolean extraCheese = false;
	        boolean extraToppings = false;
	        boolean takeAway = false;

	        if (askExtraOptions) {
	            System.out.println("Want Extra Topping (y/n)? =>");
	            char extraTopping = scanner.next().charAt(0);
	            if (extraTopping == 'y' || extraTopping == 'Y') {
	                extraToppings = true;
	            }

	            System.out.println("Extra cheese (y/n)? =>");
	            char extraCheeseInput = scanner.next().charAt(0);
	            if (extraCheeseInput == 'y' || extraCheeseInput == 'Y') {
	                extraCheese = true;
	            }
	        }

	        // Ask for take away
	        System.out.println("Want TakeAway (y/n)? =>");
	        char takeAwayInput = scanner.next().charAt(0);
	        if (takeAwayInput == 'y' || takeAwayInput == 'Y') {
	            takeAway = true;
	        }

	        // Create order and print receipt
	        Order order = new Order(selectedPizza, extraCheese, extraToppings, takeAway);
	        order.printReceipt();

	        // Thank you message
	        System.out.println("\nThank you!!!! Visit Again.....");

	        scanner.close();

	}

}
