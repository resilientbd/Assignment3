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
public class Task_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads an integer, and if the number is even and
        greater than 10, prints “An even number greater than 10”. If the number is even but lesser
        than 10, print “An even number not greater than 10”. If the number is greater than 10 but
        odd, print “An odd number greater than 10”. If the number is odd and also less than 10,
        print “An odd number less than 10”.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
    
        if(num1%2==0) {
            if(num1>10) { 
            System.out.println("inputed number is an Even number and greater than 10");
            }
            else if(num1<10) {
            System.out.println("inputed number is an Even number but lesser than 10");    
            }
        }
        
        if(num1%2==1) {
            if(num1>10) { 
            System.out.println("inputed number is an Odd number and greater than 10");
            }
            else if(num1<10) {
            System.out.println("inputed number is an Odd number but lesser than 10");    
            }
        }
    }
    
}
