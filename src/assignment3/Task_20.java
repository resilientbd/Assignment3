
package assignment3;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        
        System.out.println("Enter Your Numbers = ");
        
        int num = MyScan.nextInt();
        if(num>50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
