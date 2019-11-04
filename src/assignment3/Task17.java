package assignment3;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = s.nextInt();

        if ((num % 2 == 0) && (num % 5 == 0)) {
            System.out.println("\nYour Number is " + num);

        } else {
            System.out.println("num");
        }

    }

}
