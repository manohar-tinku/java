package basics;

/**
 *  Write a program that prints the numbers from 1 to 100. If the number can be divided by three, print
 * "Fizz", if the number can be divided by five, print "Buzz" instead of the number. If both condition
 * holds, print "FizzBuzz" instead of the number.
 *
 * Sample output: 1 2 Fizz 4 Buzz ... 13 14 FizzBuzz
 */

public class FizzBuzzTest {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
            }
            else if(i%3==0){
                System.out.print("Fizz ");
            }
            else if(i%5==0){
                System.out.print("Buzz ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
