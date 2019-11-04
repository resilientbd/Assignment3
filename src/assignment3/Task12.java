package assignment3;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enet Number : ");
        int num1 = s.nextInt();

        int result = (num1 * (num1 + 1) / 2);
        System.out.println("sum of these positive number is : " + result);
    }

}
