package javaPractice;

public class DoubleDateCheck {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal * tax;
        double perPerson = (total + subtotal)/4;
        System.out.println("The total bill is $" + total + subtotal);
        System.out.println("The cost per person is $" +perPerson);
    }
}

