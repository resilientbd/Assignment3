package assignment3;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1 = s.nextInt();

        System.out.println("Enter 2nd Number : ");
        int num2 = s.nextInt();

        System.out.println("Enter 3rd Number : ");
        int num3 = s.nextInt();

        System.out.println("Enter 4th Number : ");
        int num4 = s.nextInt();

        System.out.println("Enter 5th Number : ");
        int num5 = s.nextInt();

        if (num1 % 2 == 0) {

            System.out.println(num1 + "is Evwe");

        } else {
            System.out.println(num1 + "is odd");

            if (num2 % 2 == 0) {

                System.out.println(num2 + "is Evwe");

            } else {
                System.out.println(num2 + "is odd");
            }

            if (num3 % 2 == 0) {

                System.out.println(num3 + "is Evwe");

            } else {
                System.out.println(num3 + "is odd");
            }
            if (num4 % 2 == 0) {

                System.out.println(num4 + "is Evwe");

            } else {
                System.out.println(num4 + "is odd");
            }
            if (num5 % 2 == 0) {

                System.out.println(num5 + "is Evwe");

            } else {
                System.out.println(num5 + "is odd");
            }
        }

    }
}
