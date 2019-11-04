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
public class Task_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads a student’s mark for a single subject, and
        prints out “Pass” if the student got more than 50, and “You shall not pass” otherwise.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mark for a single subject: ");
        int num1=sc.nextInt();
        if (num1 > 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("You shall not pass");
        }
    }
    
}
