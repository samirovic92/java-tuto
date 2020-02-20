package java8.stream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // ------ Retrieving even number list -----
        List<Integer> list =
                Arrays.asList(3, 2, 12, 5, 6, 11, 13);
        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        evenList.forEach(System.out::println);

        // ------ Finding sum of all even numbers ------
        int sum = list.stream()
                .filter(i -> i % 2 == 0)
                .reduce(0, (old, newVal) -> old + newVal);
                /* .mapToInt(Integer::intValue)
                .sum(); */
        System.out.println("sum = " + sum);

        // ------ Finding whether all integers are less than 10 in the list ------
        boolean b = list.stream()
                .anyMatch(i -> i > 10);
        System.out.println("There some value greater thant 10 : " + b);

        // ------ Sequential vs Parallel streams ------
        String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        System.out.println("------- Running sequential -------");
         /*run(Arrays.stream(strings).sequential().peek(i -> {
            System.out.println("test pick" + i);
        })); */
        System.out.println("------- Running parallel -------");
        //run(Arrays.stream(strings).parallel());

        // ------ Intermediate short-circuiting methods ------
        Stream<Integer> streamInt = Stream.iterate(0, i -> i + 1);
        streamInt.limit(10)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        // ------ reduction ------
        int total  = IntStream.range(1, 10)
                .reduce( (sum1, x) -> sum1 + x)
                .orElse(-1);
        System.out.println(total);

        System.out.println("--- Min ------");
        String min = Stream.of("banana", "pie", "apple")
                .min(String::compareTo)
                .orElse("None");
        String min1 = Stream.of("banana", "pie", "apple")
                .reduce((s1, s2) -> s1.compareTo(s2) <= 0 ? s1 : s2)
                .orElse("None");
        System.out.println(min);
        System.out.println(min1);

        System.out.println("------ Mutable Reduction ------");
        List<String> list1 = Arrays.asList("Mike", "Nicki", "John");
        String s = list1.stream()
                .collect(StringBuilder::new,
                        (s1, s2) -> s1.append(" ").append(s2),
                        (s1, s2) -> s1.append(s1)).toString();
        System.out.println(s);
    }

    public static void run(Stream<String> stream) {

        stream.forEach(s -> {
            System.out.println(LocalTime.now() + " - value: " + s +
                    " - thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
