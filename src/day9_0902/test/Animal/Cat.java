package day9_0902.test.Animal;

/**
 * Created by º«²© on 2016/9/2.
 */
public class Cat extends Animal {
    String color;

    public Cat(int age) {
        super(age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println("³ÔµÄÊÇÓã");
    }
    public void bark(){
        System.out.println("ß÷ß÷½Ð");
    }

}
