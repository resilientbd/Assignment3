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
public class Task16 {
    
    public static void main(String[] args){
    
     
        
    Scanner scanner = new Scanner (System.in);    
    
      int number;
   
      System.out.println("Enter the number: ");
      number = scanner.nextInt();
     
        for(int i=1; i<=number; i++){
        if(i%2==0 || i%5==0)
        {
            if(i%2==0 && i%5==0)
            {
                int x=i;
            }
            else
                System.out.println("The numbers are = "+i);
                
            
        }
        
       
    }  
    
    
    }
    
    
}
