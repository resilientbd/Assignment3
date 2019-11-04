package assignment3;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your 1st number  : ");
        int num1 =scan.nextInt();
        
         System.out.print("enter your 2nd number  : ");
        int num2 =scan.nextInt();
        
         System.out.print("enter your 3rd number  : ");
        int num3 =scan.nextInt();
        
         System.out.print("enter your 4th number  : ");
        int num4 =scan.nextInt();
        
         System.out.print("enter your 5th number  : ");
        int num5 =scan.nextInt();
        
        int sum = num1+num2+num3+num4+num5;
        
        System.out.println("\n Average number is : "+(sum/5));
            
        }
    }


