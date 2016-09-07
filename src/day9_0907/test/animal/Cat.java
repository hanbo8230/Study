package day9_0907.test.animal;

/**
 * Created by º«²© on 2016/9/7.
 */
public class Cat extends Animal {
    Cat(String name) {
        setName(name);
        setWuZhong("ÎïÖÖ:Ã¨");
    }


    @Override
    public void eat() {
        System.out.println("³ÔÓã");
    }

    @Override
    public void bark() {
        System.out.println("ß÷ß÷½Ğ");
    }

}
