package basics;

import basics.impl.ListFiles;
import basics.impl.ReverseString;
import basics.impl.Trigonometry;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        reverseString.reverse();

        ListFiles listFiles=new ListFiles();
        listFiles.javaFiles();

        Trigonometry trigonometry=new Trigonometry();
        trigonometry.findRatios();
    }
}
