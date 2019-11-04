package assignment3;

import java.util.Scanner;

public class task14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number  : ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            if (num > 10) {

                System.out.println("an even number is greater than 10 ");
            } else {

                System.out.println("an even number is not greater than 10 ");
            }
        } else {
            if (num > 10) {
                System.out.println("an odd number is greater than 10 ");
            } else {
                System.out.println("an odd number is not greater than 10 ");
            }

        }
    }

}
