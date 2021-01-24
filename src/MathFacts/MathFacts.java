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
    public static int squared (int a){
        return a * a;
    }
    public static double divide (double a, double b){
        return a/b;
    }
    public static double average (int[] nums){
        double currentTotal = 0;
        int length = nums.length;
        for(int i = 0; i<nums.length; i++){
            currentTotal += nums[i];
        }
        return currentTotal/length;
    }
    public static double average (double[] nums){
        double currentTotal = 0;
        int length = nums.length;
        for(int i = 0; i<nums.length; i++){
            currentTotal += nums[i];
        }
        return currentTotal/length;
    }


    public static void main(String[] args) {
        MathFacts addition = new MathFacts();
        System.out.println(add(5,5));
        System.out.println(minus(10,5));
        System.out.println(times(5, 5));
        System.out.println(squared(6));
        System.out.println(divide(42,5));
        int average1 [] ={1,2,3,4,5,6,7,9,10};
        double average2 [] = {2,4,6,8,10,12,14,16,20};
        System.out.println(average(average1));
        System.out.println(average(average2));


    }
}
