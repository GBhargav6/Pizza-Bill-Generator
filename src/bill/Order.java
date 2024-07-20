package bill;

public class Order {
	private Pizza pizza;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    private static final int EXTRA_CHEESE_PRICE = 100;
    private static final int EXTRA_TOPPINGS_PRICE = 150;
    private static final int TAKE_AWAY_PRICE = 20;

    public Order(Pizza pizza, boolean extraCheese, boolean extraToppings, boolean takeAway) {
        this.pizza = pizza;
        this.extraCheese = extraCheese;
        this.extraToppings = extraToppings;
        this.takeAway = takeAway;
    }

    public int calculateTotal() {
        int total = pizza.getPrice();
        if (extraCheese) {
            total += EXTRA_CHEESE_PRICE;
        }
        if (extraToppings) {
            total += EXTRA_TOPPINGS_PRICE;
        }
        if (takeAway) {
            total += TAKE_AWAY_PRICE;
        }
        return total;
    }

    public void printReceipt() {
        System.out.println("\nPizza: " + pizza.getPrice());
        if (extraCheese) {
            System.out.println("Extra Cheese: " + EXTRA_CHEESE_PRICE);
        }
        if (extraToppings) {
            System.out.println("Extra Toppings: " + EXTRA_TOPPINGS_PRICE);
        }
        if (takeAway) {
            System.out.println("Take away: " + TAKE_AWAY_PRICE);
        }
        System.out.println("Total Amount: " + calculateTotal());
    }
}
