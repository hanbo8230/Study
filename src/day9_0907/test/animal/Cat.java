package day9_0907.test.animal;

/**
 * Created by ���� on 2016/9/7.
 */
public class Cat extends Animal {
    Cat(String name) {
        setName(name);
        setWuZhong("����:è");
    }


    @Override
    public void eat() {
        System.out.println("����");
    }

    @Override
    public void bark() {
        System.out.println("������");
    }

}
