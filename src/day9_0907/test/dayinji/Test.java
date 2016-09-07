package day9_0907.test.dayinji;

/**
 * Created by º«²© on 2016/9/7.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.show(new HeiBai());
        test.show(new CaiSe());

    }

    public void show(DaYinJi x) {
        x.start();
        x.print();

    }
}
