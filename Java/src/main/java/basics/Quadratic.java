package basics;

/**
 * Write a method with the following signature that can calculate the roots of a quadratic equation:
 * private static double[] sqroots(final double a, final double b, final double c) {
 * // ...
 * }
 * The return value of the function should be:
 * • An empty array (not null!) if a == 0 or the discriminant is negative
 * • An array with one element, if the discriminant is zero
 * • An array with two elements, if the discriminant is positive
 */
public class Quadratic {
    public static void main(String[] args) {
        double a=5,b=6,c=1;
        double[] ans=sqroots(a,b,c);
        if(ans.length!=0){
            for (int i = 0; i <ans.length ; i++) {
                System.out.println(ans[i]);
            }
        }
    }

    private static double[] sqroots(final double a, final double b, final double c) {
        double discriminant=(b*b)-4*a*c;
        if(discriminant<0 || a==0 ){
            return new double[]{};
        }
        else if(discriminant>0){
            double r1=(-b + Math.sqrt(discriminant))/(2*a);
            double r2=(-b - Math.sqrt(discriminant))/(2*a);
            return new double[]{r1,r2};
        }
        else {
            return new double[]{(-b)/(2*a)};
        }
    }
}
