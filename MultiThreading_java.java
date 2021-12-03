package Package;

class a extends Thread{
    public void m()
    {
        System.out.println("hello thread 1");
    }

    public void run(){
        int i=19;
        while (i>16){
        System.out.println("thread inbuilt");
        i--;
    }
}
}

class b extends Thread{
    public void m2(){
        System.out.println("method 2");
    }
    public void run(){
        System.out.println("inbuilt 2");
    }
        }

public class MultiThreading {
    public static void main(String[] args) {
        a obj = new a();
        b obj2 = new b();
        obj.start();
        obj2.start();
//        obj.m();
//        obj2.m2();
    }
}
