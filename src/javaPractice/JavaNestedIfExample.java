package javaPractice;

//*** This is a nested if Statement
public class JavaNestedIfExample {
    public static void main(String[] args) {
        int age=20;
        int weight = 20;
        if (age >18){
            if (weight >50){
                System.out.println("You're eligible to donate blood");
            } else {
                System.out.println("You're not eligible. I'm sorry.");
            }
        }
    }
}
