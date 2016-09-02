package day9_0902.test.Animal;

/**
 * Created by º«²© on 2016/9/2.
 */
public class Animal {
    public int age;

    //    public String pet;
//    Animal(String pet){
//        this.pet=pet;
//    }
    public Animal(int age) {
        this.age = age;
        System.out.println("ÄêÁä"+age);
    }

    public void eat() {
        System.out.println("³Ô³Ô³Ô");
    }

    public void bark() {
        System.out.println("½Ğ½Ğ½Ğ");
    }

    public void sleep() {
        System.out.println("ÌÉ×ÅË¯");
    }

}
