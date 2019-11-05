/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author MDZAKARIA
 */
public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number... ");
        int num = scan.nextInt();

        if (num % 2 == 0) {

            if (num % 5 == 0) {
                System.out.println(" Multiple of both 2 and 5");
            } else {
                System.out.println("This is 2");
            }

        }
        if (num % 5 == 0) {

            if (num % 2 == 0) {
                System.out.println("both 2 and 5");
            } else {
                System.out.println("This is 2");
            }

        }

    }
}
