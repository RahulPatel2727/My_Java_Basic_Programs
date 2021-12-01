//Program to check valid index number of an array till it will be a valid input
//package Exception;
import java.util.Scanner;
class Myexception extends Exception{

}
public class Exception_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = new int []{1,2,3,4,5,6,7};


        while (true)
        {
            System.out.println("Enter the value of index ");
            int index = sc.nextInt();
            try {
                 System.out.println("correct index number and the index value is " + arr[index]);
                 break;
            }catch(Exception e){
                     System.out.println("wrong index input");
                }
        }
    }
}
