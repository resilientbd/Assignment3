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
public class Task19 {
    public static void main(String[] args) {
     System.out. println("Enter the Number : ");
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
        if(a%2==1 || a%5==1){ 
              System.out. println("it is NOT  a multiple of 2OR  NOT a multiple of 5 ");
            
        }
        else
              {
                System.out. println(" it is  a multiple of 2OR a multiple of 5 ");
                }
     
     }
    
}
