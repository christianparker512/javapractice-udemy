package javaPractice;

public class Store2 {
    //instance fields
    String productType;

//    constructor method
    public Store2 (String product){
        productType = product;
    }

//    main method

    public static void main(String[] args) {
        Store2 lemonadeStand = new Store2("lemonade");
        System.out.println(lemonadeStand.productType);
    }
}
