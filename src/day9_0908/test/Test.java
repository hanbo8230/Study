package day9_0908.test;

/**
 * Created by º«²© on 2016/9/8.
 */
public class Test  {
    public static void main(String[] args) {
        Test test = new Test();
        test.go();
        A a=new B();

    }

    public void go() {
        int c = Constants.MAX - Constants.MIN;
        System.out.println(c);
    }
}
