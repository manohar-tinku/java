package basics;

import java.util.Scanner;

/**
 * 1. Write a function which evaluates the sum and avg of an array
 * 2. Write a function which norms the elements of an array (their sum ~= 1)
 * 3. Write a function which joins the elements of an array into one string. The separator character
 * must be optional, e.g.
 */
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length......");
        int length=scanner.nextInt();
        System.out.println("Enter values.....");
        double[] input=new double[length];
        for (int i = 0; i < length; i++) {
            input[i]=scanner.nextInt();
        }

        sumAndAverage(input);
        normalization(input);
        joins(input);
    }

    private static void joins(double[] input) {
        String s="";
        for (int i = 0; i < input.length-1; i++) {
            s=s+input[i];
            s=s+",";
        }
        s=s+input[input.length-1];
        System.out.println(s);
    }

    private static void normalization(double[] input) {
        double sum=0;
        for (int i = 0; i < input.length; i++) {
            sum+=input[i]*input[i];
        }
        double euclidLength=Math.sqrt(sum);
        sum=0;
        for (int i = 0; i < input.length; i++) {
            sum+=(input[i]/euclidLength)*(input[i]/euclidLength);
        }
        System.out.println(Math.sqrt(sum));

    }

    private static void sumAndAverage(double[] input) {
        double sum=0,avg;
        for (int i = 0; i < input.length; i++) {
            sum+=input[i];
        }
        System.out.println("sum..."+sum);
        System.out.println("avg..."+(sum/input.length));
    }
}
