package Strings;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/n]");
        String userInput = sc.next();
        if(userInput.equals("y")){
            System.out.println("Okay, let's go");
        } else {
            System.out.println("bye");
        }
    }


}
