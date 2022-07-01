package basics;

import java.util.Scanner;

/**
 * Write a method that can calculate the greatest common divisor of two numbers
 * 40,20
 * 40=2*2*2*5
 * 20=2*2*5 (20)
 * 40%20==0 then 20 is the ans a%b==0
 * 5=1*5
 * 7=1*7
 * 7%5=2 -> 5%2=1 -> 2%1==0 then 1 is the ans
 */
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        gcfInterative(a, b);
        gcfRecursive(a,b);
    }

    private static void gcfRecursive(int a, int b) {
        if(b==0){
            System.out.println(a);
        }else {
            gcfRecursive(b, a % b);
        }
    }

    private static void gcfInterative(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}
