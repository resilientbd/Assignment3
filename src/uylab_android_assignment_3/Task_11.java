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
public class Task_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads five numbers from the user, and prints their 
        average. [Do NOT use loops]
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3=sc.nextInt();
        System.out.println("Enter the fourth number: ");
        int num4=sc.nextInt();
        System.out.println("Enter the fifth number: ");
        int num5=sc.nextInt();
        int avrg=(num1+num2+num3+num4+num5)/5;
        System.out.println("Average of the inputed numbers is "+avrg);
    }
    
}
