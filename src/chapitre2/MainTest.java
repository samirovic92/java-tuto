package chapitre2;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {

        int a = 0b1_1;
        char b = 65;
        char c ='A';

        if ( (char)c == (char)b) {
            System.out.println((char)c + (char)b);
        }

        int $a = 12;
        long l = 12;
        float f = 12.9f;
        double d = 12.9;

        System.out.println((double)f);

        List<Integer> list = new ArrayList<Integer>();
        Integer intgr = Integer.valueOf(1);
        Integer intgr1 = Integer.parseInt("1");

        Boolean bol1 = new Boolean("false");
        Boolean bol2 = Boolean.FALSE;
        Boolean bol3 = Boolean.FALSE;
        int unbox = intgr.intValue();

        System.out.println("Compare == of boolean : " + (bol1 == bol2) );
        System.out.println("Compare == of boolean : " + (bol3 == bol2) );

        System.out.println(bol1);
        System.out.println(bol2);

        System.out.println(intgr);
        System.out.println((float)a);

        System.out.println((char)b);
        System.out.println((char)c);

    }
}
