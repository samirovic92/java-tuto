package chapitre5;

public class MainTest {
    public static void main(String[] args) {

        String var1 = "abc";

        switch (var1) {
            default :
                System.out.println("no element");
            case "abd":
                System.out.println("var1 == abd");
                //break;
            case "abc":
                System.out.println("var1 == abd");
               //
                // break;
            // case null:

        }

        int k = 10;
        if (k++ >10) System.out.println("k > 10");
        /* for (int i = 1, j = 1; m2(); m1()) {
        } */
        final int j ;
        j=1;
        /* switch (k){
            case j :
                System.out.println();
                break;
        } */

    }

    public static void m1() {
        System.out.println("hello world");
    }

    public static boolean m2() {
        return Boolean.TRUE;
    }
}
