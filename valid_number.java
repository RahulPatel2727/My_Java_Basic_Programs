/*
Write a program to check whether the given no is a valid mobile number or not? The mobile no is entered by the command line argument
 */

mport java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular4 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[0-9]{10}");
for (int i =0 ; i<args.length ;i++){
    if (args[i].length()==10){
        Matcher m= p.matcher(args[i]);
        if (m.find()) {
            System.out.println("yes this is a valid num.");
            System.out.println(m.group());
        }
        else System.out.println("not valid "+args[i]);
    }
    else System.out.println("not valid"+args[i]);
}

    }
}
