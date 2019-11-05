/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task27 {
    
    public static void main(String[] args){
        
       
        Scanner scanner = new Scanner(System.in);
                
        int  hour, minute, second;
        
	System.out.print("Enter the second : ");

	second = scanner.nextInt(); 

	hour = second % 60;
	minute = second / 60;
	second = minute % 60;

	minute = minute / 60;
        
        System.out.print("HH:MM:SS = " +minute + ":" + second + ":" + hour);
        System.out.print("\n");
        }
    
}
