package basics;

import basics.impl.ListFiles;
import basics.impl.ReverseString;

public class Main {
    public static void main(String[] args) {
        ReverseString reverseString=new ReverseString();
        reverseString.reverse();

        ListFiles listFiles=new ListFiles();
        listFiles.javaFiles();
    }
}
