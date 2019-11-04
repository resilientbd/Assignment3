package assignment3;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of = ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("\t" + i);
            }
        }
    }
}
