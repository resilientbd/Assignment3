package assignment3;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = s.nextInt();

        if (num % 2 == 0) {
            if (num % 5 == 0) {
                System.out.println("Your Number is multiple of both 2 and 5");

            } else {
                System.out.println("Your Number is only multiple of 2");

            }
        } else if (num % 5 == 0) {
            if (num % 2 == 0) {

                System.out.println("Your Number is multiple of both 2 and 5");
            } else {
                System.out.println("Your Number is only multiple of 5");

            }
        } else {
            System.out.println("null");

        }

    }

}
