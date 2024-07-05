package org.com;

public class Task11 {
    public static void main(String[] args) {
        //11. Display a 10x10 square of letters S using a while loop.
        // Do not separate letters in each line.

        int i = 1;
        while(i<=10) {
            System.out.println(printString());
            i++;
        }
    }
        public static String printString() {
            int n = 1;
            while (n <= 10) {
                System.out.print("S");
                n++;
            }
            return "";
        }
}
