package day9_0902.test.Animal;

import day9_0902.test.Animal.Animal;

/**
 * Created by º«²© on 2016/9/2.
 */
public class TestCatAndDog {
    public static void main(String[] args) {
        Cat cat = new Cat(20);
        cat.eat();
        cat.bark();
        cat.sleep();
        Dog dog=new Dog(10);
        dog.eat();
        dog.bark();
        dog.sleep();
    }
}
