// program for the concept of constructor

import java.util.*;
import java.lang.*;

class Father{
    private String name;
    Father(){
        name = "MR. XYZ1234";
    }
    public String getName(){
        return name;
    }
}
class child extends Father{
    public int money;
    public String Company_name;
    child(){
        money = 1000000;
        Company_name = "ABC9876";

    }
    public void show(){
        System.out.println(money);
        System.out.println(Company_name);
        System.out.println(getName());
    }
}



public class Execute {
    public static void main(String[] args) {
        child obj = new child();
        obj.show();

    }
}
