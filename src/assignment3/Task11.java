/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter numbers = ");
        
        
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        int c = myScan.nextInt();
        int d = myScan.nextInt();
        int e = myScan.nextInt();
        
        System.out.println("Sum = "+(a+b+c+d+e));
        System.out.println("Average = "+(a+b+c+d+e)/5);
        
    }
    
}
