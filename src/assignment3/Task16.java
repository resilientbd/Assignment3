
package assignment3;

import java.util.Scanner;




public class Task16 {
        public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       System.out.println("Enter the number ");
       int n=input.nextInt();
       for(int num=2; n>=num; num++)
       {
          if(num%2==0 || num%5==0)
          {
              if(num%2==0 && num%5==0)
              {
                  int x=num;
                  
              }
              else
              {
                  System.out.println("the number is "+num);
              }
         
              
              
       }
    }
    
}
}
