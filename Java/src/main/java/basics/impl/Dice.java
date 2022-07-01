package basics.impl;

import java.util.Random;
import java.util.Scanner;

/**
 *  Write an interactive dice throwing program. The program should ask the user for
 * a number of D6s to use, and prints its result on the screen. Use the
 * java.util.Random and java.io.Console classes for the implementation. The code
 * should run until the user specifies the empty string.
 */
public class Dice {
    public void play(){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equals("")){
            Random random=new Random();
            System.out.println(random.nextInt(5)+1);
            input=scanner.nextLine();
        }
    }
}
