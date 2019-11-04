package assignment3;

import java.util.Scanner;

public class task20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter your number : ");
        int marks =scan.nextInt();
        
        if(marks>50){
        System.out.println("you are passed");  
    }
        else {
            System.out.println("you will not pass");  
        }

}
}