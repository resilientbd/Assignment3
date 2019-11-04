/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task12 {
    
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner (System.in);
        
         int number_1, result;
    
      System.out.println("Enter the number: ");
      number_1 = scanner.nextInt();
      
      result = (number_1 * (number_1 + 1) / 2);
      
      System.out.println(" the number is : " + result);
        
    }
}
