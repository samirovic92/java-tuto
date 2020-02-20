package lambda.espression;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(0, 100, 12, 52, 30, 45);
        Stream<Integer> s = l1.stream();

        System.out.println("====== Stream : filter exemple ======");
        List<Integer> l11 = s.filter( I -> I % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(l11);

        System.out.println("====== Stream : map exemple ======");
        List<Integer> l12 = l1.stream().map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println(l12);

        System.out.println("====== Stream : Count exemple ======");
        long count = l1.stream()
                .filter( i -> i< 40)
                .count();
        System.out.println("Count < 40 : " + count);

        System.out.println("====== Stream : Sorted exemple ======");
        List<Integer> l13 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println(l13);
        List<Integer> l14 = l1
                .stream()
                .sorted((I1, I2) -> -I1.compareTo(I2) )
                .collect(Collectors.toList());
        System.out.println(l14);

        System.out.println("====== Stream : Min & Max exemple ======");
        Integer min = l1.stream()
                .min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("The min value is : "+ min);

        Integer max = l1.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("The Max value is : " + max);

        System.out.println("====== Stream : toArray exemple ======");
        Integer[] ar = l1.stream().toArray(Integer[]::new);
        for (Integer a: ar ) {
            System.out.println(a);
        }
    }
}
