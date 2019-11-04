
package assignment3;

import java.util.Scanner;


public class Task18 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n= input.nextInt();
        
        for (int i = 1; i < n; i++) {
            
            if(i%2!=0 && i%5!=0)
            {
                System.out.print("\t"+i);
            }
        }
    }
    
}
