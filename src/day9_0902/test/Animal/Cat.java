package day9_0902.test.Animal;

/**
 * Created by ���� on 2016/9/2.
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
        System.out.println("�Ե�����");
    }
    public void bark(){
        System.out.println("������");
    }

}
