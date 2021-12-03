package Package;



import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        //int a =20;
        Scanner s = new Scanner(System.in);
        try{
           // System.exit(0);
            int aa = s.nextInt();
            int b = s.nextInt();
            int arr[]={122,45,67,89,90};
            //throw new ArithmeticException("/ by zero");
            System.out.println(aa / b);//ArithmaticException because divide  by Zero
            int index= s.nextInt();
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(obj);
        }
        catch (ArithmeticException obj)//catch --> handler
        {
            System.out.println(obj);
        }
        catch (IllegalAccessError obj){
            System.out.println(obj);
        }
        catch (Exception obj){
            System.out.println(obj);
        }

//        finally {
//            System.out.println("this is finally block");
//        }


        System.out.println("end of the line");

//        Integer i1=78;//automatically boxing
//        int i2=i1;//automatically unboxing
//        System.out.println(i1.hashCode()+" "+i2);
        //boxing
//        Integer obj= Integer.valueOf(59);
//        Integer obj2 = Integer.valueOf(59);
//        System.out.println(obj.equals(obj2));
//        System.out.println(obj.equals(obj));
        //unboxing
//        Integer obj = 20;
//        double i= obj.floatValue();
//        System.out.println(i);
//        System.out.println(i/10);
    }
}

