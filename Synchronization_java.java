package Package;
class Account{
    int balance_amount;
    public Account(){
        balance_amount =10000;
    }

    public  synchronized void withdraw(int amount){
        try{
            Thread.sleep(10000);
        }
        catch ( InterruptedException e){
            e.printStackTrace();
        }
        balance_amount=balance_amount - amount;
        System.out.println(balance_amount);
    }
}
class Mythread extends Thread{
    Account obj=null;
    public Mythread(Account t1){
        obj=t1;
    }
    public void run (){
        obj.withdraw(500);
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) {
        Account a1= new Account();
        Mythread obj1 = new Mythread(a1);
        Mythread obj2 = new Mythread(a1);
        obj1.start();
        obj2.start();
    }
}
