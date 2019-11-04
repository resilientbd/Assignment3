/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,num4,num5;
        System.out.println("Enter the Five Value = ");
       num1 = input.nextInt();
       num2 = input.nextInt();
       num3 = input.nextInt();
       num4 = input.nextInt();
       num5 = input.nextInt();
       
       double f = (num1+ num2+ num3+ num4+ num5)/5;
       System.out.println("Toatal Average  value 0f = "+f);
       
        
        
        
        
    }
    
}
