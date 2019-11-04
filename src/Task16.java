
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
public class Task16 {

    

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = s.nextInt();

        if ((num % 2 == 0) && (num % 5 == 0)) {
            System.out.println("Null");
        } else if (num % 2 == 0) {
            System.out.println(num + " Your Number is multiple of 2");
        } else if (num % 5 == 0) {
            System.out.println(num + " Your Number is multiple of 5");
        } else {
            System.out.println("Null");
        }

    }

}
