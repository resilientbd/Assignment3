/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task35 {
    
      public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        int number, result;
        
        System.out.print("Enter the number of published articles for one writer = ");
        number = scanner.nextInt();
        
        result = number * 500;
        System.out.println("Your Monthly fees is : "+ result);
        
    }
}
