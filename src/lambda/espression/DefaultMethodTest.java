package lambda.espression;

public class DefaultMethodTest implements Right, Left, Interf {

    @Override
    public void m() {
        // System.out.println("Override default method");
        Left.super.m();
    }

    public static void main(String... args) {
        DefaultMethodTest test = new DefaultMethodTest();
        test.m();
        // test.mstatic();
        // DefaultMethodTest.mstatic();
        Interf.mstatic(); // right way to declare
        // TestClass testClass = new TestClass();
    }
}

abstract class TestClass {

    public TestClass(){

    }
}

interface Right {
    default void m() {
        System.out.println("Right default method");
    }
}

interface Left {
    default void m() {
        System.out.println("Left default method");
    }
}

interface Interf {
    static void mstatic() {
        System.out.println("Static method...");
    }
}