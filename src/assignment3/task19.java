package assignment3;

import java.util.Scanner;

public class task19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter your number : ");
        int num = scan.nextInt();

        if (num % 2 == 0) {

            if (num % 5 == 0) {
                System.out.println("your number is multiple of both 2 and 5");
            } else {
                System.out.println("your number is only 2");
            }

        }
        if (num % 5 == 0) {

            if (num % 2 == 0) {
                System.out.println("your number is multiple of both 2 and 5");
            } else {
                System.out.println("your number is only 2");
            }

        }

    }
}
