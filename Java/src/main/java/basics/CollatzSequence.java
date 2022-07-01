package basics;

/**
 * Write a program that prints out the Collatz-sequence starting from a_0 = N (N<100 is a command line
 * argument and it must be checked) until a_n = 1. The sequence is generated in the following way:
 * Collatz-sequence
 * Sample output: > java Collatz 3
 * 3 10 5 16 8 4 2 1
 * > java Collatz 5
 * 5 16 8 4 2 1
 * > java Collatz 7
 * 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 */

public class CollatzSequence {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.print(input + " ");
        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
                System.out.print(input + " ");
            } else {
                input = input * 3 + 1;
                System.out.print(input + " ");
            }
        }
    }
}
