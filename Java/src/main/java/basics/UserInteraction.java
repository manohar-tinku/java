package basics;

import java.io.Console;

public class UserInteraction {
    public static void main(String[] args) {
        Console c = System.console();
        if(c==null){
            return;
        }
        String line=c.readLine();
        System.out.println(line);
    }
}
