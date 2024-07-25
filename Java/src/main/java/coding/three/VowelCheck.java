package coding.three;

public class VowelCheck {
    public static void main(String[] args) {
        //3. Write a Java program to check if a vowel is present in a string.
        String input = "mAr";
        vowelCountLoop(input);
        System.out.println(input.matches(".*[aeiouAEIOU].*"));
    }

    private static void vowelCountLoop(String input) {
        char[] chars = input.toCharArray();
        int vowelCount = 0;
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelCount++;
            }
        }
        if (vowelCount != 0) {
            System.out.println("Vowel: " + vowelCount);
        } else {
            System.out.println("No Vowel");
        }
    }
}
