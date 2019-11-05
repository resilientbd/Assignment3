
package assignment3;

import java.util.Scanner;


public class Task11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out. println("Enter the Number a: ");
        Scanner in = new Scanner(System.in);
        int a = in. nextInt();
        System.out. println("Enter the Number b: ");
        int b = in. nextInt();
        System.out. println("Enter the Number c: ");
        int c = in. nextInt();
        System.out. println("Enter the Number d: ");
        int d = in. nextInt();
        System.out. println("Enter the Number e: ");
        int e = in. nextInt();
        System.out. println("Enter total Number You enter: ");
        int f = in. nextInt();
        float avg;
        avg=(a+b+c+d+e)/f;
        System.out. println("Avg is: "+avg);
        
       
    }
    
}
