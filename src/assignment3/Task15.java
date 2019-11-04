/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task15 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = input.nextInt();
        
      for(int i=1; i<=a; i++){
          
          if(i%2==0 || i%5==0)
          {
              System.out.print("\t"+i);
          }
        }
        
        
        
        
        
    }
}
