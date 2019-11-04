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
public class Task13 {
    
      public static void main (String[] args){
    
     Scanner scanner = new Scanner(System.in);
     
     int number1, number2, number3, number4, number5;
     
        System.out.print("Enter 1st number: ");
        number1 = scanner.nextInt();
        
        System.out.print("Enter 2nd number: ");
        number2 = scanner.nextInt();
        
        System.out.print("Enter 3rd number: ");
        number3 = scanner.nextInt();
        
        System.out.print("Enter 4th number: ");
        number4 = scanner.nextInt();
        
        System.out.print("Enter 5th number: ");
        number5 = scanner.nextInt();
        
        if(number1 % 2 == 0)
            System.out.println(number1 + " number is even");
        else
            System.out.println(number1+ " number is odd");
        
        if(number2 % 2 == 0)
            System.out.println(number2 + " number is even");
        else
            System.out.println(number2+ " number is odd");
        
        if(number3 % 2 == 0)
            System.out.println(number3 + " number is even");
        else
            System.out.println(number3+ " number is odd");
        
        
        if(number4 % 2 == 0)
            System.out.println(number4 + " number is even");
        else
            System.out.println(number4+ " number is odd");
        
        
        if(number5 % 2 == 0)
            System.out.println(number5 + " number is even");
        else
            System.out.println(number5+ " number is odd");
    
}
    
}
