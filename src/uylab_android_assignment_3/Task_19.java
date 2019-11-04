/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uylab_android_assignment_3;

import java.util.Scanner;

/**
 *
 * @author RIYAD Patwary
 */
public class Task_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads an integer, and prints the integer if it is NOT a
        multiple of 2 OR NOT a multiple of 5.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
        
        if(num1%2 != 0) {
            if(num1%5 != 0)
            System.out.println("the number is a multiple of NEITHER 2 NOR 5");
        }
    }
    
}
