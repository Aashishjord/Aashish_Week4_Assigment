class FoodItem {
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayMenuItem() {
        System.out.println("Food Item: " + name);
        System.out.println("Price: $" + price);
    }
}


class Pizza extends FoodItem {
    public String size;
    public String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("=== Pizza ===");
        super.displayMenuItem();
        System.out.println("Size: " + size);
        System.out.print("Toppings: ");
        for (String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println("\n");
    }
}

// Subclass: Burger
class Burger extends FoodItem {
    private String cheese;
    private String pattyType;

    public Burger(String name, double price, String cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    public String getCheese(){
        return cheese;
    }

    public String getPattyType(){
        return pattyType;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("=== Burger ===");
        super.displayMenuItem();
        System.out.println("Cheese:"+getCheese());
        System.out.println("Patty Type: "+getPattyType());
    }
}

// Subclass: Salad
class Salad extends FoodItem {
    public String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

   @Override
public void displayMenuItem() {
    System.out.println("=== Salad ===");
    super.displayMenuItem();
    System.out.print("Ingredients: ");
    for (int i = 0; i < ingredients.length; i++) {
        System.out.print(ingredients[i] + " ");
    }
    System.out.println("\n");
}

}

public class FoodOrderApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pepperoni Pizza", 12.99, "Large", new String[]{"Onion", "Cheese", "WhitePaste"});
        Burger burger = new Burger("Beef Burger", 8.49,"yes", "Beef");
        Salad salad = new Salad("Greek Salad", 6.99, new String[]{"Lettuc", "Cucumber", "Olives", "Tomato"});

        pizza.displayMenuItem();
        burger.displayMenuItem();
        salad.displayMenuItem();
    }
}
