package basics;

import basics.impl.*;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        reverseString.reverse();

        ListFiles listFiles=new ListFiles();
        listFiles.javaFiles();

        Trigonometry trigonometry=new Trigonometry();
        trigonometry.findRatios();

        Dice dice=new Dice();
        dice.play();

        PresentWorkingDirectory presentWorkingDirectory=new PresentWorkingDirectory();
        presentWorkingDirectory.pwd();
    }
}
