package day9_0905.test.person;

/**
 * Created by º«²© on 2016/9/5.
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void out() {

        System.out.println("Ãû×Ö: " + name + " ÄêÁä: " + age);
    }

}
