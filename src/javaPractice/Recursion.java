package javaPractice;

public class Recursion {
    public static void count (int n){
        if (n<=0){
            System.out.println("All Done!");
            return;
        }
        System.out.println(n);
        count(n-1);
    }
    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        count(5);
        getPower(5,5);
    }
}
