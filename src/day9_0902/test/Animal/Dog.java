package day9_0902.test.Animal;

/**
 * Created by ���� on 2016/9/2.
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
        System.out.println("�Ե��ǹ�ͷ");
    }
    public void bark(){
        System.out.println("������");
    }
}
