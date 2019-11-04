
import java.util.Scanner;


public class Task16 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num= s.nextInt();
        
        if((num %2==0)&&(num%5==0)){
            System.out.print("Null");    
        }else if (num % 2 ==0){
           System.out.print(num + " your number id multiple of 2"); 
        }else if (num % 5 ==0){
           System.out.print(num + " your number id multiple of 5"); 
        }else{
            System.out.print("Null");
            
        }
    }
    
}
