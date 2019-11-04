package assignment3;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your 1st number  : ");
        int num1 =scan.nextInt();
        
         System.out.print("enter your 2nd number  : ");
        int num2 =scan.nextInt();
        
        System.out.print("enter your 3nd number  : ");
        int num3 =scan.nextInt();
        
        System.out.print("enter your 4th number  : ");
        int num4 =scan.nextInt();
        
        System.out.print("enter your 5th number  : ");
        int num5 =scan.nextInt();
        
        if(num1% 2 == 0){
        System.out.println( num1 + " is even");
        }
        else{
        System.out.println( num1+ " is odd");
            
        }
        
         if(num2% 2 == 0){
        System.out.println( num2 + " is even");
        }
        else{
        System.out.println( num2+ " is odd");
            
        }
          if(num3% 2 == 0){
        System.out.println( num3 + " is even");
        }
        else{
        System.out.println( num3+ " is odd");
            
        }
           if(num4% 2 == 0){
        System.out.println( num4 + " is even");
        }
        else{
        System.out.println( num4+ " is odd");
            
        }
            if(num5% 2 == 0){
        System.out.println( num5 + " is even");
        }
        else{
        System.out.println( num5+ " is odd");
            
        }
    }

}
