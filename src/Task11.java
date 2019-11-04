
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int num1= s.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int num2= s.nextInt();
        
        System.out.print("Enter 3rd number : ");
        int num3= s.nextInt();
        
        System.out.print("Enter 4th number : ");
        int num4= s.nextInt();
        
        System.out.print("Enter 5th number : ");
        int num5= s.nextInt();
        
        int sum = num1+num2+num3+num4+num5;
        System.out.println("\nAverage number is : "+(sum/5));
    }
    
}
