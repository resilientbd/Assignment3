package assignment3;

import java.util.Scanner;

public class task16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter number  : ");
        int num = scan.nextInt();

        if ((num % 2 == 0) && ( num % 5 == 0)) {
            System.out.println(" Null ");
        } 
        else if (num % 2 == 0) {

            System.out.println( num + " your number is multiple of 2");
        }
         else if (num % 5 == 0) {

            System.out.println( num + " your number is multiple of 5");
        }
        else {

            System.out.println("Null");
        }

    }
}
