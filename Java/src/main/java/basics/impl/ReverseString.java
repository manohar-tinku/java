package basics.impl;

import java.util.Scanner;

/**
 *  Write an interactive program that reads a line from the console and writes its
 * reverse to the screen. Use the classes StringBuilder and java.io.Console. The
 * code should run until the user enters the empty string.
 */
public class ReverseString {
    public void reverse(){
        Scanner scanner=new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(scanner.nextLine());
        while (stringBuilder.length()!=0){
            System.out.println(stringBuilder.reverse().toString());
            stringBuilder.delete(0,stringBuilder.length());
            stringBuilder.append(scanner.nextLine());
        }
        System.out.println("Exiting...");
    }
}
