package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a program that counts the number of different characters for each word in the specified input file.
 * Lower case, upper case characters are considered as same and do not care about any non-alphabetic
 * character.
 */
public class CharacterCount {
    public static void main(String[] args) {
        String str="My+ name= is** billa!";
        String[] strings=str.split(" ");
        for (String s:
             strings) {
            str= s.replaceAll("[^a-zA-Z0-9 ]","");
            Matcher m=Pattern.compile("[a-zA-Z0-9]").matcher(str);
            int c=0;
            while(m.find()){
                c++;
            }
            System.out.println(s+" = "+c);
        }
    }
}
