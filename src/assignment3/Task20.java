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
public class Task20 {
    
    
    public static void main(String[] args){
    
     
        
    Scanner scanner = new Scanner (System.in);    
    
    int marks;
   
    System.out.println("Enter the number: ");
    marks = scanner.nextInt();
      
    if(marks>50){
    System.out.println("Pass");
    }  
    else{
    System.out.println("Not Pass ");
    }
      
    }
    
}
