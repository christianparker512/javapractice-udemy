package javaPractice;

public class JavaSwitch {
    public static void main(String[] args) {
        int number = 37;
        switch (number) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("Not 1,2,3,4 or 20");
        }
    }
}