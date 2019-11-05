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
public class Task13 {
    
     public static void main(String[] args){
         
      Scanner input = new Scanner(System.in);
      
      int num1,num2,num3,num4,num5;
      
      System.out.println("Enter the Five Value = ");
      
       num1 = input.nextInt();
       num2 = input.nextInt();
       num3 = input.nextInt();
       num4 = input.nextInt();
       num5 = input.nextInt();
       
    if ( num1 % 2 == 0)
        System.out.println(num1+ " is even");
    else
        System.out.println(num1+ " is odd");
    if ( num2 % 2 == 0 )
       System.out.println(num2+ " is even");
    else
        System.out.println(num2+ " is odd");
    if ( num3 % 2 == 0 )
        System.out.println(num3+ " is even");
    else
        System.out.println(num3+ " is odd");
    if ( num4 % 2 == 0 )
        System.out.println(num4+ " is even");
    else
       System.out.println(num4+ " is odd");
    if ( num5 % 2 == 0 )
        System.out.println(num5+ " is even");
    else
       System.out.println(num5+ " is odd");
      
    }
}
