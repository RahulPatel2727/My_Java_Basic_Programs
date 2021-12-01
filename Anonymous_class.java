// making interface useful by anonymous class
interface inf{
    void meth1();
    void meth2();
}
public class Anonymous {
    public static void main(String[] args) {
        inf obj = new inf () {
            @Override

            public void meth1() {
                System.out.println("i am meth 1");

            }

            @Override
            public void meth2() {
                System.out.println("meth 2");
            }
        };
obj . meth1();
obj.meth2();
        }
}
