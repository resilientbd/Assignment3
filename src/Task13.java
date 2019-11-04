
import java.util.Scanner;

public class Task13 {
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
        
        if (num1 % 2==0){
            System.out.println(num1 + "is Even");  
        }else{
            System.out.println(num1 + "is odd");
        }
        if (num2 % 2==0){
            System.out.println(num2 + "is Even");  
        }else{
            System.out.println(num2 + "is odd");
        }
        if (num3 % 2==0){
            System.out.println(num3 + "is Even");  
        }else{
            System.out.println(num3 + "is odd");
        }
        if (num4 % 2==0){
            System.out.println(num4 + "is Even");  
        }else{
            System.out.println(num4 + "is odd");
        }
        if (num5 % 2==0){
            System.out.println(num5 + "is Even");  
        }else{
            System.out.println(num5 + "is odd");
        }
        
    }
    
}
