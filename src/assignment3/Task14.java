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
public class Task14 {
    
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner (System.in);
        
        int number;

        System.out.println("Enter the number: ");
        number = scanner.nextInt();        
        
        if(number%2==0 && number>10){
        System.out.println("the number is even and greater than 10”.");
        }
        else if (number%2==0 && number<10){
        System.out.println(" the number is even and not greater than 10");
        }
        
        if(number%2!=0 && number<10){
        System.out.println("the number is odd and not greater than 10”.");
        }
        else if (number%2!=0 && number>10){
        System.out.println(" the number is odd and greater than 10");
        }
    
    }
}
