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
public class Task18 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Number .... ");
        int num = scan.nextInt();

        if ((num % 2 == 0) || (num % 5 == 0)) {
            System.out.println("Not Available");
        } else {

            System.out.println("Number is =  " + num);
        }
    }

}
