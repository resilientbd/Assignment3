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
public class Task20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Mark : ");
        int marks =scan.nextInt();
        
        if(marks>50){
        System.out.println("Pass");  
        }
        else {
            System.out.println("You shall not pass");  
        }

    }
}
