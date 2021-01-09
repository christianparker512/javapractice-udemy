package javaPractice;

public class GradingExample {
    public static void main(String[] args) {
        int marks = 65;
        if (marks <50){
            System.out.println("fail");
        }
        else if (marks >= 50 && marks < 60){
            System.out.println("You got a D");
        } else if (marks >=60 && marks < 70){
            System.out.println("You got a C");
        }
    }
}
