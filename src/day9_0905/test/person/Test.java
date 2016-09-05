package day9_0905.test.person;

/**
 * Created by 韩博 on 2016/9/5.
 */
public class Test extends Person {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 1);
        Person p2 = new Person("李四", 2);
        Person p3 = new Person("王二麻子", 3);
        Person arr[] = {p1, p2, p3};
        for (int x = 0; x < 3; x++) {
            arr[x].out();
        }
    }
}
