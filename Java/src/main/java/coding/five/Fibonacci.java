package coding.five;

public class Fibonacci {
    public static void main(String[] args) {
        //Write a Java program to print a Fibonacci sequence using recursion.
        int a = 5;
        printFibSeries(5, 0, 1);
        printFibSeriesLoop(a);
    }

    private static void printFibSeriesLoop(int a) {
        if (a >= 1) {
            System.out.print(0 + " ");
        }
        if (a >= 2) {
            System.out.print(1 + " ");
        }
        int x = 0, y = 1;
        for (int i = 2; i < a; i++) {
            System.out.print((x + y) + " ");
            int t = x;
            x = y;
            y = t + y;
        }
    }

    private static void printFibSeries(int i, int a, int b) {
        if (i == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibSeries(i-1,b,a+b);
    }


}
