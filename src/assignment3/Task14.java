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
public class Task14 {
      public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter The Even number = ");
           int num1 = input.nextInt();
            System.out.println("Enter The Odd number = ");
             int num2 = input.nextInt();
              if(num1%2==0 && num1>10){
                System.out.println("Greater than 10");
            }
            else if(num1%2==0 && num1<10){
                System.out.println("Not greater than 10");
            }
            if(num2%2!=0 && num2>10){
                System.out.println("Greater than 10 ");
            }
            else if(num2%2!=0 && num2<10){
                System.out.println("Not greater than 10");
            }
      }
    
    
}
