package assignment3;

import java.util.Scanner;

public class task12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your number : ");
        int num1 =scan.nextInt();
        
        int result = (num1*(num1+1)/2);
        System.out.println("sum of those positave number is : "+result);
    }

}
