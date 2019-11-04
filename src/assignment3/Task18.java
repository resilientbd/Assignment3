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
public class Task18 {
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter The Value : ");
          int  num = sc.nextInt();
          for(int n=1;n<=num;n++)
          {
              if(n%2!=0 && n%5!=0)
              {
                 
                      System.out.println("Integer number = "+n);
              }
          
          }
    }
    
}

