package basics;

import java.util.Scanner;

/**
 *  Write a program that can check if a given number is a perfect number (a positive integer that is
 * equal to the sum of its proper positive divisors, 1 included, the number is excluded). The four
 * smallest such integers are 6, 28, 496, and 8128.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
