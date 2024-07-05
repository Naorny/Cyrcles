package org.com;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //10. Enter a string and the number N from the keyboard.
        // Print the string N times using a while loop.
        // Example input:
        // abc
        // 2
        // Example output:
        // abv
        // abc

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println("Enter number N of the strings:");
        int n = scan.nextInt();

        System.out.println("Print the string N times:");
        int i = 1;
        while(i<=n) {
            System.out.println(str);
            i++;
        }
    }
}
