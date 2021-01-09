package javaPractice;

public class PyramidExample2 {
    public static void main(String[] args) {
        int term =6;
        for (int k = 1; k <= term; k++){
            for (int m = term; m >= k; m--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
