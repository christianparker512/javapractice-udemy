import org.w3c.dom.ls.LSOutput;

public class Arithmetic {


    public static double pi = 3.14159;

    public static int add (int x, int y){
        return x + y;
    }
    public static int multiply(int x, int y){
        return x *y;
    }


    public static void main(String[] args) {

        System.out.println(add(5,4));
        System.out.println(pi);
        System.out.println(multiply(5,5));

    }
}

