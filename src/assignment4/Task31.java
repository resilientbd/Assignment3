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
public class Task31 {
    
    public static void main(String[] args){
    
    
        Scanner scanner = new Scanner(System.in);
        
        String course_name;
        float credits_number, amount, total=0;; 
        int course_number;
        
        
        System.out.print("Enter the total course number = ");
        course_number = scanner.nextInt();
        
        for (int i = 1 ; i <= course_number; i++) {
            
            System.out.println("Input Course: "+i+" name (space) credits:");
            
            course_name = scanner.next();
            credits_number = scanner.nextFloat();
            total += credits_number;
        }
        
        System.out.print("Input amount per credits : ");
        amount = scanner.nextFloat();
        
        System.out.println("Total Payable:" +(amount*total));
        
        
        
    }
    
}
