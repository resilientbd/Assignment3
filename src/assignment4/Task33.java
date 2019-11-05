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
public class Task33 {
    
     public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        String car_name; 
        int car_number;
        
        System.out.print("Enter the car_name : ");
        car_name = scanner.next();
        
        System.out.print("Enter a car_number : ");
        car_number = scanner.nextInt();
        
        
        for(int i=0;i<4;i++){
            System.out.println(car_name);
        }
     }
}