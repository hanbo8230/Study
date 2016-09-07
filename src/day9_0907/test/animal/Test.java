package day9_0907.test.animal;

/**
 * Created by º«²© on 2016/9/7.
 */
public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        test.show(new Cat("123"));
    }

    public void show(Animal x){
        System.out.println(x.getName());
        System.out.println(x.getWuZhong());
        x.eat();
        x.bark();
        x.sleep();
    }
}
