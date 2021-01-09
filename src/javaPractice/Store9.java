package javaPractice;


    public class Store9 {
        // instance fields
        String productType;
        String lemonadeStand;

        // constructor method
        public Store9(String product) {
            productType = product;
        }

        // main method
        public static void main(String[] args) {

            Store9 lemonadeStand = new Store9("lemonade");
            System.out.println(lemonadeStand.productType);

        }
    }

