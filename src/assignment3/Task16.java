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
public class Task16 {
     public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
          System.out.println("Enter number : ");
          int  num = s.nextInt();
          
          if((num %2 ==0)&&(num %5==0)){
                System.out.println("");
          }
          else if(num %2 ==0){
                System.out.println("The  number is  multiple 2");
          }
          else if(num %5 ==0){
                System.out.println("The  number is  multiple 5");
          }
         
    }
}