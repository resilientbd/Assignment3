
package assignment3;

import java.util.Scanner;


public class Task14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value = ");
        int a= input.nextInt();
        
        if(a%2==0 && a>10){
            System.out.println("An even number greater than 10");
        }
        else if(a%2==0 && a<10)
        {
            System.out.println("An even number not greater than 10");
        }
        else if(a%2!=0 && a>10){
            System.out.println("An Odd number greater than 10");
        }
        else if(a%2!=0 && a<10)
        {
            System.out.println("An Odd number not greater than 10");
        }
    }
    
}
