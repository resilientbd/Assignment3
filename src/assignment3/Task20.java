
package assignment3;

import java.util.Scanner;


public class Task20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Student marks = ");
        int   a= input.nextInt();
        
        if(a>50)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("You shat not pass");
        }
        
    }
    
}
