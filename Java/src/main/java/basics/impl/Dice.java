package basics.impl;

import java.util.Random;
import java.util.Scanner;

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
