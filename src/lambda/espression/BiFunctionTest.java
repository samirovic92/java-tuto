package lambda.espression;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionTest {

    public static void main(String[] args) {

        System.out.println("========== BiPredicate ==========");
        BiPredicate<Integer, Integer> p1 = (a, b) -> {
            return a - b > 0;
        };
        System.out.println(p1.test(10, 20));

        System.out.println("========== BiFunction ==========");
        Employe e = new Employe(101, "Samir", 480);
        TimeSheet t = new TimeSheet(101, 20);
        BiFunction<Employe, TimeSheet, Double> f2 = (employe, timeSheet) -> employe.dailyWage * timeSheet.days;
        System.out.println("My next salary is " + f2.apply(e, t));

        System.out.println("========== BiConsumer ==========");
        BiConsumer<String, String> c1 = (a, b) -> System.out.println( a + " "+b);
        c1.accept("Hello", "World");
    }

    static class  Employe {
        int eno;
        String name;
        double dailyWage;

        public Employe(int eno, String name, double dailyWage) {
            this.eno = eno;
            this.name = name;
            this.dailyWage = dailyWage;
        }
    }
    static class TimeSheet {
        int eno;
        int days;

        public TimeSheet(int eno, int days) {
            this.eno = eno;
            this.days = days;
        }
    }
}
