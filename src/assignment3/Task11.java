
package assignment3;

import java.util.Scanner;


public class Task11 {
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the 5 number :");
      int a,b,c,d,e,f;
      a=input.nextInt();
      b=input.nextInt();
      c=input.nextInt();
      d=input.nextInt();
      e=input.nextInt();
      f=(a+b+c+d+e)/5;
      System.out.println("The result is ="+f);
      
    }
    
}
