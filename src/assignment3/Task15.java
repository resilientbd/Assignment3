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
public class Task15 {
    
    public static void main(String[] args){
    
     
        
    Scanner scanner = new Scanner (System.in);    
    
     System.out.println("Enter the number: ");
  
     int number = scanner.nextInt();
      
        for(int i=1; i<=number ; i++)
        {
            if(i%2==0 || i%5==0)
                System.out.println("The number is = "+i);
        }
        
    }
}