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
public class Task11 {
    
    public static void main (String[] args){
        
    Scanner scanner = new Scanner (System.in);    
    
    int number1, number2, number3, number4, number5, result;
    
      System.out.println("Enter the first number: ");
      number1 = scanner.nextInt();
        
      System.out.println("Enter the second number: ");
      number2 = scanner.nextInt();
      
      System.out.println("Enter the first number: ");
      number3 = scanner.nextInt();
        
      System.out.println("Enter the second number: ");
      number4 = scanner.nextInt();
      
      System.out.println("Enter the second number: ");
      number5 = scanner.nextInt();
        
  
        result = (number1 + number2 + number3 + number4  + number5) / 5;
        System.out.println("sum = " +result);
    
    }
    
}
