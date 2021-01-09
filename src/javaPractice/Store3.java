package javaPractice;


public class Store3 {
    //instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;

    //constructor method
    public Store3 (String product, int inventory, double price){
        productType = product;
        inventoryCount = inventory;
        inventoryPrice = price;
    }

    public static void main(String[] args) {
        Store3 cookieShop = new Store3("cookies", 12, 3.75);
        System.out.println(cookieShop);
    }
}
