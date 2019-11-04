
import java.util.Scanner;


public class Task17 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num= s.nextInt();
        
        if((num %2==0)&&(num%5==0)){
            System.out.print("\nYour Number is " +num);    
        }else if (num % 2 ==0){
           System.out.print(num + " your number id multiple of 2"); 
           
           
        }else{
            System.out.print("num");
            
        }
    }
    
}
