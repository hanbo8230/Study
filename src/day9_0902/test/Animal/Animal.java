package day9_0902.test.Animal;

/**
 * Created by ���� on 2016/9/2.
 */
public class Animal {
    public int age;

    //    public String pet;
//    Animal(String pet){
//        this.pet=pet;
//    }
    public Animal(int age) {
        this.age = age;
        System.out.println("����"+age);
    }

    public void eat() {
        System.out.println("�ԳԳ�");
    }

    public void bark() {
        System.out.println("�нн�");
    }

    public void sleep() {
        System.out.println("����˯");
    }

}
