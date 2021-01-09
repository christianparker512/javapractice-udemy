package javaPractice;

public class Store5 {
    //instance fields
    String productType;

    //constructor method
    public Store5(String product){
        productType = product;
    }
    //advertise method
    public void advertise(){
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }
    //main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        Store5 cookieShop = new Store5(cookie);
        cookieShop.advertise();
    }
    }

