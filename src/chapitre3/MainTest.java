package chapitre3;

public class MainTest {

    int a;
    int c;

    {
        a = 12;
        int d = 12;
        if (d == 1) {
            System.out.println("d == " + d);
        }
    }

    {
        c = 13;
    }

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        m();
        //  m(a); it's should be static
    }

    static void m(int... a) {
        // int a = 1;
        System.out.println(a);
    }
}
