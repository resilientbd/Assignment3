
import java.util.Scanner;


public class Task20 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int marks= s.nextInt();
        
        if(marks>50){
            System.out.print("Pass"); 
        }else{
            System.out.print("You sall not pass");
            
        }
    }
    
}
