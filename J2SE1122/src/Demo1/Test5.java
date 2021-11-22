package Demo1;

public class Test5 {
    public static void main(String[] args) {
        Fool fool = new Fool() {
            @Override
            public void test() {
                System.out.println("hello world");
            }
        };
        fool.test();

        Cll cll = new Cll(){
            @Override
            public void ttt() {
                System.out.println("xxxxxxxxxxx");
            }
        };
        cll.ttt();
    }
}

interface Fool{
    public void test();
}

class Cll{
    public void ttt(){

    }
}