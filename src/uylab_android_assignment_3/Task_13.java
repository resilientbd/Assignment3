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
public class Task_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads five numbers as input from the user, and prints 
        whether the numbers are odd or even. [Do NOT use loops]
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
        
        //condition for checking whether the first number is "even" or "odd"
        if (num1%2==0) {
            System.out.println("The first number "+num1+" is a Even number ");
        }
        else if (num1%2==1) {
            System.out.println("The first number "+num1+" is a Odd number ");
        }
        
        //condition for checking whether the second number is "even" or "odd"
        if (num2%2==0) {
            System.out.println("The second number "+num2+" is a Even number ");
        }
        else if (num2%2==1) {
            System.out.println("The second number "+num2+" is a Odd number ");
        }

            //condition for checking whether the third number is "even" or "odd"
        if (num3%2==0) {
            System.out.println("The third number "+num3+" is a Even number ");
        }
        else if (num3%2==1) {
            System.out.println("The third number "+num3+" is a Odd number ");
        }

            //condition for checking whether the fourth number is "even" or "odd"
        if (num4%2==0) {
            System.out.println("The fourth number "+num4+" is a Even number ");
        }
        else if (num4%2==1) {
            System.out.println("The fourth number "+num4+" is a Odd number ");
        }
        
            //condition for checking whether the five number is "even" or "odd"
        if (num5%2==0) {
            System.out.println("The five number "+num4+" is a Even number ");
        }
        else if (num5%2==1) {
            System.out.println("The five number "+num4+" is a Odd number ");
        }
    }
    
}
