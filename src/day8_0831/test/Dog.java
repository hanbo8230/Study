package day8_0831.test;

/**
 * Created by 韩博 on 2016/8/31.
 */
public class Dog {
    private String color;
    private int arg;
    private String name;
    private String breed;

    Dog(String color, int arg, String name, String breed) {
        this.color = color;
        this.arg = arg;
        this.name = name;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArg() {

        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showwInfo() {
        System.out.print("颜色: " + color + "\n年龄: " + arg + "\n名字: " + name + "\n品种: " + breed);
    }
}
