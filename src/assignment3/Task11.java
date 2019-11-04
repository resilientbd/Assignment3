package assignment3;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Enter 5 Value = ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        double f = (a + b + c + d + e) / 5;
        System.out.println("Average Value of = " + f);

    }

}
