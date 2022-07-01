package basics.impl;

import java.util.Scanner;

public class Trigonometry {
    public void findRatios(){
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        while(!line.equals("END")){
            double number=Double.parseDouble(line);
            System.out.println("sine..."+Math.sin(number));
            System.out.println("cos..."+Math.cos(number));
            System.out.println("tan..."+Math.tan(number));
            line=scanner.nextLine();
        }
        System.out.println("Exiting...");
    }
}
