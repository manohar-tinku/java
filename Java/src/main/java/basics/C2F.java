package basics;

/**
 * • Write a small program that accepts two, and only two command line arguments. If the first
 * parameter is 0, convert the second parameter from celsius to fahrenheit. Otherwise, do the
 * conversion backwards.
 * • The way to do the first conversion is the following:
 * C = (F-32) * 5 / 9
 */
public class C2F {
    public static void main(String[] args) {
        int check=Integer.parseInt(args[0]);
        if(check==0){
            int celsius=Integer.parseInt(args[1]);;
            int fahrenheit=((celsius*9)/5)+32;
            System.out.println(fahrenheit);
        }else{
            int fahrenheit=Integer.parseInt(args[1]);
            int celsius=(fahrenheit-32)*5/9;
            System.out.println(celsius);
        }
    }
}
