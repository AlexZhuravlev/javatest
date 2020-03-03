package mypackage;

public class Lesson32car implements Lesson32transport, Lesson32interface2 {

    @Override
    public void go() {
        System.out.println("We are driving");

    }

    @Override
    public void stop() {
        System.out.println("We are driving slower");

    }

    @Override
    public void method1() {
        System.out.println("method1");

    }

    @Override
    public void method2() {
        System.out.println("method2");

    }
}
