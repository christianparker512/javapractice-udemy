package javaPractice;

public class Store1 {
    String productType;

    // new method: constructor!
    public Store1(String product) {
        System.out.println("I am inside the constructor method.");
       productType = product;
    }

    // main method is where we create instances!
    public static void main(String[] args) {
        System.out.println("Start of the main method.");

        // create the instance below
//        Store1 lemonadeStand = new Store1();

        // print the instance below
//        System.out.println(lemonadeStand);
    }
}