package Exo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        System.out.println(Planet.EARTH.equals(Planet.EARTH));
        System.out.println(Planet.EARTH == Planet.EARTH );
        int a = 2;
        System.out.println(2 >> 1);

        ArrayList l = new ArrayList(2);
        l.add(1);
        l.add(1);
        l.add(1);
        System.out.println(l.size());

        int[] ints = { 1, 20, 3, 10, -2, 100};
        System.out.println( sumRange(ints) );
    }

    static int sumRange(int[] ints) {

        int sam = 0;
        for (int i = 0; i < ints.length ; i++) {
            int n = ints[i];
            System.out.println("----- " +n);
            if (n >= 10 && n<=100) {
                System.out.println("+++++  " +n);
                sam += n;
            }
        }
        return sam;
    }
}
enum Planet {
    MERCURY, VENUS, EARTH
}
