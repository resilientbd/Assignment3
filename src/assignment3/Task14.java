package assignment3;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = s.nextInt();
        if (num % 2 == 0) {
            if (num > 10) {
                System.out.println("An even number qreater than 10");

            } else {
                System.out.println("An odd number qreater is not qreater than 10 ");

            }
        } else {

            if (num > 10) {
                System.out.println("An odd number qreater than 10");

            } else {
                System.out.println("An odd number is not qreater than 10 ");
            }
        }
    }

}
