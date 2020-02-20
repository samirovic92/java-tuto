package lambda.espression;

public class AnonymousTest {

    int x = 888;
    public void m1() {
        IAN ian = () -> {
            int x = 999; // locale variable
            System.out.println(x);
            System.out.println(this.x);
        };
        ian.m();
    }
    public static void main(String... args){

        AnonymousTest test = new AnonymousTest();
        test.m1();
    }
}

interface IAN {

    void m();
}
