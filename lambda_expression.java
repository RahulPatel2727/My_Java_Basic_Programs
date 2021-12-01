interface Lambdaa{
    int  method(int a, long b, String s);
}
public class lambda {
    public static void main(String[] args) {
        Lambdaa obj = (a,b,c)->{
            System.out.println("Welcome in lambda expression "+c+" "+b+" "+a);
            System.out.println("hello");
            return 0;
        };
        obj.method(8,9,"Rahul Patel");
    }
}
