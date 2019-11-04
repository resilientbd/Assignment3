
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Task15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = scan.nextInt();
        
        if (num % 2   == 0){
           System.out.println(" your number is"+ num);
        }else if (num % 5== 0 ){
            
            System.out.println ("your number is "+num);
        }else{
             
            System.out.println("your number is not multple of either 2 or 5");
           
            
        }
    }
    
}
