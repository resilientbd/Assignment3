package assignment3;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 5 number :");
        int a, b, c, d, e;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        if (c % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (d % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (e % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
