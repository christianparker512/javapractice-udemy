package BillsBurgers;

public class Main {
    public static void main(String[] args) {
    Hamburger hamburger = new Hamburger ("Basic", "beef", 7.99, "Sesame");
        System.out.println(hamburger);
    double price = hamburger.itemizeHamburger();
        System.out.println("You just ordered a a new burgers");
    hamburger.addHamburgerAddition1("cheese", .50);
    hamburger.addHamburgerAddition2("grilled onions", .75);
    hamburger.addHamburgerAddition3("avocado", .99);
        System.out.println("The total price of the burger is " + hamburger.itemizeHamburger());
    HealthyBurger healthyBurger = new HealthyBurger("Turkey", 8.99);
    healthyBurger.addHamburgerAddition1("avocado", .99);
    healthyBurger.addHamburgerAddition2("havarti", .50);
    }

}
