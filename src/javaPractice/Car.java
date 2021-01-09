package javaPractice;

public class Car {
    int year = 2001;
    String make = "Jaguar";
    String model = "XKR";
    String color = "Silver";
    boolean isConvertible = true;
    int cupHolders = 2;

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.year);
        System.out.println(myCar.color);
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println("It's a convertible? :" + myCar.isConvertible);
        System.out.println("How many cup holders does it have? :" + myCar.cupHolders);

    }
}

