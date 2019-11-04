
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
public class Task11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter your 1st number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter your 1st number: ");
        int num3 = scan.nextInt();

        System.out.print("Enter your 1st number: ");
        int num4 = scan.nextInt();

        System.out.print("Enter your 1st number: ");
        int num5 = scan.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("Average number is:" + (sum / 5));
    }

}
