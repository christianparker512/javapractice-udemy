package MathFacts;

public class MathFacts {
    public MathFacts (){}

    public static int add (int a, int b){
        return a + b;
    }
    public static int minus (int a, int b){
        return a - b;
    }
    public static int times (int a, int b){
        return a * b;
    }


    public static void main(String[] args) {
        MathFacts addition = new MathFacts();
        System.out.println(add(5,5));
        System.out.println(minus(10,5));
        System.out.println(times(5, 5));

    }
}
