
package assignment3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Numbers = ");
        
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        int c = myScan.nextInt();
        int d = myScan.nextInt();
        int e = myScan.nextInt();
        
        System.out.println("Sum = "+(a+b+c+d+e));
        System.out.println("Avarege = "+(a+b+c+d+e)/5);
    }
}
