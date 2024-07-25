package coding.four;

public class PrimeNumber {
    public static void main(String[] args) {
        //4. Write a Java program to check if the given number is a prime number.
        int a=18;
        System.out.println(isPrimeNew(a));
    }

    private static boolean isPrime(int a) {
        if(a<=1)return false;
        if(a==2)return true;
        if(a%2==0) return false;
        for(int i=3;i*i<=a;i+=2){
            if(a%i==0)return false;
        }
        return true;
    }

    private static boolean isPrimeNew(int a){
        if(a<=1)return false;
        if(a<=3)return true;
        if(a%2==0 || a % 3 == 0)return false;
        for(int i=5;i*i<=a;i+=6){
            if(a%i==0 || a%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
