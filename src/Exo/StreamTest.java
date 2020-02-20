package Exo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args){

        System.out.println("======= Streams filter(), findAny() and orElse() =======");
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40),
                new Person("samirovic", 27)
        );

        Person person = persons.stream()
                .filter( p -> "mkyong".equals( p.getName() ))
                .findAny()
                .orElse(null);
        System.out.println(person);

        Predicate<Person> predicate = (p) -> "lawrence".equals( p.getName() );
        String names = persons.stream()
                .filter( p -> predicate.test(p) )
                .map(  Person::getName )
                .findAny()
                .orElse(null);
        System.out.println(names);

        System.out.println("======= Streams map() =======");
        List<String> upperCasenames = persons.stream()
                .map( p -> p.getName().toUpperCase() )
                .collect(Collectors.toList());

        System.out.println(upperCasenames);

        System.out.println("======= Streams Count() =======");
        long count = persons.stream()
                .count();
        System.out.println("count : " + count);

        System.out.println("======= Streams groupingBy() =======");
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting() )
                );

        System.out.println("======= Streams flatMap() =======");
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream<String> temp = Arrays.stream(data)
                .flatMap(Arrays::stream);
        String a = temp.filter(x -> "a".equals(x))
                .findFirst()
                .orElse(null);
        System.out.println(a);

        System.out.println("======= Streams reduce() =======");

        List<Integer> numbers = Arrays.asList(10, 34, 45, 2, 4, 12);
        int sum = numbers.stream()
                .reduce( 0 , Integer::sum )
                .intValue();
        System.out.println("sum = " + sum);
    }


}
