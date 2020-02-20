package lambda.espression;

public class TestLambda {

    int x = 14;
    public static void main(String... args) {

        System.out.println(" ============ simple lambda ============");
        IA ia = () -> System.out.println("Hello Lambda");
        ia.m();

        System.out.println(" ============ Lambda with params ============");
        IB ib = (a, b) -> System.out.println("the sum is : " + (a + b));
        ib.sum(10, 20);

        System.out.println(" ============ lambda with return ============");
        IC ic = s -> s.length();
        System.out.println(ic.getLength("Hello"));


        System.out.println(" ============ Thread and lambda ============");
        Runnable run = () -> {
            int x = 12;
            for (int i = 0; i < 10; i++) {
                System.out.println("Child thread " + i);
            }
        };
        Thread thread1 = new Thread(run);
        // thread1.start();

    }
}

interface IA {
    void m();
}

interface IB {
    void sum(int a, int b);
}

interface IC {
    int getLength(String s);
}
