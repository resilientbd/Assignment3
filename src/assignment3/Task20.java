
package assignment3;

import java.util.Scanner;


public class Task20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of marks");
        int marks= input.nextInt();
        if(marks>50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("You shall not pass");
        }
    }
    
}
