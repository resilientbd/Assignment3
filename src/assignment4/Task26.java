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
public class Task26 {
    
     public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int hour, tk;
       
        System.out.print("Enter the weekly work hour : ");
        hour = scanner.nextInt();
        
        if(hour<=40){
            
            tk = 200 * hour;
            System.out.println(" weekly Salary is : "+ tk);
        }
        else{
            tk = 300 * hour + 8000;
            System.out.println(" weekly Salary is : "+ tk);
        }
        
    }
    
}
