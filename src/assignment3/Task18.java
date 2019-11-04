/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author AMITABH
 */
public class Task18 {
     public static void main(String[] args) {
     System.out. println("Enter the Number : ");
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
        if(a%2==1 || a%5==1){ 
              System.out. println("it is a multiple of NEITHER 2 NOR 5 ");
            
        }
        else
              {
                System.out. println(" it is not a multiple of NEITHER 2 NOR 5 ");
                }
     
     }
     
    
}
