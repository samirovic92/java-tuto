package certif;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Test {


    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(0, new Dog());
        list.remove(new Dog());
        System.out.println(list);
    }

}

abstract class Animal {}
class Dog extends Animal{}

abstract class Super {
    public abstract void m1() throws Exception;
}

class Sub extends Super {
    @Override
    public void m1()  throws  FileNotFoundException{

    }
}

interface I1 {
    void m1() throws Exception;
}

class Mobile implements I1 {
    int a = 12;

    void m() {
        System.out.println(a);
    }

    ;

    @Override
    public void m1() throws Exception{

    }

    public void m2() throws NullPointerException {}
}

class Phone extends Mobile {
    int a = 15;
    public void m2() throws ArithmeticException{}
}
