package assignment3;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = s.nextInt();

        if ((num % 2 == 0) || (num % 5 == 0)) {
            System.out.println("null");

        } else {
            System.out.println("\nYour Number is " + num);
        }

    }

}
