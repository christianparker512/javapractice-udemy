package javaPractice;

public class Store6 {
    //instance Field
    String productType;

//    constructor method
    public Store6(String product){
        productType = product;
    }
    //advertising method
    public void advertising (){
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }
    public static void main(String[] args) {
        Store6 lemonadeStand = new Store6("lemonade");
        lemonadeStand.greetCustomer("Christian");
        lemonadeStand.greetCustomer("Lisa");
        lemonadeStand.greetCustomer("Abby");
        lemonadeStand.advertising();
    }
}
