
import java.util.Scanner;


public class Task12 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int num1= s.nextInt();
        
        int result = (num1*(num1+1)/2);
        System.out.print("Somr of positive number is : "+result);
        
    }
    
}
