package coding.one;

import java.util.Arrays;

public class ReverseString {
    //1. How do you reverse a string in Java?
    public static void main(String[] args) {
        String input = "manohar";
        String output = reverseStringLoop(input);
        System.out.println(output);
    }

    private static String reverseStringLoop(String input){
        if(input==null){
            throw new IllegalArgumentException("Null is not valid");
        }
        char[] chars= input.toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    private static String reverseString(String input) {
        if (input.length() == 1) {
            return input;
        }
        String lastChar=input.substring(input.length() - 1);
        return lastChar + reverseString(input.substring(0, input.length() - 1));
    }
}
