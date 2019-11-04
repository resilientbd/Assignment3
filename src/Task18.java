
import java.util.Scanner;


public class Task18 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num= s.nextInt();
        
        if((num %2==0)&&(num%5==0)){
            System.out.print("null");    
        }else{
            System.out.print("nYour Number 10" + num);
            
        }
    }
    
}
