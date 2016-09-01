package day9_0901.test;

/**
 * Created by º«²© on 2016/9/1.
 */
public class A {
    public static void main(String args[]) {
        A a = new A();
        a.method(8);
    }

    void method(int i) {
        System.out.println("int:  " + i);
    }

    void method(long i) {
        System.out.println("long:  " + i);
    }
}