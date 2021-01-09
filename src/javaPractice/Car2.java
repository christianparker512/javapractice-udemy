package javaPractice;

public class Car2 {
    //instance fields
    String color;
    int milesDriven;
    public Car2 (String carColor){
        color = carColor;
        milesDriven = 71000;
    }
    public void drive(){
        String message = "Miles driven :" + milesDriven;
        System.out.println(message);
    }
    public void startEngine(){
        System.out.println("Starting the car!");
        System.out.println("Vroom");
    }

    public static void main(String[] args) {
        Car2 myJaguar = new Car2("Silver");

        myJaguar.startEngine();
        myJaguar.drive();



    }
}
