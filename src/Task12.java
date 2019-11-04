
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
public class Task12 {
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your number : ");
        int num1 =scan.nextInt();
        int result = (num1*(num1+1)/2);
        System.out.println("sum of those postive number:"+result);
    }
    
}
