import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Exception input Negative Radius, shown by toString method of Exception class";
    }

    @Override
    public String getMessage() {
        return "Exception Negative Radius Input";
    }
}
public class throw_Throws {
    public static double area(double a) throws NegativeRadiusException {
        if (a<0){
            throw new NegativeRadiusException();
        }
        double res = Math.PI * a * a;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        try {
            double ara=area(r);
            System.out.println(ara);
        }
        catch(NegativeRadiusException o){
            System.out.println( o.getMessage());
            System.out.println(o.toString());
            System.out.println(o);
        }
    }
}
