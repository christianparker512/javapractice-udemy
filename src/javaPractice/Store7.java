package javaPractice;

public class Store7 {
//    instance field
    String productType;
    double price;

    //constructor method
    public Store7(String product, double initialPrice){
        productType = product;
        price = initialPrice;
    }
//   increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    public static void main(String[] args) {
        Store7 lemonadeStand = new Store7("lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}

/*
We have added a price instance field to the Store class.

However, to combat inflation costs, we’ve found ourselves increasing the price of our product over and over. We’ve added an empty increasePrice() method to the Store class. It takes a double parameter priceToAdd.

Inside of the increasePrice() method, create a variable called newPrice. Declare it to be a double, and set it equal to the price plus the priceToAdd.

Checkpoint 2 Passed
2.
Inside of increasePrice(), set the instance field price to be newPrice!

Checkpoint 3 Passed
3.
In the main() method, increase the price at the lemonade stand by 1.5. Then, print the lemonadeStand.price to see how it has changed!
 */