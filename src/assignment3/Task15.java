package assignment3;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("\nYour number is " + num);

        } else {
            if (num % 5 == 0) {
                System.out.println("\nYour number is " + num);

            } else {
                System.out.println("\nYour number is not multiple of either 2 or 5");
            }

        }

    }

}
