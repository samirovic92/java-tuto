package lambda.espression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTest {

    public static void main(String... args) {

        System.out.println("========== Consumer Interface ==========");

        Consumer<String> c = s -> System.out.println(s);

        c.accept("New Begining ");

        List<Movie> movies = populate();

        Predicate<Integer> p1 = i -> i > 1500;

        Function<String, String> f1 = s -> s.toUpperCase();

        Consumer<Movie> c2 = m -> {
            if (p1.test(m.salaire)) {
                System.out.println("Film Name " + f1.apply(m.name));
                System.out.println("Hero Name " + m.hero);
                System.out.println();
            }
        };


        for (Movie m : movies) {
            c2.accept(m);
        }

        System.out.println("========== Consumer Chaining ==========");

        Consumer<Movie> c3 = m -> System.out.println("the movie : " + m.name + " is stored in DB");

        Consumer<Movie> chainedC = c2.andThen(c3);
        chainedC.accept(movies.get(0));
    }

    public static List<Movie> populate() {

        List<Movie> movies = Arrays.asList(new Movie[]{
                new ConsumerTest().new Movie("Dark night", "Joker", 1800),
                new ConsumerTest().new Movie("Interstellar", "Matthew", 2000),
                new ConsumerTest().new Movie("Inception", "DiCaprio", 1200)
        });

        return movies;
    }

    class Movie {

        String name;
        String hero;
        Integer salaire;

        public Movie(String name, String hero, Integer salaire) {
            this.name = name;
            this.hero = hero;
            this.salaire = salaire;
        }

    }

}

