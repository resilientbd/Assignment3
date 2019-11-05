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
public class Task14 {
    
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
