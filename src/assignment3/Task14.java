
package assignment3;

import java.util.Scanner;


public class Task14 {
     public static void main(String[] args) {
     System.out. println("Enter the Number a: ");
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
       if (a%2==0 ){
               
             System.out. println("a is even ");
             
             {if(a>10){
             System.out. println("An even number greater than 10 ");
             }else
             {
             System.out. println("An even number not greater than 10 ");
             }}
        }
        else{
             System.out. println("a is odd ");
             {if(a>10){
           System.out. println("An odd number greater than 10 ");
             }else
             {
             System.out. println("An odd number less than 10 ");
             }}
             
        }
        
     
     }
    
}
