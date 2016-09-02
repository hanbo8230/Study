package day9_0902.test.Animal;

/**
 * Created by º«²© on 2016/9/2.
 */
public class Dog extends Animal {
    String color;


    public Dog(int age) {
        super(age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println("³ÔµÄÊÇ¹ÇÍ·");
    }
    public void bark(){
        System.out.println("ÍôÍô½Ð");
    }
}
