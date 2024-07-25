package coding.two;

public class SwapNumber {
    public static void main(String[] args) {
        //How do you swap two numbers without using a third variable in Java?
        int a=2, b=3;
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
    }
}
