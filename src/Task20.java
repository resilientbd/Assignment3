
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
public class Task20 {
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks =s.nextInt();
        
        if(marks>50){
            System.out.println("Pass");
        }else{
            System.out.println("You shall not pass");
        }
    }
    
}
