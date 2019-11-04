
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Task14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        
        if (num % 2 == 0) {
            if (num > 10) {
                
                System.out.println("An even number greter than10");
            } else {
                System.out.println("An even number is not greter than 10");
            }
        }else{
            
          if (num > 10) {
                    System.out.println("An odd number greater than10");
                } else {
                    System.out.println("An odd number is not greater than 10");

                }

            }
        }
    }


