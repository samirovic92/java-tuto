package lambda.espression;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args){

        System.out.println("========== Function Interface ==========");
        Function<String, Integer> f1 = s -> s.length();

        System.out.println("The size of the sentence is : " + f1.apply("Hello World, I'm free :) ") );

        System.out.println("========== Function Interface : Chaining ==========");

        Function<String, String> f2 = s -> s.toUpperCase();

        System.out.println("f2 : " + f2.apply("Samirovic is free"));
        System.out.println("f1 and then f2 : " + f2.andThen(f1).apply("Samirovic is free"));

        System.out.println("========== Function Interface : identity ==========");

        Function<String, String> f3 = Function.identity();
        System.out.println(" identity method : " + f3.apply("samir"));
    }
}
