package lambda.espression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args){

        System.out.println("=========== Integer ===========");
        Predicate<Integer> p = I ->  I>10; ;
        System.out.println( p.test(100) );
        System.out.println( p.test(5) );

        System.out.println("=========== String ===========");
        Predicate<String> p1 = s -> s.length() > 5;
        System.out.println(p1.test("abcdef"));
        System.out.println(p1.test("abc"));

        System.out.println("=========== Collection ===========");
        List<Integer> list = new ArrayList<>();

        Predicate<Collection> p2 = collection -> collection.isEmpty();
        System.out.println(p2.test(list));
        list.add(12);
        System.out.println(p2.test(list));
        System.out.println(p2.negate().test(list));

        System.out.println("=========== Predicate Joining ===========");
        Predicate<Integer> p3 = I -> I % 2 == 0;
        int[] x = {12, 5, 2 , 8 } ;

        System.out.println("test negative predicate");
        m1(p.negate(), x);

        System.out.println("test and  predicate");
        m1(p.and(p3), x);

        System.out.println("test and  & negative predicate");
        m1(p.negate().and(p3), x);

        System.out.println("test or  predicate");
        m1(p.or(p3), x);

        System.out.println("=========== Predicate Exemple ===========");
        Predicate<User> p4 = user -> user.getPwd().equals("java") && user.getUsername().toLowerCase().equals("samir");
        User user = new User("Samir","java");
        System.out.println(p4.test(user));

        System.out.println("=========== Predicate Exemple ===========");
        Predicate<String> p5 = Predicate.isEqual("Samir");
        System.out.println(p5.test("Samir"));

    }

    public static void m1(Predicate<Integer> t, int[] listI){
        for( int x : listI){
            if (t.test(x)) System.out.println(x);
        }
    }
}
