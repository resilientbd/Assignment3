package assignment3;

import java.util.Scanner;

public class task15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number  : ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("\n your number is " + num);
        } else if (num % 5 == 0) {

            System.out.println("\n your number is " + num);
        } else {

            System.out.println("\n your number is not multiple of either 2 or 5");
        }

    }
}
