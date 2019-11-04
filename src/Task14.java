
import java.util.Scanner;


public class Task14 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int num= s.nextInt();
        
        if(num%2==0){
            if(num>10){
                System.out.println("An even number greater 10");
            }else{
                System.out.println("An even number is not greater 10");
                
            }
        }else{
            if(num>10){
                System.out.println("An odd number is greater than 10"); 
            }else{
                System.out.println("An odd number is not greater than 10");
                
            }
        }
    }
    
}
