package assignment3;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int num1, num2, num3, num4, num5;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num1 = s.nextInt();

        System.out.print("Enter Number : ");
        num2 = s.nextInt();

        System.out.print("Enter Number : ");
        num3 = s.nextInt();

        System.out.print("Enter Number : ");
        num4 = s.nextInt();

        System.out.print("Enter Number : ");
        num5 = s.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is Even");
        } else {
            System.out.println(num1 + " is Odd");
        }

        if (num2 % 2 == 0) {
            System.out.println(num2 + " is Even");
        } else {
            System.out.println(num2 + " is Odd");
        }

        if (num3 % 2 == 0) {
            System.out.println(num3 + " is Even");
        } else {
            System.out.println(num3 + " is Odd");
        }

        if (num4 % 2 == 0) {
            System.out.println(num4 + " is Even");
        } else {
            System.out.println(num4 + " is Odd");
        }

        if (num5 % 2 == 0) {
            System.out.println(num5 + " is Even");
        } else {
            System.out.println(num5 + " is Odd");
        }

    }

}
