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
public class Task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Result : ");
        int marks=input.nextInt();
        if(marks>50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Not pass");
        }
    }
    
}
